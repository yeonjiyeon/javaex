package ch12_layout;
import java.awt.*;
import java.awt.event.*;

public class Test04_Layout extends Frame{
	//변수
	Panel pNorth,pSouth;
	Button b1,b2,b3,b4,b5;
	TextArea ta;
	
	//생성자
	public Test04_Layout(){
		super("Frame과 Panel사용 예제");//첫줄에 기재해야 한다, 수퍼클래스 생성자 호출
		
		this.setBackground(Color.pink);
		
		
		ta=new TextArea();
		
		b1=new Button("첫번째버튼");
		b2=new Button("두번째버튼");
		b3=new Button("세번째버튼");
		b4=new Button("네번째버튼");
		b5=new Button("다섯째버튼");
		
		pNorth=new Panel();
		pSouth=new Panel();
		
		pNorth.setBackground(Color.white);
		pSouth.setBackground(Color.black);
		
		//패널 컨테이너에 버튼붙이기
		pNorth.add(b1);
		pNorth.add(b2);
		pNorth.add(b3);
		pSouth.add(b4);
		pSouth.add(b5);
		
		//Frame에 panel붙이기
		this.add(pNorth,"North");
		this.add(pSouth,"South");
		ta.setFont(new Font("궁서체",Font.BOLD,100));
		this.add(ta,"Center");
		
		//이벤트등록
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
	
	//메서드
	public static void main(String args[]){
		new Test04_Layout();
	}
}//class end
