package ch22_network;
import java.net.*;
import java.io.*;
public class SimpleClient {
	public static void main(String args[])throws Exception{
		
		//����
		Socket s=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		String msg="Ŭ���̾�Ʈ 127.0.0.1 �Դϴ�"+args[1];//Ŭ���̾�Ʈ�� ������
		//String msg="Ŭ���̾�Ʈ localhost �Դϴ�"+args[1];// args[1]:127.0.0.1
		//String msg="Ŭ���̾�Ʈ 192.168.56.31 �Դϴ�"+args[1];//args[1]�޽����Է��Ϸ���
		try{
			//s=new Socket(ip,server port);
			s=new Socket(args[0],7777);

			dis=new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());//�����κ��� ���� ���� ���

			dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF(msg);//������ ������

			dis.close();
			dos.close();
			s.close();
			
		}catch(Exception ex){
			System.out.println(ex);
		}
	}//main end
}//class end
