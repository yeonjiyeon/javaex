package ch11_awt;
import java.awt.*;//frame
import java.awt.event.*;//이벤트 처리 클래스들이 있다

//인터페이스를 사용하여 창종료하기 
//window.Listener
public class Test01_win extends Frame implements WindowListener{
	//변수
	
	
	//생성자:초기화   this 생략가능
	public Test01_win(){
		super("창종류");
		this.setTitle("창종료");
		this.addWindowListener(this);//이벤트 등록
		setSize(300,300);//창크기  // 
		setVisible(true);//창표시		
	}//cons end
	
	//메서드:오버라이딩
	public void windowClosing(WindowEvent we){
		dispose();//리소스반환
		System.exit(0);//프로그램 종류,창종류
	}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
		
	
  //main	
  public static void main(String args[]){
	  new Test01_win();//객체 생성, 생성자 호출
  }//main end
}//class end
