package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test04_radio extends Frame implements ItemListener{
	//변수
	Checkbox apple,banana,orange,grape;
	CheckboxGroup group;
	Label la1,la2,la3;
	Panel panel1,panel2;
	
	
	//생성자
	public Test04_radio(){
		super("라디오버튼에게");
		
		panel1=new Panel();
		panel2=new Panel();
		//panel1.setBackground(Color.pink);
		//panel2.setBackground(Color.cyan);
		
		la1=new Label("항목을 선택하시오");
		la2=new Label("선택한 항목은 다음과 같습니다");
		la3=new Label("          ");
		la3.setBackground(Color.pink);
		la2.setBackground(Color.pink);
		la1.setBackground(Color.pink);
		
		
		group=new CheckboxGroup();
		apple=new Checkbox("사과",group,true);
		banana=new Checkbox("바나나",group,false);
		orange=new Checkbox("오렌지",group,false);
		grape=new Checkbox("포도",group,false);
		
		panel1.setLayout(new GridLayout(5,1));
		panel1.add(la1);
		panel1.add(apple);
		panel1.add(banana);
		panel1.add(orange);
		panel1.add(grape);
		panel2.add(la2);
		panel2.add(la3);
		
		add(panel1,"North");
		add(panel2,"Center");
		
		//이벤트 등록
		apple.addItemListener(this);
		banana.addItemListener(this);
		orange.addItemListener(this);
		grape.addItemListener(this);	
		addWindowListener(new Mywin());
		
		setSize(500,500);
		setVisible(true);
		}//cons end
		
	//inner class 
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	
	//메서드:오버라이딩
	public void itemStateChanged(ItemEvent ie){
		la3.setText(group.getSelectedCheckbox().getLabel());
	}
	
	
	//main
	public static void main(String args[]){
		new Test04_radio();
	}
	
}//class end
