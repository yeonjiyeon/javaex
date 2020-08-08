package ch13_event;
import java.awt.*;
import java.awt.event.*;

public class Test01_event extends Frame implements ActionListener{
	//변수
	TextField tf1,tf2;
	TextArea ta;
	
	//생성자
	public Test01_event(){
		super("event 예제1");//수퍼 클래스 생성자 호출, 첫줄에 기재합니다 
		
		tf1=new TextField();//객체생성
		tf2=new TextField();
		ta=new TextArea();
		
		tf1.setBackground(Color.gray);
		tf2.setBackground(Color.blue);
		
		tf1.setFont(new Font("Dialog",Font.BOLD,20));
		tf2.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setEditable(false);//편집 못하게
		
		//컨테이너(Frame)에 컴포넌트(tf1,tf2,ta)붙이기
		//BorderLayout 적용
		add(tf1,"North");
		add(ta,"Center");
		add(tf2,"South");
		
		
		//이벤트 등록
		tf1.addActionListener(this);
		tf2.addActionListener(this);
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
	//메서드:오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="윌리엄말>>"+tf1.getText();
			ta.append(msg+'\n');
			tf1.setText("");
			tf2.requestFocus();//포커스 설정
		}else if(e.getSource()==tf2){
			String msg="벤틀리말>>"+tf2.getText();
			ta.append(msg+'\n');
			tf2.setText("");
			tf1.requestFocus();
		}
	}//actionPerformed() end
	
	
	
	//main
	public static void main(String args []){
		new Test01_event();//객체 생성,생성자호출
	}//main end
	
}//class end
