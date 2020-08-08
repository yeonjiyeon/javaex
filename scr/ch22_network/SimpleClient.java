package ch22_network;
import java.net.*;
import java.io.*;
public class SimpleClient {
	public static void main(String args[])throws Exception{
		
		//변수
		Socket s=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		String msg="클라이언트 127.0.0.1 입니다"+args[1];//클라이언트로 보내짐
		//String msg="클라이언트 localhost 입니다"+args[1];// args[1]:127.0.0.1
		//String msg="클라이언트 192.168.56.31 입니다"+args[1];//args[1]메시지입력하려고
		try{
			//s=new Socket(ip,server port);
			s=new Socket(args[0],7777);

			dis=new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());//서버로부터 받은 내용 출력

			dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF(msg);//서버로 보내기

			dis.close();
			dos.close();
			s.close();
			
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main end
}//class end
