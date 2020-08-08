package ch11_awt;
import java.awt.*;
import java.awt.event.*;

public class Test06_Mouse extends Frame implements MouseListener,MouseMotionListener{
	//��������
	private String msg;
	private int xpos,ypos;
	
	
	//������
	public Test06_Mouse(){
		setTitle("���콺 �̺�Ʈ");
		
		//�̺�Ʈ ���
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new Mywin());
		
		setBounds(500,500,500,500);
		setVisible(true);
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	//����� ���Ǹ޼���
	private void setValues(String msg, int x,int y){
		this.msg=msg;
		this.xpos=x; //this��������
		this.ypos=y;
		repaint();//paint()�޼���ȣ��
	}//setValues
	
	
	//paint()�޼��� �������̵�
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawString(msg+"["+ xpos+","+ypos+"]",xpos, ypos);
	}
	
	
	//�޼���,�������̵�
	public void mousePressed(MouseEvent me){
		setValues("mousePressed",me.getX(),me.getY());
	}//mousePressed() end
	public void mouseReleased(MouseEvent me){
		setValues("mouseReleased",me.getX(),me.getY());
	}//mouseReleased end
	public void mouseEntered(MouseEvent me){
		System.out.println("���콺 Ŀ���� â������ ������");
	}
	public void mouseExited(MouseEvent me){
		System.out.println("���콺 Ŀ���� â������ ������");
	}
	public void mouseClicked(MouseEvent me){
		setValues("mouseClicked",me.getX(),me.getY());
	}
	
	public void mouseDragged(MouseEvent me){
		setValues("mouseDragged",me.getX(),me.getY());
	}
	public void mouseMoved(MouseEvent me){
		setValues("mouseMoveedd",me.getX(),me.getY());
	}
	
	//main
	public static void main(String args[]){
		new Test06_Mouse();
	}//main end

}//class end
