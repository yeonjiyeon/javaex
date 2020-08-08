package ch08_class;
import java.awt.*;//Frame
import java.awt.event.*;

public class Test08_upcasting extends Frame{
	  //전역변수=필드
	  
	  
	  //생성자
	  public Test08_upcasting(){
		  super("연습");//창제목, 상위클래스 생성자호출
	  }//cons end
	  
	  public static void main(String args[]){
	  Frame f=new Test08_upcasting();//upcasting
	  f.setSize(400,400);//창크기
	  f.setVisible(true);//창표시
  }//main end
}//class end
