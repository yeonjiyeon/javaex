package ch24_network;
/*
 * 프로토콜
 * 대기실 입장    100
 * 방만들기       200
 * 방들어가기    210
 * 대화하기       400
 * 귓속말         450
 * 방퇴장         290
 * 종료           900
 * 대화명이 같을 때 1000
 * 방제목이 같을 때 2000
 */
import java.awt.*;
import java.util.*;//vector
import java.net.*;
import java.io.*;

public class Server extends Frame implements Runnable{
	//변수
	Vector globalVec =new Vector();//입장하는 모든 클라이언트를 넣을 공간
	Vector roomVec = new Vector();//방이름 넣을 공간
	TextArea ta=new TextArea();//서버에 정보출력하려고
	
	//생성자
	public Server(){
		ta.setFont(new Font("Dialog",Font.BOLD,16));
		this.add("Center",ta); //컨테이너에 컴포넌트붙이기
		setBounds(200,100,600,500); //x,y,w,h
		//setSize(600,500);//w,h
		setVisible(true);//
	}//cons end
	//메서드
	//main()
	public static void main(String args[]){
		new Thread(new Server()).start();//run()호출
	}
	
	public void run(){
		ServerSocket ss=null;
		try{
			ss=new ServerSocket(7777);//서버구동 port 0~65535할 수 있으나 앞번호는 사용하고 있다
			System.out.println("서버구동중^&^");
		}catch(Exception ex){
			ta.append("서버구동실패:"+ex);
			System.exit(0);//프로그램종료
		}//catch end
		
		ta.append("서버실행되었음,,,,클라이언트기다리는중...\n");
		Socket s=null;
		
		while(true){
			try{
				s=ss.accept();//클라이언트 접속을 받고, 소켓연결
				ta.append("client 접속:"+s+"\n");
				Service ser=new Service(s);//Service inner class를 만들것이다
			}catch(Exception ex){}
		}//while end
	}//run end
	
	//inner class 
	class Service extends Thread{
		//변수
		BufferedReader in;
		OutputStream out;
		Room room=new Room();//대기실
		String name="";//대화명 넣을 변수
		
		//생성자
		public Service(Socket s){
			try{
				out=s.getOutputStream();//객체생성
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				name=in.readLine();//대화명
				room.title="대기실";
				
				//String ipp=s.getInetAddress().getHostAddress();//ip 얻기
				//if(ipp.equals("192.168.56.28")){
					//System.out.println("192.168.56.28은 ip로 사용불가능합니다");
				//putMsgTo("100|"192.168.56.28은 ip로 사용불가능합니다"");
				//return;
				//}
				
					
				}catch(Exception ex){
				ta.append("client와 연결 불안전"+s+"\n");
			}//catch end
			
			
				//모든 클라이언트에게 현재 접속자 자료를 보낸다
				for(int i=0;i<globalVec.size();i++){
					try{
					Service ser=(Service)globalVec.get(i);
					if(name.equals(ser.name)){
						putMsgTo("1000|"+name+"은 사용중인 대화명 입니다");
						return;
					}//if
					
					//pubMsgTo()메서드를 통해서 클라이언트로 보내다
					putMsgTo("100|"+ser.name+"|"+ser.room.title);
				}catch(Exception ex){}
				}//for end
				
				//현재 접속자에게 개설된 방정보를 보낸다
				for(int i=0;i<roomVec.size();i++){
				 Room r=(Room)roomVec.get(i);//방이름을 꺼내어
				 try{
					 putMsgTo("200|"+r.title+"|"+r.inwon);
				 }catch(Exception ex){}
				}//for end
				
				globalVec.add(this);//현재속한 클라이너트를 globalVec에 넣는다
				//현재 클라이언트가 대기실에 들어왔음을 모든 클라이언트에게 보낸다
				putMsgAll("100|"+name+"|"+room.title);//
				
				start();//run메서드 호출
		}//cons end
		//메서드
		public void run(){
			while(true){
				try{
					//변수
					String msg=in.readLine();//클라이언트가 보낸 내용을 받는다
					if(msg==null) return;
					
					StringTokenizer token=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(token.nextToken());
					
					switch(protocol){
					case 200:{//방만들기, 방만든 사람은 방들어가기도 동시에 한다
						String t=token.nextToken();//방제목
						String flag="";//변수
						for(int i=0;i<roomVec.size();i++){
							Room r=(Room)roomVec.get(i);
							if(t.equals(r.title)){//같은 방이름이 있으면
								putMsgTo("2000|"+t+"는 사용중인 대화방 입니다");
								flag="t";
								return;
							}//if end
						}//for end
						
						if(!flag.equals("t")){//사용중인 방이 아니면
							room=new Room(t,name,1);//방이름,방장이름,인원(처음 만든사람1)
							room.userVec.add(this);//대화방에 넣어준다, 현재 방을 들어온 사람을 
							roomVec.add(room);//방이름을 넣어준다, 지금 만든 것을 
							
							putMsgAll("200|"+room.title+"|"+0);//방이 개설되었음을 모든 클라이언트에게 보낸다
							putMsgAll("210|"+name+"|"+room.title);//방개설한 사람이 방들어가기  
						}//if end
						
						
						break;
					}//200 end
					
					case 210:{//이미 개설된 방에 들어가기, 
						String t=token.nextToken();//방제목
						for(int i=0;i<roomVec.size();i++){
							Room r=(Room)roomVec.get(i);//방이름을 꺼내고
							if(t.equals(r.title)){//방이름이 같으면
								room=r;
								room.userVec.add(this);//대화방에 넣어 준다
								room.inwon++;//인원증가
								
								//모든 클라이언트에게 지금 방에 들어온 사람을 알려준다
								putMsgAll("210|"+name+"|"+room.title);
								break;//for 탈출
							}//if
						}//for end
						break;
					}//210
					
					case 400:{//대화하기
						putMsgRoom("400|"+name+"님의 말>>"+token.nextToken());
						break;
					}//400
					
					case 290:{//방퇴장
						room.userVec.remove(this);//방에서 제거
						room.inwon=room.userVec.size();
						
						if(room.inwon==0){//혼자 있다가 나간 경우
							roomVec.remove(room);//방제거
						}//if
						
						//클라이언트가 방에서 나갔음을 모두에게 알린다
						putMsgAll("290|"+name+"|"+room.title);
						
						room=new Room();//
						room.title="대기실";
						
						break;
					}//290
					
					case 420:{//대화명 변경
						String newName=token.nextToken();//
						
						//모든 클라이언트에게 알려준다
						putMsgAll("420|"+name+"|"+newName+"|"+room.title);
						name=newName;
						break;
					}//420
					
					case 450:{//귓속말
						String sayName=token.nextToken();//귓속말 보낼 대상 
						String sayC=token.nextToken();//귓속말 내용
						
						//대화방에서 귓속말 보낼 상대를 찾아낸다 
						for(int i=0;i<room.userVec.size();i++){ 
			                
			                Service ser=(Service)room.userVec.get(i);
			                
			                if(sayName.equals(ser.name)){ 
			                  try{	
			                    ser.putMsgTo("450|"+name+"|"+sayC);
			                    
			                  }catch(Exception ex)
			                  {
			                	  room.userVec.remove(ser);
			                  }
			                  break;//for 탈출
			                }//if
			              }//for
						break;
					}//450
					
					case 900:{//종료( 채팅방사이트에서  나간 클라이언트 )
						 globalVec.remove(this);//전체 대기실에서 제거 
			              
			              //모든 클라이언트 에게 보내준다 
			              putMsgAll("900|"+name+"|"+room.title);//모두에게 알린다 
			              
			              if(!room.title.equals("대기실")){
			                //대화방에서 나갔으면
			                
			            	room.userVec.remove(this);//방에서 제거 
			                if(--room.inwon==0){
			                  roomVec.remove(room);//방제거 
			                }//if
			                try{
			                  in.close();
			                  out.close();
			                }catch(Exception ex){}
			              }//if
			              
						
						return;//서버는 서비스를 계속 해주어야 한다
					}//900 end
					}//switch() end
				}catch(Exception ex){
					return;//서버는 서비스를 계속 해주어야 한다
				}//catch end
			}//while() end
		}//run end------------------------------
		
		//사용자 정의 메서드
		public void putMsgAll(String msg){
			synchronized(this){
				for(int i=0;i<globalVec.size();i++){
					try{
						Service ser=(Service)globalVec.get(i);
						ser.putMsgTo(msg);//메서드호출
					}catch(Exception ex){
						globalVec.remove(i--);
					}//catch end
				}//for end
			}//synchronized(this) end
		}//pubMsgAll() end
		
		//사용자 정의 메서드
		public void putMsgRoom(String msg){
			synchronized(this){
				for(int i=0;i<room.userVec.size();i++){
					try{
						Service ser=(Service)room.userVec.get(i);
						ser.putMsgTo(msg);//메서드홀출
					}catch(Exception ex){
						room.userVec.remove(i--);
					}//catch() end
				}//for end
			}//synchronized(this)
		}//putMsgRoom() end
		
		
		//사용자 정의 메서드, 여기서 클라이언트로 보낸다
		public void putMsgTo(String msg) throws Exception{
			synchronized(this){
				out.write((msg+"\r\n").getBytes());//***************
				//getBytes()는 인코딩처리(한글 처리 처리 )
			}//synchronized(this) end
		}//putMsgTo() end
		
		
	}//Service inner class end
	
	
}//Server class end
