package ch11_awt;
import java.awt.*;
import java.awt.event.*;

//�̸����� Ŭ����(����Ŭ����)����Ͽ� â����
public class Test03_win extends Frame{
	//����
	//������
	public Test03_win(){
		setTitle("����inner class ����");
		setBounds(300,300,300,300);//x,y,width,height
		setVisible(true);//âǥ��
		
		//�̺�Ʈ ���, â���� 
		addWindowListener(new WindowAdapter()
		{//���� inner class 
			//�������̵�
			public void windowClosing(WindowEvent we){
				System.exit(0);//���α׷� ����, â����
			}
			
		} 
		);
	}//cons end
	//�޼���
	//main
	public static void main(String args[]){
		new Test03_win();//��ü���� ,������ ȣ��
	}

}//class end
