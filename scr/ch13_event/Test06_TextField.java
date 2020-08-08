package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test06_TextField extends Frame implements ActionListener,TextListener{
	//변수
	TextField tf;
	TextArea ta;
	
	//생성자
	public Test06_TextField(){
		super("TextField");
		
		tf=new TextField();
		ta=new TextArea();
		
		add(tf,"North");
		add(ta,"Center");
		
		//이벤트 등록 
		addWindowListener(new Mywin());
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		
		
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
	public void actionPerformed(ActionEvent e){//엔터키 눌렀을때 이벤트가 발생
		ta.append("ActionEvent:"+tf.getText()+'\n');
		tf.setText("");
	}
	
	public void textValueChanged(TextEvent te){//값이 변경될 때 이벤트가 발생
		ta.append("TextEvent:"+tf.getText()+'\n');
	}
	
	
	//main
	public static void main(String args[]){
	new Test06_TextField();
	}//main end
}//class end
