package ch11_awt;
import java.awt.*;
import java.awt.event.*;

public class Test07_Mouse extends Frame implements MouseMotionListener{
	//변수
	Point point=new Point(0,0);//x,y
	Color cols[]={Color.blue,Color.green,Color.red,Color.yellow,Color.magenta};
	
	//생성자
	public Test07_Mouse(){
		setTitle("마우스 이벤트 예제고");
		//이벤트 등록
		addWindowListener(new Mywin());
		addMouseMotionListener(this);
		
		setBounds(500,500,500,500);
		setVisible(true);
	}//cons end
	
	//inner class 
	class Mywin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);//프로그램종료
		}
	}//inner class end
	
	//메서드: 오버라이딩
	public void mouseDragged(MouseEvent me){
		point=me.getPoint();//마우스위치값을 포이트에 할당
		repaint();// update()==>clearRect()==>paint() : jvm에 의해서 호출되어짐
	}
	public void mouseMoved(MouseEvent me){}
	
	//update()오버라이딩
	public void update(Graphics g){
		paint(g);//clearRect()을 안 하려고
	}//update() end
	
	//paint() 오버라이딩
	public void paint(Graphics g){
		int c=(int)(Math.random()*cols.length);
		g.setColor(cols[c]);
		//g.fillOval(point.x, point.y, 15, 15);
		//g.drawOval(point.x, point.y, 15, 15);
		//마우스 커서위치에 본인이름출력하기 
		g.drawString("kjy",point.x,point.y);
	}//paint() end
	//main
	public static void main(String args[]){
		new Test07_Mouse();//객체 생성, 생성자 호출
	}
	
}//class end
