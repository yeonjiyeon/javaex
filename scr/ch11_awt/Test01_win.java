package ch11_awt;
import java.awt.*;//frame
import java.awt.event.*;//�̺�Ʈ ó�� Ŭ�������� �ִ�

//�������̽��� ����Ͽ� â�����ϱ� 
//window.Listener
public class Test01_win extends Frame implements WindowListener{
	//����
	
	
	//������:�ʱ�ȭ   this ��������
	public Test01_win(){
		super("â����");
		this.setTitle("â����");
		this.addWindowListener(this);//�̺�Ʈ ���
		setSize(300,300);//âũ��  // 
		setVisible(true);//âǥ��		
	}//cons end
	
	//�޼���:�������̵�
	public void windowClosing(WindowEvent we){
		dispose();//���ҽ���ȯ
		System.exit(0);//���α׷� ����,â����
	}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
		
	
  //main	
  public static void main(String args[]){
	  new Test01_win();//��ü ����, ������ ȣ��
  }//main end
}//class end
