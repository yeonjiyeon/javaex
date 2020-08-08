package ch11_awt;
import java.awt.*;
import java.awt.event.*;

public class Test07_Mouse extends Frame implements MouseMotionListener{
	//����
	Point point=new Point(0,0);//x,y
	Color cols[]={Color.blue,Color.green,Color.red,Color.yellow,Color.magenta};
	
	//������
	public Test07_Mouse(){
		setTitle("���콺 �̺�Ʈ ������");
		//�̺�Ʈ ���
		addWindowListener(new Mywin());
		addMouseMotionListener(this);
		
		setBounds(500,500,500,500);
		setVisible(true);
	}//cons end
	
	//inner class 
	class Mywin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);//���α׷�����
		}
	}//inner class end
	
	//�޼���: �������̵�
	public void mouseDragged(MouseEvent me){
		point=me.getPoint();//���콺��ġ���� ����Ʈ�� �Ҵ�
		repaint();// update()==>clearRect()==>paint() : jvm�� ���ؼ� ȣ��Ǿ���
	}
	public void mouseMoved(MouseEvent me){}
	
	//update()�������̵�
	public void update(Graphics g){
		paint(g);//clearRect()�� �� �Ϸ���
	}//update() end
	
	//paint() �������̵�
	public void paint(Graphics g){
		int c=(int)(Math.random()*cols.length);
		g.setColor(cols[c]);
		//g.fillOval(point.x, point.y, 15, 15);
		//g.drawOval(point.x, point.y, 15, 15);
		//���콺 Ŀ����ġ�� �����̸�����ϱ� 
		g.drawString("kjy",point.x,point.y);
	}//paint() end
	//main
	public static void main(String args[]){
		new Test07_Mouse();//��ü ����, ������ ȣ��
	}
	
}//class end
