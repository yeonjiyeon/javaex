package ch13_event;
import java.awt.*;
import java.awt.event.*;

public class Test05_choice extends Frame implements ItemListener{
	//변수
	Choice ch;
	Label label=new Label("과일",Label.CENTER);
	
	//생성자
	public Test05_choice(){
		super("choice예제");
		
		ch=new Choice();
		ch.addItem("포도");//항목추가
		ch.addItem("사과");//항목추가
		ch.addItem("수박");//항목추가
		
		label.setForeground(Color.blue);
		label.setFont(new Font("Dialog",Font.BOLD,72));
		
		//프레임에 컴포넌트 붙이기
		add(ch,"North");
		add(label,"Center");
		
		
		//이벤트등록
		addWindowListener(new Mywin());
		ch.addItemListener(this);
		
		setSize(500,500);
		setVisible(true);
	}//cons end
	//inner class 
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//메소드:오버라이딩
	public void itemStateChanged(ItemEvent ie){
		String str=(String)ch.getSelectedItem();
		
		if(ie.getSource()==ch){
			label.setText(str);
			if(str.equals("포도")){
				label.setBackground(Color.magenta);
			}else if(str.equals("사과")){
				label.setBackground(Color.red);
			}else if(str.equals("수박")){
				label.setBackground(Color.green);
			}
		}//if 
	}//itemStateChanged()end
	
	//main
	public static void main(String args[]){
		new Test05_choice();
	}//main end
}//class end
