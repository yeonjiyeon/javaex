package ch22_network;
//채팅
import java.net.*;
import java.io.*;
public class SimpleServer {
	public static void main(String args[])throws Exception{
		//변수
		ServerSocket ss=null;
		Socket s=null;
		
		//String msg="안녕하세요 127.0.0.1 서버입니다";//
		String msg="안녕하세요 localhost 서버입니다";//
		//String msg="안녕하세요 192.168.56.31 서버입니다";//클라이언트에게 보내려고 
		DataOutputStream dos=null;//writeUTF()
		DataInputStream dis=null;//readUTF()
		
		try{
			//ss=new ServerSocket(7777);//7777 서버포트 번호  
			ss=new ServerSocket(7777);
			System.out.println("서버구동중^^");
		}catch(Exception ex){
			System.out.println(ex);
		}//catch end
		
		while(true){
			try{
				s=ss.accept();//클라이언트의 접속을 받는다, 소켓연결을 한다 
				dos=new DataOutputStream(s.getOutputStream());
				dos.writeUTF(msg);//클라이언트로 전송
				
				//클라이언트가 보내준 메시지뿌리기
				dis=new DataInputStream(s.getInputStream());
				System.out.println(dis.readUTF());
				
				dos.close();
				dis.close();
				s.close();
			}catch(Exception ex2){
				System.out.println(ex2);
			}
		}//while end
		
	}//main end
}//class end
