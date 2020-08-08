package ch12_layout;
import java.awt.*;
import java.awt.event.*;
//â ����
public class Test01_flow extends Frame{
	//����
	Button b1,b2,b3,b4,b5;
	
	//������: ��ü �ʱ�ȭ�� �����̴�
	public Test01_flow(){
		super("FlowLayout ����");//���� Ŭ���� ������ ȣ��, ù�ٿ� �����ؾ� �Ѵ�
		
		b1=new Button("ù��°��ư");
		b2=new Button("�ι�°��ư");
		b3=new Button("����°��ư");
		b4=new Button("�׹�°��ư");
		b5=new Button("�ټ�°��ư");
		
		// Window <-- Frame �� BorderLayout�̴�
		// �츮�� FlowLayout�� ����մϴ�
		//this.setLayout(new FlowLayout());//����Ʈ�� �ƴ϶� ���� �ؾ� �Ѵ� 
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 50,50));//����Ʈ�� �ƴ϶� ���� �ؾ� �Ѵ�
		
		//�����̳�(Frame)�� ������Ʈ(��ư) ���̱�
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		
		//�̺�Ʈ ��� 
		addWindowListener(new MyWin());
		setSize(500,500);//âũ��
		setVisible(true);//âǥ��
	}//cons end
	
	//inner class
	class MyWin extends WindowAdapter{
		//�������̵� : ��� ���� �޼��� ���� ������ �ϴ� ���̴�
		public void windowClosing(WindowEvent we){
			System.exit(0);//���α׷� ����
		}
	}//class end
	//method
	
	//main
	public static void main(String args[]){
		new Test01_flow();
	}
}//class end
 