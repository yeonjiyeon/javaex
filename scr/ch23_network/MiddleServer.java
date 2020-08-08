package ch23_network;
import java.io.*;
import java.awt.*;
import java.net.*;
import java.util.*;

public class MiddleServer extends Frame{
	//변수
	public TextArea ta;
	
	//생성자
	public MiddleServer(){
		setTitle("채팅방 관리");
		this.add("Center",ta=new TextArea());
		ta.setEditable(false);//편집못하게 
	}//cons end
	
	
	//메서드 오버라이딩
	
	//main
	public static void main(String args[]){
		if(args.length !=1){
			System.out.println("입력에러, 사용법: java 패키지.MiddleServer 포트번호");
			System.exit(0);
		}
		
		//정상처리
		MiddleServer ms=new MiddleServer();//객체 생성
		ms.setSize(500,500);
		ms.setVisible(true);
		
		int i=1;//첩속한 인원 넣을 변수
		
		try{
			ServerSocket ss=new ServerSocket(Integer.parseInt(args[0]));//args[0]:port 번호
			System.out.println("서버구동중^^");
			
			while(true){
				Socket s=ss.accept();//클라이언트접속을 받아서, 소캣연결을 해준다
				ms.ta.append(1+"번째 손님이 방문했음\t"+s+"\n");
				new Handler(s,i,ms.ta).start();//Handler객체생성하고 run메서드홏루
				i++;//인원증가
			}//while end
		}catch(Exception ex){}
	}//main end
}//class end

class Handler extends Thread{
	//변수
	private int number;//인원수 넣을 변수
	static private Vector vec=new Vector();
	private TextArea ta;
	
	private Socket sock;
	private DataInputStream in;
	private DataOutputStream out;
	
	//생성자
	public Handler(Socket s,int num, TextArea ta) throws Exception{
		sock=s;
		number=num;
		this.ta=ta;
		
		in=new DataInputStream(sock.getInputStream());//입력
		out=new DataOutputStream(sock.getOutputStream());//내보내고
	}//cons end
	
	//run() 오버라이딩
	
	public void run(){
		try{
			vec.add(this);//현재 접속자를 vec에 넣는다
			
			while(true){
				String msg=in.readUTF();//클라이언트가 보내는 내용을 받아서 msg변수에 넣고 
				toMsg(msg);//메서드를 호출 toMsg()메서드에서는 모든 클라이언트에게 메시지를 보낸다
			}//while end
			
		}catch(IOException ex){
			ta.append(number+"번째 손님이 퇴실하였습니다");
			toMsg(number+"번째 손님이 퇴실하였습니다");//모든 클리이언트에게 알려주려고메서드 호출
			vec.remove(this);//현재 퇴실한 사람을 vec에서 제거
			
			try{
				sock.close();//지금 퇴실한 사람의 소캣을 끊어준다
			}catch(IOException ex3){
				
			}//catch end
			System.out.println("소캣을 닫는 중 예외 발생:"+ex);
		}//catch end
	}//run end
	
	//사용자정의 메서드
	//이 메서드는 클라이언트로 대화 내용을 보내려고
	private void toMsg(String msg){
		synchronized(vec){
			Enumeration en=vec.elements();//vec에 클라이언트들을 꺼내는 작업을 하기 위해
			while(en.hasMoreElements()){
				Handler temp=(Handler)en.nextElement();

				try{
					temp.out.writeUTF(msg);//msg를 클라이언트에게 보낸다, 핵심
				}catch(IOException ex){
					try{
						sock.close();
					}catch(IOException ex3){}

					System.out.println("클라이언트 메시지를 출력하던 중 예외 발생:"+ex);
				}//catch
			}//while end
		}//synchronized
	} //toMsg()end
}//class end