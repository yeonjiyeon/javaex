package ch11_awt;
import java.awt.*;
import java.awt.event.*;

//이름없는 클래스(무명클래스)사용하여 창종료
public class Test03_win extends Frame{
	//변수
	//생성자
	public Test03_win(){
		setTitle("무명inner class 연습");
		setBounds(300,300,300,300);//x,y,width,height
		setVisible(true);//창표시
		
		//이벤트 등록, 창종료 
		addWindowListener(new WindowAdapter()
		{//무명 inner class 
			//오버라이딩
			public void windowClosing(WindowEvent we){
				System.exit(0);//프로그램 종류, 창종류
			}
			
		} 
		);
	}//cons end
	//메서드
	//main
	public static void main(String args[]){
		new Test03_win();//객체생성 ,생성자 호출
	}

}//class end
