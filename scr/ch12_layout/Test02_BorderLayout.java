package ch12_layout;
import java.awt.*;
import java.awt.event.*;
public class Test02_BorderLayout extends Frame{
	//변수
	Button b1,b2,b3,b4,b5;
	//생성자
	
	public Test02_BorderLayout(){
		super("BorderLayout 예제");//첫줄에 기재해야 한다, 상위 클래서 생성자 호출
		
		b1=new Button("첫번째버튼");
		b2=new Button("두번째버튼");
		b3=new Button("세번째버튼");
		b4=new Button("네번째버튼");
		b5=new Button("다섯째버튼");
		
		//window<--Frame계열은 BorderLayout이 디폴트이기 때문에 
		//setLayout(new BorderLayout());//설정하지 않아도 된다
		
		//컨테이너(Frame)에 컴포넌트(버튼)붙이기
		//this.add(b1,"North");
		setLayout(new BorderLayout(50,50));
		
		this.add(b1,BorderLayout.NORTH);
		this.add(b2,"South");
		this.add(b3,"East");
		this.add(b4,"West");
		this.add(b5,"Center");
		
		addWindowListener(new Mywin());
		setSize(500,500);
		setVisible(true);
	}//cons end
	
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
		System.exit(0);
		}
  }//inner class end

	
	public static void main(String args[]){
		new Test02_BorderLayout();
	}//main end
}//class end