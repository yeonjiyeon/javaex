package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test03_checkbox extends Frame implements ItemListener{
	
	//����
	Checkbox apple,banana,orange,grape;
	Panel panel;
	TextArea ta;
	
	//������
	public Test03_checkbox(){
		super("check box����");//ù�ٿ� �����ؾ� �Ѵ�, ���� Ŭ���� ������ ȣ��
		
		apple=new Checkbox("���",null,true);//������=null  true=����
		banana=new Checkbox("�ٳ���");
		orange=new Checkbox("������");
		grape=new Checkbox("����");
		
		panel=new Panel();
		ta=new TextArea();
		
		panel.setBackground(Color.gray);
		//ta.setBackground(Color.orange);
		
		//Panel�� ������Ʈ���̱�
		panel.add(apple);
		panel.add(banana);
		panel.add(orange);
		panel.add(grape);
		
		
		add(panel,"North"); //Frame�� Panel ���̱�
		add(ta,"Center");//Frame�� ta���̱�
		
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
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//�޼���:�������̵�
	public void itemStateChanged(ItemEvent ie){
		Checkbox cb=(Checkbox)ie.getSource();
		if(cb.equals(apple)){
			if(cb.getState()){//���� �Ǿ�����
				ta.append("�������\n");
			}else{//������ �ȵ� ����
				ta.append("�������\n");
			}
		}else if(cb.equals(banana)){
			if(cb.getState()){//���� �Ǿ�����
				ta.append("�ٳ�������\n");
			}else{//������ �ȵ� ����
				ta.append("�ٳ�������\n");
			}
		}else if(cb.equals(orange)){
			if(cb.getState()){//���� �Ǿ�����
				ta.append("����������\n");
			}else{//������ �ȵ� ����
				ta.append("����������\n");
			}
		}else if(cb.equals(grape)){
			if(cb.getState()){//���� �Ǿ�����
				ta.append("��������\n");
			}else{//������ �ȵ� ����
				ta.append("��������\n");
			}
		}//if end
	}//itemStateChanged() end
	
	//main
	public static void main(String args[]){
		new Test03_checkbox();
	}//main end
}//class end
