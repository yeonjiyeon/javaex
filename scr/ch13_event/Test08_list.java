package ch13_event;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test08_list extends Frame implements ActionListener{
	//전역변수=필드
	List list1,list2;
	Button b1,b2,b3,b4,b5;
	TextField tf;
	
	
	
	//생성자
	public Test08_list(){
		super("list");
		
		this.setFont(new Font("Dialog",Font.BOLD,16));//Frame
		
		//디자인
		setDesign();//메서드호출
		
		//이벤트등록
		addWindowListener(new Mywin());
		tf.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		list1.addActionListener(this);
		list2.addActionListener(this);
		
		setSize(600,300);
		setVisible(true);
	}//cons end
	
	//사용자정의 메서드
	public void setDesign(){
		list1=new List(10,false);//10개씩 보여주고 true는 다중 선택 가능하게
		list1.add("삼성전기");
		list1.add("삼성SDI");
		list1.add("현대차");
		list1.add("한미약품");
		list1.add("셀트리온");
		list1.add("파라다이스");
		
		Panel p1=new Panel(new BorderLayout());
		p1.add(list1,"Center");//p1컨테이너에 list1컴포넌트붙이기
		
		list2=new List(10,false);
		Panel p2=new Panel(new BorderLayout());
		p2.add(list2,"Center");
		
		b1=new Button(">추가");
		b2=new Button(">>모두 추가");
		
		b3=new Button("<제거");
		b4=new Button("<<모두 제거");
		
		b5=new Button("초기화");
		
		Panel p3=new Panel(new GridLayout(5,1,0,5));//5행 1열 수평0 수직 5
		p3.add(b1);//p3컨테이너에 버튼컴포넌트넣기
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		
		tf=new TextField(20); //20칸, 20글자
		Panel p4=new Panel();
		p4.add(new Label("추가",Label.LEFT));
		p4.add(tf);
		
		Panel p=new Panel();
		p.add(p1);
		p.add(p3);
		p.add(p2);
		
		//Frame에 패널 컴포넌트붙이기
		add(p,"Center");
		add(p4,"South");
		
		
		
	}//setDesign() end
	
	//inner class
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class
	//메서드:오버라이딩
	//import javax.swing.*;
	public void actionPerformed(ActionEvent e){
		Object ob=e.getSource();
		String str="";//변수
		
		if(ob==tf){//항목추가
			if(tf.getText().equals("")){//비어 있으면
				JOptionPane.showMessageDialog(this,"추가할 내용을 입력하시오");
				tf.requestFocus();//포커스 설정
				return;
			}//if
			
			//중복체크
		for(int i=0;i<list1.getItemCount();i++){
			if(list1.getItem(i).equals(tf.getText())){
				JOptionPane.showMessageDialog(this,"항목에 있습니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}//if end
		}//for end
		
		//정상처리
		list1.add(tf.getText());//list에 추가
		tf.setText("");
		tf.requestFocus();	
		}//if
		
		//b1:선택자료 옮기기
		if(ob==b1){
			String items[]=list1.getSelectedItems();
			for(int i=0;i<items.length;i++){
				
				String items2[]=list2.getItems();
				for(int j=0;j<items2.length;j++){
					if(items[i].equals(items2[j])){
					JOptionPane.showMessageDialog(this,"항목이 존재합니다");
					list1.requestFocus();
					return;
				}//if
					
					}//for
					
				list2.add(items[i]);
				//list1.remove(items[i]);
			}//for
		}//if 
		
		//b3:remove
		if(ob==b3){
			String items[]=list2.getSelectedItems();
			for(int i=0;i<items.length;i++){
				list2.remove(items[i]);
			}//for
		}//if
		
		//b2: list1에서 list2로 모두 옮기기
		if(ob==b2){
			String items[]=list1.getItems();
			for(int i=0;i<items.length;i++){
				list2.add(items[i]);
			}//for
			list1.removeAll();
		}//if 
		
		//b4:list2에서 list1로 모두 옮기기
		if(ob==b4){
			String items[]=list2.getItems();
			for(int i=0;i<items.length;i++){
				list1.add(items[i]);
			}//for
			list2.removeAll();
		}//if end
		
		//b5
		if(ob==b5){
			list1.removeAll();
			list2.removeAll();
			
			list1.add("삼성전기");
			list1.add("삼성SDI");
			list1.add("현대차");
			list1.add("한미약품");
			list1.add("셀트리온");
			list1.add("파라다이스");
		}//if end
		
		//list 이벤트처리,list1에서 더블클릭
		if(ob==list1){
			str=e.getActionCommand();//항목을 얻는다
			//list2 중복체크
			for(int i=0;i<list2.getItemCount();i++){
				if(list2.getItem(i).equals(str)){
					JOptionPane.showMessageDialog(this, "이미 존재 합니다");
					return;
				}//if end
			}//for
			//list1.remove(str);
			list2.add(str);
		}//if
	}//actionPerformed() end
	
	

	//main
	public static void main(String args[]){
		new Test08_list();
	}
}//class end
