package ch13_event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test08_list extends Frame implements ActionListener{
	//��������=�ʵ�
	List list1,list2;
	Button b1,b2,b3,b4,b5;
	TextField tf;
	
	
	
	//������
	public Test08_list(){
		super("list");
		
		this.setFont(new Font("Dialog",Font.BOLD,16));//Frame
		
		//������
		setDesign();//�޼���ȣ��
		
		//�̺�Ʈ���
		addWindowListener(new Mywin());
		tf.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		list1.addActionListener(this);
		list2.addActionListener(this);
		
		setSize(600,300);
		setVisible(true);
	}//cons end
	
	//��������� �޼���
	public void setDesign(){
		list1=new List(10,false);//10���� �����ְ� true�� ���� ���� �����ϰ�
		list1.add("�Ｚ����");
		list1.add("�ＺSDI");
		list1.add("������");
		list1.add("�ѹ̾�ǰ");
		list1.add("��Ʈ����");
		list1.add("�Ķ���̽�");
		
		Panel p1=new Panel(new BorderLayout());
		p1.add(list1,"Center");//p1�����̳ʿ� list1������Ʈ���̱�
		
		list2=new List(10,false);
		Panel p2=new Panel(new BorderLayout());
		p2.add(list2,"Center");
		
		b1=new Button(">�߰�");
		b2=new Button(">>��� �߰�");
		
		b3=new Button("<����");
		b4=new Button("<<��� ����");
		
		b5=new Button("�ʱ�ȭ");
		
		Panel p3=new Panel(new GridLayout(5,1,0,5));//5�� 1�� ����0 ���� 5
		p3.add(b1);//p3�����̳ʿ� ��ư������Ʈ�ֱ�
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		
		tf=new TextField(20); //20ĭ, 20����
		Panel p4=new Panel();
		p4.add(new Label("�߰�",Label.LEFT));
		p4.add(tf);
		
		Panel p=new Panel();
		p.add(p1);
		p.add(p3);
		p.add(p2);
		
		//Frame�� �г� ������Ʈ���̱�
		add(p,"Center");
		add(p4,"South");
		
		
		
	}//setDesign() end
	
	//inner class
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class
	//�޼���:�������̵�
	//import javax.swing.*;
	public void actionPerformed(ActionEvent e){
		Object ob=e.getSource();
		String str="";//����
		
		if(ob==tf){//�׸��߰�
			if(tf.getText().equals("")){//��� ������
				JOptionPane.showMessageDialog(this,"�߰��� ������ �Է��Ͻÿ�");
				tf.requestFocus();//��Ŀ�� ����
				return;
			}//if
			
			//�ߺ�üũ
		for(int i=0;i<list1.getItemCount();i++){
			if(list1.getItem(i).equals(tf.getText())){
				JOptionPane.showMessageDialog(this,"�׸� �ֽ��ϴ�");
				tf.setText("");
				tf.requestFocus();
				return;
			}//if end
		}//for end
		
		//����ó��
		list1.add(tf.getText());//list�� �߰�
		tf.setText("");
		tf.requestFocus();	
		}//if
		
		//b1:�����ڷ� �ű��
		if(ob==b1){
			String items[]=list1.getSelectedItems();
			for(int i=0;i<items.length;i++){
				
				String items2[]=list2.getItems();
				for(int j=0;j<items2.length;j++){
					if(items[i].equals(items2[j])){
					JOptionPane.showMessageDialog(this,"�׸��� �����մϴ�");
					list1.requestFocus();
					return;
				}//if
					
					}//for
					
				list2.add(items[i]);
				//list1.remove(items[i]);
			}//for
		}//if 
		
		//b3:remove
		if(ob==b3){
			String items[]=list2.getSelectedItems();
			for(int i=0;i<items.length;i++){
				list2.remove(items[i]);
			}//for
		}//if
		
		//b2: list1���� list2�� ��� �ű��
		if(ob==b2){
			String items[]=list1.getItems();
			for(int i=0;i<items.length;i++){
				list2.add(items[i]);
			}//for
			list1.removeAll();
		}//if 
		
		//b4:list2���� list1�� ��� �ű��
		if(ob==b4){
			String items[]=list2.getItems();
			for(int i=0;i<items.length;i++){
				list1.add(items[i]);
			}//for
			list2.removeAll();
		}//if end
		
		//b5
		if(ob==b5){
			list1.removeAll();
			list2.removeAll();
			
			list1.add("�Ｚ����");
			list1.add("�ＺSDI");
			list1.add("������");
			list1.add("�ѹ̾�ǰ");
			list1.add("��Ʈ����");
			list1.add("�Ķ���̽�");
		}//if end
		
		//list �̺�Ʈó��,list1���� ����Ŭ��
		if(ob==list1){
			str=e.getActionCommand();//�׸��� ��´�
			//list2 �ߺ�üũ
			for(int i=0;i<list2.getItemCount();i++){
				if(list2.getItem(i).equals(str)){
					JOptionPane.showMessageDialog(this, "�̹� ���� �մϴ�");
					return;
				}//if end
			}//for
			//list1.remove(str);
			list2.add(str);
		}//if
	}//actionPerformed() end
	
	

	//main
	public static void main(String args[]){
		new Test08_list();
	}
}//class end
