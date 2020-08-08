package ch12_layout;
import java.awt.*;
import java.awt.event.*;
public class Test03_GridLayout extends Frame{
	//전역변수
	Button b1,b2,b3,b4,b5;
	
	//생성자
	public Test03_GridLayout(){
		super("GridLayout");//첫줄에 기재해야 한다, 슈퍼클래스 생성자 호출
		
		b1=new Button("첫번째버튼");
		b2=new Button("두번째버튼");
		b3=new Button("세번째버튼");
		b4=new Button("네번째버튼");
		b5=new Button("다섯째버튼");
		
		this.setLayout(new GridLayout(3,2));//3행2열로 배치
		
		
		//컨테이너(Frame)에 컴포넌트(버튼)붙이기
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		
		//이벤트 등록
		addWindowListener(new Mywin());
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
	
	public static void main(String args[]){
		new Test03_GridLayout(); 
	}
	//메서드
}//class end
