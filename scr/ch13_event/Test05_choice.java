package ch13_event;
import java.awt.*;
import java.awt.event.*;

public class Test05_choice extends Frame implements ItemListener{
	//����
	Choice ch;
	Label label=new Label("����",Label.CENTER);
	
	//������
	public Test05_choice(){
		super("choice����");
		
		ch=new Choice();
		ch.addItem("����");//�׸��߰�
		ch.addItem("���");//�׸��߰�
		ch.addItem("����");//�׸��߰�
		
		label.setForeground(Color.blue);
		label.setFont(new Font("Dialog",Font.BOLD,72));
		
		//�����ӿ� ������Ʈ ���̱�
		add(ch,"North");
		add(label,"Center");
		
		
		//�̺�Ʈ���
		addWindowListener(new Mywin());
		ch.addItemListener(this);
		
		setSize(500,500);
		setVisible(true);
	}//cons end
	//inner class 
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//�޼ҵ�:�������̵�
	public void itemStateChanged(ItemEvent ie){
		String str=(String)ch.getSelectedItem();
		
		if(ie.getSource()==ch){
			label.setText(str);
			if(str.equals("����")){
				label.setBackground(Color.magenta);
			}else if(str.equals("���")){
				label.setBackground(Color.red);
			}else if(str.equals("����")){
				label.setBackground(Color.green);
			}
		}//if 
	}//itemStateChanged()end
	
	//main
	public static void main(String args[]){
		new Test05_choice();
	}//main end
}//class end
