package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test03_checkbox extends Frame implements ItemListener{
	
	//변수
	Checkbox apple,banana,orange,grape;
	Panel panel;
	TextArea ta;
	
	//생성자
	public Test03_checkbox(){
		super("check box예제");//첫줄에 기재해야 한다, 상위 클래스 생성자 호출
		
		apple=new Checkbox("사과",null,true);//구룹대신=null  true=선택
		banana=new Checkbox("바나나");
		orange=new Checkbox("오렌지");
		grape=new Checkbox("포도");
		
		panel=new Panel();
		ta=new TextArea();
		
		panel.setBackground(Color.gray);
		//ta.setBackground(Color.orange);
		
		//Panel에 컴포넌트붙이기
		panel.add(apple);
		panel.add(banana);
		panel.add(orange);
		panel.add(grape);
		
		
		add(panel,"North"); //Frame에 Panel 붙이기
		add(ta,"Center");//Frame에 ta붙이기
		
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
		//오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//메서드:오버라이딩
	public void itemStateChanged(ItemEvent ie){
		Checkbox cb=(Checkbox)ie.getSource();
		if(cb.equals(apple)){
			if(cb.getState()){//선택 되었으면
				ta.append("사과선택\n");
			}else{//선택이 안된 경우는
				ta.append("사과해제\n");
			}
		}else if(cb.equals(banana)){
			if(cb.getState()){//선택 되었으면
				ta.append("바나나선택\n");
			}else{//선택이 안된 경우는
				ta.append("바나나해제\n");
			}
		}else if(cb.equals(orange)){
			if(cb.getState()){//선택 되었으면
				ta.append("오렌지선택\n");
			}else{//선택이 안된 경우는
				ta.append("오렌지해제\n");
			}
		}else if(cb.equals(grape)){
			if(cb.getState()){//선택 되었으면
				ta.append("포도선택\n");
			}else{//선택이 안된 경우는
				ta.append("포도해제\n");
			}
		}//if end
	}//itemStateChanged() end
	
	//main
	public static void main(String args[]){
		new Test03_checkbox();
	}//main end
}//class end
