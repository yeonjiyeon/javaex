package ch23_network;
import java.io.*;
import java.awt.*;
import java.net.*;
import java.util.*;

public class MiddleServer extends Frame{
	//����
	public TextArea ta;
	
	//������
	public MiddleServer(){
		setTitle("ä�ù� ����");
		this.add("Center",ta=new TextArea());
		ta.setEditable(false);//�������ϰ� 
	}//cons end
	
	
	//�޼��� �������̵�
	
	//main
	public static void main(String args[]){
		if(args.length !=1){
			System.out.println("�Է¿���, ����: java ��Ű��.MiddleServer ��Ʈ��ȣ");
			System.exit(0);
		}
		
		//����ó��
		MiddleServer ms=new MiddleServer();//��ü ����
		ms.setSize(500,500);
		ms.setVisible(true);
		
		int i=1;//ø���� �ο� ���� ����
		
		try{
			ServerSocket ss=new ServerSocket(Integer.parseInt(args[0]));//args[0]:port ��ȣ
			System.out.println("����������^^");
			
			while(true){
				Socket s=ss.accept();//Ŭ���̾�Ʈ������ �޾Ƽ�, ��Ĺ������ ���ش�
				ms.ta.append(1+"��° �մ��� �湮����\t"+s+"\n");
				new Handler(s,i,ms.ta).start();//Handler��ü�����ϰ� run�޼����M��
				i++;//�ο�����
			}//while end
		}catch(Exception ex){}
	}//main end
}//class end

class Handler extends Thread{
	//����
	private int number;//�ο��� ���� ����
	static private Vector vec=new Vector();
	private TextArea ta;
	
	private Socket sock;
	private DataInputStream in;
	private DataOutputStream out;
	
	//������
	public Handler(Socket s,int num, TextArea ta) throws Exception{
		sock=s;
		number=num;
		this.ta=ta;
		
		in=new DataInputStream(sock.getInputStream());//�Է�
		out=new DataOutputStream(sock.getOutputStream());//��������
	}//cons end
	
	//run() �������̵�
	
	public void run(){
		try{
			vec.add(this);//���� �����ڸ� vec�� �ִ´�
			
			while(true){
				String msg=in.readUTF();//Ŭ���̾�Ʈ�� ������ ������ �޾Ƽ� msg������ �ְ� 
				toMsg(msg);//�޼��带 ȣ�� toMsg()�޼��忡���� ��� Ŭ���̾�Ʈ���� �޽����� ������
			}//while end
			
		}catch(IOException ex){
			ta.append(number+"��° �մ��� ����Ͽ����ϴ�");
			toMsg(number+"��° �մ��� ����Ͽ����ϴ�");//��� Ŭ���̾�Ʈ���� �˷��ַ���޼��� ȣ��
			vec.remove(this);//���� ����� ����� vec���� ����
			
			try{
				sock.close();//���� ����� ����� ��Ĺ�� �����ش�
			}catch(IOException ex3){
				
			}//catch end
			System.out.println("��Ĺ�� �ݴ� �� ���� �߻�:"+ex);
		}//catch end
	}//run end
	
	//��������� �޼���
	//�� �޼���� Ŭ���̾�Ʈ�� ��ȭ ������ ��������
	private void toMsg(String msg){
		synchronized(vec){
			Enumeration en=vec.elements();//vec�� Ŭ���̾�Ʈ���� ������ �۾��� �ϱ� ����
			while(en.hasMoreElements()){
				Handler temp=(Handler)en.nextElement();

				try{
					temp.out.writeUTF(msg);//msg�� Ŭ���̾�Ʈ���� ������, �ٽ�
				}catch(IOException ex){
					try{
						sock.close();
					}catch(IOException ex3){}

					System.out.println("Ŭ���̾�Ʈ �޽����� ����ϴ� �� ���� �߻�:"+ex);
				}//catch
			}//while end
		}//synchronized
	} //toMsg()end
}//class end