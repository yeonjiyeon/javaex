package ch11_awt;
import java.awt.*;
import java.awt.event.*;
public class Test10_key extends Frame implements KeyListener{
	//����
	
	//������
	public Test10_key(){
		super("Ű�̺�Ʈ����2");
		
		//�̺�Ʈ���
		addWindowListener(new Mywin());
		addKeyListener(this);
		
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
	
	//method:�������̵�
	public void keyPressed(KeyEvent ke){
		//Ű ��ġ���� ������ ó��(����Ű ��):ctrl,shift,function key,����Ű
		//���� ��ҹ��ڴ� �ȵȴ� 
		Graphics g=getGraphics();
		g.setFont(new Font("Dialog",Font.BOLD,20));
		
		g.setColor(Color.white);//â�� ������� ä�����
		g.clearRect(0,0,500,500);
		g.setColor(Color.blue);//�۾���
		
		g.drawString("���� ��� ���� Ű �ڵ尪�� "+ke.getKeyCode(),30,70);
		g.drawString("���� �Է��� ���ڴ�"+ke.getKeyChar(),30,100);
	}//keyPressed() end
	
	
	public void keyTyped(KeyEvent ke){
		//�ƽ�Ű�ڵ尪ó��: ����,������(A,a ��ҹ��� �����Ͽ� ó������
		Graphics g=getGraphics();
		g.setFont(new Font("Dialog",Font.BOLD,20));
		
		g.setColor(Color.green);
		g.setFont(new Font("�ü�ü",Font.BOLD,20));
		g.drawString("���� ��� ���� �ƽ�Ű code����"+(int)ke.getKeyChar(), 30, 130);
		g.drawString("���� ��� ���� �ƽ�Ű ���ڴ�"+ke.getKeyChar(), 30, 160);
	}//keyTyped end
	public void keyReleased(KeyEvent ke){}
	
	//main
	public static void main(String args[]){
		new Test10_key();
	}//main end
}//class end
