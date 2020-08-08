package ch13_event;
import java.awt.*;
import java.awt.event.*;

public class Test07_list extends Frame implements ActionListener,ItemListener{
	//����
	TextArea ta1,ta2;
	List list;
	Label label;
	//������
	public Test07_list(){
		super("list�̺�Ʈ ó�� ����");
		
		label=new Label("����Ʈ�ڽ�");
		list=new List(3);//3���� �����ش�
		list.add("�̸�");//�׸��߰�
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		ta1=new TextArea("",7,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
		//                  �� ĭ  ������ũ�ѹ�
		
		ta2=new TextArea("",7,30,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		//                        ����ũ�ѹ�
		//ta1.setBackground(Color.blue);
		
		//Frame�� BorderLayout�̴�
		//�׷��� FlowLayout ������ ���̴� 
		setLayout(new FlowLayout()); //FlowLayout���� ����
		
		add(label);//�����̳ʿ� ������Ʈ ���̱� 
		add(list);
		add(ta1);
		add(ta2);
		
		//�̺�Ʈ ���
		addWindowListener(new Mywin());
		list.addActionListener(this);
		list.addItemListener(this);
		
		
		
		setSize(300,500);
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
		//����Ŭ���� �� �̺�Ʈ�߻�
		ta2.append("AcitonEvent �߻�:"+e.getActionCommand()+'\n');
	}//actionPerformed() end
	
	public void itemStateChanged(ItemEvent ie){
		//Ŭ���� �� �̺�Ʈ�߻�
		ta1.append("ItemEvent �߻�:"+list.getSelectedItem()+'\n');
	}
	//main
	public static void main(String args[]){
		new Test07_list();//��ü ����,������ȣ��
	}//main end
}//class end
