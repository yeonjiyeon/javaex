package ch08_class;
import java.awt.*;//Frame
import java.awt.event.*;

public class Test08_upcasting extends Frame{
	  //��������=�ʵ�
	  
	  
	  //������
	  public Test08_upcasting(){
		  super("����");//â����, ����Ŭ���� ������ȣ��
	  }//cons end
	  
	  public static void main(String args[]){
	  Frame f=new Test08_upcasting();//upcasting
	  f.setSize(400,400);//âũ��
	  f.setVisible(true);//âǥ��
  }//main end
}//class end
