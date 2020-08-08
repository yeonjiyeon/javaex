package ch22_network;
//ä��
import java.net.*;
import java.io.*;
public class SimpleServer {
	public static void main(String args[])throws Exception{
		//����
		ServerSocket ss=null;
		Socket s=null;
		
		//String msg="�ȳ��ϼ��� 127.0.0.1 �����Դϴ�";//
		String msg="�ȳ��ϼ��� localhost �����Դϴ�";//
		//String msg="�ȳ��ϼ��� 192.168.56.31 �����Դϴ�";//Ŭ���̾�Ʈ���� �������� 
		DataOutputStream dos=null;//writeUTF()
		DataInputStream dis=null;//readUTF()
		
		try{
			//ss=new ServerSocket(7777);//7777 ������Ʈ ��ȣ  
			ss=new ServerSocket(7777);
			System.out.println("����������^^");
		}catch(Exception ex){
			System.out.println(ex);
		}//catch end
		
		while(true){
			try{
				s=ss.accept();//Ŭ���̾�Ʈ�� ������ �޴´�, ���Ͽ����� �Ѵ� 
				dos=new DataOutputStream(s.getOutputStream());
				dos.writeUTF(msg);//Ŭ���̾�Ʈ�� ����
				
				//Ŭ���̾�Ʈ�� ������ �޽����Ѹ���
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
