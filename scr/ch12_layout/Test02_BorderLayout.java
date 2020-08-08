package ch12_layout;
import java.awt.*;
import java.awt.event.*;
public class Test02_BorderLayout extends Frame{
	//����
	Button b1,b2,b3,b4,b5;
	//������
	
	public Test02_BorderLayout(){
		super("BorderLayout ����");//ù�ٿ� �����ؾ� �Ѵ�, ���� Ŭ���� ������ ȣ��
		
		b1=new Button("ù��°��ư");
		b2=new Button("�ι�°��ư");
		b3=new Button("����°��ư");
		b4=new Button("�׹�°��ư");
		b5=new Button("�ټ�°��ư");
		
		//window<--Frame�迭�� BorderLayout�� ����Ʈ�̱� ������ 
		//setLayout(new BorderLayout());//�������� �ʾƵ� �ȴ�
		
		//�����̳�(Frame)�� ������Ʈ(��ư)���̱�
		//this.add(b1,"North");
		setLayout(new BorderLayout(50,50));
		
		this.add(b1,BorderLayout.NORTH);
		this.add(b2,"South");
		this.add(b3,"East");
		this.add(b4,"West");
		this.add(b5,"Center");
		
		addWindowListener(new Mywin());
		setSize(500,500);
		setVisible(true);
	}//cons end
	
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
		System.exit(0);
		}
  }//inner class end

	
	public static void main(String args[]){
		new Test02_BorderLayout();
	}//main end
}//class end