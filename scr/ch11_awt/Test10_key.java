package ch11_awt;
import java.awt.*;
import java.awt.event.*;
public class Test10_key extends Frame implements KeyListener{
	//변수
	
	//생성자
	public Test10_key(){
		super("키이벤트예제2");
		
		//이벤트등록
		addWindowListener(new Mywin());
		addKeyListener(this);
		
		setSize(500,500);
		setVisible(true);
	}//cons end
	
	
	//inner class
	class Mywin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//method:오버라이딩
	public void keyPressed(KeyEvent ke){
		//키 위치상의 값으로 처리(가상키 값):ctrl,shift,function key,방향키
		//영어 대소문자는 안된다 
		Graphics g=getGraphics();
		g.setFont(new Font("Dialog",Font.BOLD,20));
		
		g.setColor(Color.white);//창을 흰색으로 채우려고
		g.clearRect(0,0,500,500);
		g.setColor(Color.blue);//글씨색
		
		g.drawString("님이 방금 누른 키 코드값은 "+ke.getKeyCode(),30,70);
		g.drawString("님이 입력한 문자는"+ke.getKeyChar(),30,100);
	}//keyPressed() end
	
	
	public void keyTyped(KeyEvent ke){
		//아스키코드값처리: 숫자,영문자(A,a 대소문자 구분하여 처리가능
		Graphics g=getGraphics();
		g.setFont(new Font("Dialog",Font.BOLD,20));
		
		g.setColor(Color.green);
		g.setFont(new Font("궁서체",Font.BOLD,20));
		g.drawString("님이 방금 누른 아스키 code값은"+(int)ke.getKeyChar(), 30, 130);
		g.drawString("님이 방금 누른 아스키 문자는"+ke.getKeyChar(), 30, 160);
	}//keyTyped end
	public void keyReleased(KeyEvent ke){}
	
	//main
	public static void main(String args[]){
		new Test10_key();
	}//main end
}//class end
