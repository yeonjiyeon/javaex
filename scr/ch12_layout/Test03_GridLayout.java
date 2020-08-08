package ch12_layout;
import java.awt.*;
import java.awt.event.*;
public class Test03_GridLayout extends Frame{
	//��������
	Button b1,b2,b3,b4,b5;
	
	//������
	public Test03_GridLayout(){
		super("GridLayout");//ù�ٿ� �����ؾ� �Ѵ�, ����Ŭ���� ������ ȣ��
		
		b1=new Button("ù��°��ư");
		b2=new Button("�ι�°��ư");
		b3=new Button("����°��ư");
		b4=new Button("�׹�°��ư");
		b5=new Button("�ټ�°��ư");
		
		this.setLayout(new GridLayout(3,2));//3��2���� ��ġ
		
		
		//�����̳�(Frame)�� ������Ʈ(��ư)���̱�
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		
		//�̺�Ʈ ���
		addWindowListener(new Mywin());
		setSize(500,500);
		setVisible(true);
	}//cons end
	
	
	//inner class
	class Mywin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	public static void main(String args[]){
		new Test03_GridLayout(); 
	}
	//�޼���
}//class end
