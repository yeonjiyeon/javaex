package ch07_cons;
//super:����Ŭ���� ��ü
//super(): ����Ŭ���� ���� ������ ȣ�� 

import java.awt.*;//frame(������ â�� ����� Ŭ����)
import java.awt.event.*;
public class Test06_super extends Frame{//��ӹޱ�
  //������
	public Test06_super(){
		super("����");//����Ŭ���� ������ ȣ�� 
		setSize(500,500);//âũ��, �ȼ� 
		setVisible(true);//â ǥ��
		setTitle("ȫ�浿 ����");//â����
		//this.setSize(500,500);//�����ھ��̹Ƿ� ����������
		//this.setVisible(true);
		
		
		//super.setSize(500,500);�̹� ��ӵ� ������ �ٽ� ����� �ʿ䰡 ����
		//super.setVisible(true);
	}//cons end
	public static void main(String args[]){
		new Test06_super();//��ü ����, ������ ȣ��
	}//main end
}//class end
