package ch13_event;
import java.awt.*;
import java.awt.event.*;

public class Test01_event extends Frame implements ActionListener{
	//����
	TextField tf1,tf2;
	TextArea ta;
	
	//������
	public Test01_event(){
		super("event ����1");//���� Ŭ���� ������ ȣ��, ù�ٿ� �����մϴ� 
		
		tf1=new TextField();//��ü����
		tf2=new TextField();
		ta=new TextArea();
		
		tf1.setBackground(Color.gray);
		tf2.setBackground(Color.blue);
		
		tf1.setFont(new Font("Dialog",Font.BOLD,20));
		tf2.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setEditable(false);//���� ���ϰ�
		
		//�����̳�(Frame)�� ������Ʈ(tf1,tf2,ta)���̱�
		//BorderLayout ����
		add(tf1,"North");
		add(ta,"Center");
		add(tf2,"South");
		
		
		//�̺�Ʈ ���
		tf1.addActionListener(this);
		tf2.addActionListener(this);
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
	//�޼���:�������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="��������>>"+tf1.getText();
			ta.append(msg+'\n');
			tf1.setText("");
			tf2.requestFocus();//��Ŀ�� ����
		}else if(e.getSource()==tf2){
			String msg="��Ʋ����>>"+tf2.getText();
			ta.append(msg+'\n');
			tf2.setText("");
			tf1.requestFocus();
		}
	}//actionPerformed() end
	
	
	
	//main
	public static void main(String args []){
		new Test01_event();//��ü ����,������ȣ��
	}//main end
	
}//class end
