package ch13_event;
import java.awt.*;
import java.awt.event.*;

public class Test07_list extends Frame implements ActionListener,ItemListener{
	//변수
	TextArea ta1,ta2;
	List list;
	Label label;
	//생성자
	public Test07_list(){
		super("list이벤트 처리 예제");
		
		label=new Label("리스트박스");
		list=new List(3);//3개씩 보여준다
		list.add("이름");//항목추가
		list.add("국어");
		list.add("영어");
		list.add("수학");
		list.add("과학");
		
		ta1=new TextArea("",7,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
		//                  줄 칸  수직스크롤바
		
		ta2=new TextArea("",7,30,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		//                        수평스크롤바
		//ta1.setBackground(Color.blue);
		
		//Frame은 BorderLayout이다
		//그래서 FlowLayout 적용할 것이다 
		setLayout(new FlowLayout()); //FlowLayout으로 설정
		
		add(label);//컨테이너에 컴포넌트 붙이기 
		add(list);
		add(ta1);
		add(ta2);
		
		//이벤트 등록
		addWindowListener(new Mywin());
		list.addActionListener(this);
		list.addItemListener(this);
		
		
		
		setSize(300,500);
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
		//더블클릭할 때 이벤트발생
		ta2.append("AcitonEvent 발생:"+e.getActionCommand()+'\n');
	}//actionPerformed() end
	
	public void itemStateChanged(ItemEvent ie){
		//클릭할 때 이벤트발생
		ta1.append("ItemEvent 발생:"+list.getSelectedItem()+'\n');
	}
	//main
	public static void main(String args[]){
		new Test07_list();//객체 생성,생성자호출
	}//main end
}//class end
