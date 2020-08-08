package ch07_cons;
//super:상위클래스 객체
//super(): 상위클래스 안의 생성자 호출 

import java.awt.*;//frame(원도우 창을 만드는 클래스)
import java.awt.event.*;
public class Test06_super extends Frame{//상속받기
  //생성자
	public Test06_super(){
		super("연습");//상위클래스 생성자 호출 
		setSize(500,500);//창크기, 픽셀 
		setVisible(true);//창 표시
		setTitle("홍길동 연습");//창제목
		//this.setSize(500,500);//생성자안이므로 생략가능함
		//this.setVisible(true);
		
		
		//super.setSize(500,500);이미 상속된 것으로 다시 상속할 필요가 없다
		//super.setVisible(true);
	}//cons end
	public static void main(String args[]){
		new Test06_super();//객체 생성, 생성자 호출
	}//main end
}//class end
