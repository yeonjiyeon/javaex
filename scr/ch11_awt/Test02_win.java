package ch11_awt;
import java.awt.*;
import java.awt.event.*;

//inner class를 사용하여 창종류
public class Test02_win extends Frame{
	//전역변수,클래스변수
	
	//생성자 생성자안에서는 this 생략가능
	public Test02_win(){
		setTitle("inner class 연습");
		addWindowListener(new Mywin());//이벤트 등록 
		setBounds(200,200,300,300);//x,y,width, height
		setVisible(true);//창표시 //
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		//필요한 것만 오버라이딩하면 된다
		public void windowClosing(WindowEvent we){
			System.exit(0); //프로그램종류
		}//--
	}//inner class end
	
    //메서드
	//main
	public static void main(String args[]){
		new Test02_win();//객체 생성, 생성자호출
	}
	

}//class end 
