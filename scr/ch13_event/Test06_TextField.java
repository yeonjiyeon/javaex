package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test06_TextField extends Frame implements ActionListener,TextListener{
	//����
	TextField tf;
	TextArea ta;
	
	//������
	public Test06_TextField(){
		super("TextField");
		
		tf=new TextField();
		ta=new TextArea();
		
		add(tf,"North");
		add(ta,"Center");
		
		//�̺�Ʈ ��� 
		addWindowListener(new Mywin());
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		
		
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
	public void actionPerformed(ActionEvent e){//����Ű �������� �̺�Ʈ�� �߻�
		ta.append("ActionEvent:"+tf.getText()+'\n');
		tf.setText("");
	}
	
	public void textValueChanged(TextEvent te){//���� ����� �� �̺�Ʈ�� �߻�
		ta.append("TextEvent:"+tf.getText()+'\n');
	}
	
	
	//main
	public static void main(String args[]){
	new Test06_TextField();
	}//main end
}//class end
