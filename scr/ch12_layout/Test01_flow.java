package ch12_layout;
import java.awt.*;
import java.awt.event.*;
//창 종료
public class Test01_flow extends Frame{
	//변수
	Button b1,b2,b3,b4,b5;
	
	//생성자: 객체 초기화가 목적이다
	public Test01_flow(){
		super("FlowLayout 예제");//상위 클래스 생성자 호출, 첫줄에 기재해야 한다
		
		b1=new Button("첫번째버튼");
		b2=new Button("두번째버튼");
		b3=new Button("세번째버튼");
		b4=new Button("네번째버튼");
		b5=new Button("다섯째버튼");
		
		// Window <-- Frame 는 BorderLayout이다
		// 우리는 FlowLayout을 사용합니다
		//this.setLayout(new FlowLayout());//디폴트가 아니라서 설정 해야 한다 
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 50,50));//디폴트가 아니라서 설정 해야 한다
		
		//컨테이너(Frame)에 컴포넌트(버튼) 붙이기
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		
		//이벤트 등록 
		addWindowListener(new MyWin());
		setSize(500,500);//창크기
		setVisible(true);//창표시
	}//cons end
	
	//inner class
	class MyWin extends WindowAdapter{
		//오버라이딩 : 상속 받은 메서드 내용 재정의 하는 것이다
		public void windowClosing(WindowEvent we){
			System.exit(0);//프로그램 종료
		}
	}//class end
	//method
	
	//main
	public static void main(String args[]){
		new Test01_flow();
	}
}//class end
 