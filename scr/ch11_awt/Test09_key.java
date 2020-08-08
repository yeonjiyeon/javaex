package ch11_awt;
import java.awt.*;
import java.awt.event.*;
public class Test09_key extends Frame implements KeyListener{
	//��������
	Image im;
	int x,y;
	//������
	public Test09_key(){
		super("Ű�̺�Ʈ ����1");//���� Ŭ���� ������ ȣ��
		x=100;
		y=100;
		im=Toolkit.getDefaultToolkit().getImage("e:\\imgs\\aa.gif");
		
		//�̺�Ʈ ���
		//setTitle("Ű�̺�Ʈ ����1");
		addWindowListener(new Mywin());
		addKeyListener(this);
		
		setSize(500,500);
		setVisible(true);
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);//���α׷� ����
		}
	}//inner class end
	
	//�޼���:�������̵�
	public void keyPressed(KeyEvent ke){
		switch(ke.getKeyCode()){
		case KeyEvent.VK_UP: y-=5; break;
		case KeyEvent.VK_DOWN: y+=5; break;
		case KeyEvent.VK_LEFT: x-=5; break;
		case KeyEvent.VK_RIGHT: x+=5;break;
		}//switch	
		
		if(ke.getKeyCode()==KeyEvent.VK_RIGHT && ke.getKeyCode()==KeyEvent.VK_DOWN){
			x+=5;
			y+=5;
		}
		repaint();//�ٽ� �׸���
		
	}//keyPressed end
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void paint(Graphics g){
		//g.drawImage(im,x,y,this);
		//RGB: Red Green Blue
		int rr=(int)(Math.random()*(256));
		int gg=(int)(Math.random()*(256));
		int bb=(int)(Math.random()*(256));
		
		g.setColor(new Color(rr,gg,bb));
		g.drawOval(x, y, 20, 20);

	}//paint() end
	//main
	public static void main(String args[]){
		new Test09_key();
	}
}//class end 
