package ch11_awt;
import java.awt.*;
import java.awt.event.*;

public class Test06_Mouse extends Frame implements MouseListener,MouseMotionListener{
	//전역변수
	private String msg;
	private int xpos,ypos;
	
	
	//생성자
	public Test06_Mouse(){
		setTitle("마우스 이벤트");
		
		//이벤트 등록
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new Mywin());
		
		setBounds(500,500,500,500);
		setVisible(true);
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	//사용자 정의메서드
	private void setValues(String msg, int x,int y){
		this.msg=msg;
		this.xpos=x; //this생략가능
		this.ypos=y;
		repaint();//paint()메서드호출
	}//setValues
	
	
	//paint()메서드 오버라이딩
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawString(msg+"["+ xpos+","+ypos+"]",xpos, ypos);
	}
	
	
	//메서드,오버라이딩
	public void mousePressed(MouseEvent me){
		setValues("mousePressed",me.getX(),me.getY());
	}//mousePressed() end
	public void mouseReleased(MouseEvent me){
		setValues("mouseReleased",me.getX(),me.getY());
	}//mouseReleased end
	public void mouseEntered(MouseEvent me){
		System.out.println("마우스 커서가 창안으로 들어왔음");
	}
	public void mouseExited(MouseEvent me){
		System.out.println("마우스 커서가 창밖으로 나갔음");
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
