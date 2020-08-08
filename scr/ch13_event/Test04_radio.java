package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test04_radio extends Frame implements ItemListener{
	//����
	Checkbox apple,banana,orange,grape;
	CheckboxGroup group;
	Label la1,la2,la3;
	Panel panel1,panel2;
	
	
	//������
	public Test04_radio(){
		super("������ư����");
		
		panel1=new Panel();
		panel2=new Panel();
		//panel1.setBackground(Color.pink);
		//panel2.setBackground(Color.cyan);
		
		la1=new Label("�׸��� �����Ͻÿ�");
		la2=new Label("������ �׸��� ������ �����ϴ�");
		la3=new Label("          ");
		la3.setBackground(Color.pink);
		la2.setBackground(Color.pink);
		la1.setBackground(Color.pink);
		
		
		group=new CheckboxGroup();
		apple=new Checkbox("���",group,true);
		banana=new Checkbox("�ٳ���",group,false);
		orange=new Checkbox("������",group,false);
		grape=new Checkbox("����",group,false);
		
		panel1.setLayout(new GridLayout(5,1));
		panel1.add(la1);
		panel1.add(apple);
		panel1.add(banana);
		panel1.add(orange);
		panel1.add(grape);
		panel2.add(la2);
		panel2.add(la3);
		
		add(panel1,"North");
		add(panel2,"Center");
		
		//�̺�Ʈ ���
		apple.addItemListener(this);
		banana.addItemListener(this);
		orange.addItemListener(this);
		grape.addItemListener(this);	
		addWindowListener(new Mywin());
		
		setSize(500,500);
		setVisible(true);
		}//cons end
		
	//inner class 
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	
	//�޼���:�������̵�
	public void itemStateChanged(ItemEvent ie){
		la3.setText(group.getSelectedCheckbox().getLabel());
	}
	
	
	//main
	public static void main(String args[]){
		new Test04_radio();
	}
	
}//class end
