package ch20_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test05_table extends JFrame {
	//����
	JTable table;
	
	//������
	public Test05_table(){
		String cols[]={"�̸�","����","�̸���"};
		Object data[][]={
				{"������","17","g@nate.com"},
				{"������","19","g2@nate.com"},
				{"������","16","s@nate.com"},
				{"�̵���","20","lee@nate.com"},
				{"�����","18","m@nate.com"},
				{"�����","16","h@nate.com"},
				{"����","85","w@nate.com"},
				{"������","28","iu@nate.com"},
				{"���߱�","34","d@nate.com"},
				{"�̻��","45","f@nate.com"}
		};
		
		table= new JTable(data,cols);
		JScrollPane jScrollPane=new JScrollPane(table);//���̺����� ���� �� ��ũ�ѹ� �������� 
		
		getContentPane().add(jScrollPane,"Center");
		setSize(350,350);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���α׷� ����
	}//cons end
	//�����ε�
	
	//main
	public static void main(String args[]){
		new Test05_table();
	}
}//class end
