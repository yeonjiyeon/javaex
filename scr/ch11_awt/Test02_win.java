package ch11_awt;
import java.awt.*;
import java.awt.event.*;

//inner class�� ����Ͽ� â����
public class Test02_win extends Frame{
	//��������,Ŭ��������
	
	//������ �����ھȿ����� this ��������
	public Test02_win(){
		setTitle("inner class ����");
		addWindowListener(new Mywin());//�̺�Ʈ ��� 
		setBounds(200,200,300,300);//x,y,width, height
		setVisible(true);//âǥ�� //
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		//�ʿ��� �͸� �������̵��ϸ� �ȴ�
		public void windowClosing(WindowEvent we){
			System.exit(0); //���α׷�����
		}//--
	}//inner class end
	
    //�޼���
	//main
	public static void main(String args[]){
		new Test02_win();//��ü ����, ������ȣ��
	}
	

}//class end 
