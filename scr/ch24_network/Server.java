package ch24_network;
/*
 * ��������
 * ���� ����    100
 * �游���       200
 * �����    210
 * ��ȭ�ϱ�       400
 * �ӼӸ�         450
 * ������         290
 * ����           900
 * ��ȭ���� ���� �� 1000
 * �������� ���� �� 2000
 */
import java.awt.*;
import java.util.*;//vector
import java.net.*;
import java.io.*;

public class Server extends Frame implements Runnable{
	//����
	Vector globalVec =new Vector();//�����ϴ� ��� Ŭ���̾�Ʈ�� ���� ����
	Vector roomVec = new Vector();//���̸� ���� ����
	TextArea ta=new TextArea();//������ ��������Ϸ���
	
	//������
	public Server(){
		ta.setFont(new Font("Dialog",Font.BOLD,16));
		this.add("Center",ta); //�����̳ʿ� ������Ʈ���̱�
		setBounds(200,100,600,500); //x,y,w,h
		//setSize(600,500);//w,h
		setVisible(true);//
	}//cons end
	//�޼���
	//main()
	public static void main(String args[]){
		new Thread(new Server()).start();//run()ȣ��
	}
	
	public void run(){
		ServerSocket ss=null;
		try{
			ss=new ServerSocket(7777);//�������� port 0~65535�� �� ������ �չ�ȣ�� ����ϰ� �ִ�
			System.out.println("����������^&^");
		}catch(Exception ex){
			ta.append("������������:"+ex);
			System.exit(0);//���α׷�����
		}//catch end
		
		ta.append("��������Ǿ���,,,,Ŭ���̾�Ʈ��ٸ�����...\n");
		Socket s=null;
		
		while(true){
			try{
				s=ss.accept();//Ŭ���̾�Ʈ ������ �ް�, ���Ͽ���
				ta.append("client ����:"+s+"\n");
				Service ser=new Service(s);//Service inner class�� ������̴�
			}catch(Exception ex){}
		}//while end
	}//run end
	
	//inner class 
	class Service extends Thread{
		//����
		BufferedReader in;
		OutputStream out;
		Room room=new Room();//����
		String name="";//��ȭ�� ���� ����
		
		//������
		public Service(Socket s){
			try{
				out=s.getOutputStream();//��ü����
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				name=in.readLine();//��ȭ��
				room.title="����";
				
				//String ipp=s.getInetAddress().getHostAddress();//ip ���
				//if(ipp.equals("192.168.56.28")){
					//System.out.println("192.168.56.28�� ip�� ���Ұ����մϴ�");
				//putMsgTo("100|"192.168.56.28�� ip�� ���Ұ����մϴ�"");
				//return;
				//}
				
					
				}catch(Exception ex){
				ta.append("client�� ���� �Ҿ���"+s+"\n");
			}//catch end
			
			
				//��� Ŭ���̾�Ʈ���� ���� ������ �ڷḦ ������
				for(int i=0;i<globalVec.size();i++){
					try{
					Service ser=(Service)globalVec.get(i);
					if(name.equals(ser.name)){
						putMsgTo("1000|"+name+"�� ������� ��ȭ�� �Դϴ�");
						return;
					}//if
					
					//pubMsgTo()�޼��带 ���ؼ� Ŭ���̾�Ʈ�� ������
					putMsgTo("100|"+ser.name+"|"+ser.room.title);
				}catch(Exception ex){}
				}//for end
				
				//���� �����ڿ��� ������ �������� ������
				for(int i=0;i<roomVec.size();i++){
				 Room r=(Room)roomVec.get(i);//���̸��� ������
				 try{
					 putMsgTo("200|"+r.title+"|"+r.inwon);
				 }catch(Exception ex){}
				}//for end
				
				globalVec.add(this);//������� Ŭ���̳�Ʈ�� globalVec�� �ִ´�
				//���� Ŭ���̾�Ʈ�� ���ǿ� �������� ��� Ŭ���̾�Ʈ���� ������
				putMsgAll("100|"+name+"|"+room.title);//
				
				start();//run�޼��� ȣ��
		}//cons end
		//�޼���
		public void run(){
			while(true){
				try{
					//����
					String msg=in.readLine();//Ŭ���̾�Ʈ�� ���� ������ �޴´�
					if(msg==null) return;
					
					StringTokenizer token=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(token.nextToken());
					
					switch(protocol){
					case 200:{//�游���, �游�� ����� ����⵵ ���ÿ� �Ѵ�
						String t=token.nextToken();//������
						String flag="";//����
						for(int i=0;i<roomVec.size();i++){
							Room r=(Room)roomVec.get(i);
							if(t.equals(r.title)){//���� ���̸��� ������
								putMsgTo("2000|"+t+"�� ������� ��ȭ�� �Դϴ�");
								flag="t";
								return;
							}//if end
						}//for end
						
						if(!flag.equals("t")){//������� ���� �ƴϸ�
							room=new Room(t,name,1);//���̸�,�����̸�,�ο�(ó�� ������1)
							room.userVec.add(this);//��ȭ�濡 �־��ش�, ���� ���� ���� ����� 
							roomVec.add(room);//���̸��� �־��ش�, ���� ���� ���� 
							
							putMsgAll("200|"+room.title+"|"+0);//���� �����Ǿ����� ��� Ŭ���̾�Ʈ���� ������
							putMsgAll("210|"+name+"|"+room.title);//�氳���� ����� �����  
						}//if end
						
						
						break;
					}//200 end
					
					case 210:{//�̹� ������ �濡 ����, 
						String t=token.nextToken();//������
						for(int i=0;i<roomVec.size();i++){
							Room r=(Room)roomVec.get(i);//���̸��� ������
							if(t.equals(r.title)){//���̸��� ������
								room=r;
								room.userVec.add(this);//��ȭ�濡 �־� �ش�
								room.inwon++;//�ο�����
								
								//��� Ŭ���̾�Ʈ���� ���� �濡 ���� ����� �˷��ش�
								putMsgAll("210|"+name+"|"+room.title);
								break;//for Ż��
							}//if
						}//for end
						break;
					}//210
					
					case 400:{//��ȭ�ϱ�
						putMsgRoom("400|"+name+"���� ��>>"+token.nextToken());
						break;
					}//400
					
					case 290:{//������
						room.userVec.remove(this);//�濡�� ����
						room.inwon=room.userVec.size();
						
						if(room.inwon==0){//ȥ�� �ִٰ� ���� ���
							roomVec.remove(room);//������
						}//if
						
						//Ŭ���̾�Ʈ�� �濡�� �������� ��ο��� �˸���
						putMsgAll("290|"+name+"|"+room.title);
						
						room=new Room();//
						room.title="����";
						
						break;
					}//290
					
					case 420:{//��ȭ�� ����
						String newName=token.nextToken();//
						
						//��� Ŭ���̾�Ʈ���� �˷��ش�
						putMsgAll("420|"+name+"|"+newName+"|"+room.title);
						name=newName;
						break;
					}//420
					
					case 450:{//�ӼӸ�
						String sayName=token.nextToken();//�ӼӸ� ���� ��� 
						String sayC=token.nextToken();//�ӼӸ� ����
						
						//��ȭ�濡�� �ӼӸ� ���� ��븦 ã�Ƴ��� 
						for(int i=0;i<room.userVec.size();i++){ 
			                
			                Service ser=(Service)room.userVec.get(i);
			                
			                if(sayName.equals(ser.name)){ 
			                  try{	
			                    ser.putMsgTo("450|"+name+"|"+sayC);
			                    
			                  }catch(Exception ex)
			                  {
			                	  room.userVec.remove(ser);
			                  }
			                  break;//for Ż��
			                }//if
			              }//for
						break;
					}//450
					
					case 900:{//����( ä�ù����Ʈ����  ���� Ŭ���̾�Ʈ )
						 globalVec.remove(this);//��ü ���ǿ��� ���� 
			              
			              //��� Ŭ���̾�Ʈ ���� �����ش� 
			              putMsgAll("900|"+name+"|"+room.title);//��ο��� �˸��� 
			              
			              if(!room.title.equals("����")){
			                //��ȭ�濡�� ��������
			                
			            	room.userVec.remove(this);//�濡�� ���� 
			                if(--room.inwon==0){
			                  roomVec.remove(room);//������ 
			                }//if
			                try{
			                  in.close();
			                  out.close();
			                }catch(Exception ex){}
			              }//if
			              
						
						return;//������ ���񽺸� ��� ���־�� �Ѵ�
					}//900 end
					}//switch() end
				}catch(Exception ex){
					return;//������ ���񽺸� ��� ���־�� �Ѵ�
				}//catch end
			}//while() end
		}//run end------------------------------
		
		//����� ���� �޼���
		public void putMsgAll(String msg){
			synchronized(this){
				for(int i=0;i<globalVec.size();i++){
					try{
						Service ser=(Service)globalVec.get(i);
						ser.putMsgTo(msg);//�޼���ȣ��
					}catch(Exception ex){
						globalVec.remove(i--);
					}//catch end
				}//for end
			}//synchronized(this) end
		}//pubMsgAll() end
		
		//����� ���� �޼���
		public void putMsgRoom(String msg){
			synchronized(this){
				for(int i=0;i<room.userVec.size();i++){
					try{
						Service ser=(Service)room.userVec.get(i);
						ser.putMsgTo(msg);//�޼���Ȧ��
					}catch(Exception ex){
						room.userVec.remove(i--);
					}//catch() end
				}//for end
			}//synchronized(this)
		}//putMsgRoom() end
		
		
		//����� ���� �޼���, ���⼭ Ŭ���̾�Ʈ�� ������
		public void putMsgTo(String msg) throws Exception{
			synchronized(this){
				out.write((msg+"\r\n").getBytes());//***************
				//getBytes()�� ���ڵ�ó��(�ѱ� ó�� ó�� )
			}//synchronized(this) end
		}//putMsgTo() end
		
		
	}//Service inner class end
	
	
}//Server class end
