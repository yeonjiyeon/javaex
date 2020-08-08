package ch12_layout;
import java.awt.*;
import java.awt.event.*;

public class Test04_Layout extends Frame{
	//����
	Panel pNorth,pSouth;
	Button b1,b2,b3,b4,b5;
	TextArea ta;
	
	//������
	public Test04_Layout(){
		super("Frame�� Panel��� ����");//ù�ٿ� �����ؾ� �Ѵ�, ����Ŭ���� ������ ȣ��
		
		this.setBackground(Color.pink);
		
		
		ta=new TextArea();
		
		b1=new Button("ù��°��ư");
		b2=new Button("�ι�°��ư");
		b3=new Button("����°��ư");
		b4=new Button("�׹�°��ư");
		b5=new Button("�ټ�°��ư");
		
		pNorth=new Panel();
		pSouth=new Panel();
		
		pNorth.setBackground(Color.white);
		pSouth.setBackground(Color.black);
		
		//�г� �����̳ʿ� ��ư���̱�
		pNorth.add(b1);
		pNorth.add(b2);
		pNorth.add(b3);
		pSouth.add(b4);
		pSouth.add(b5);
		
		//Frame�� panel���̱�
		this.add(pNorth,"North");
		this.add(pSouth,"South");
		ta.setFont(new Font("�ü�ü",Font.BOLD,100));
		this.add(ta,"Center");
		
		//�̺�Ʈ���
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
	
	//�޼���
	public static void main(String args[]){
		new Test04_Layout();
	}
}//class end
