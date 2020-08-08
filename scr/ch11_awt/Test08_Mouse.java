package ch11_awt;
import java.awt.*;
import java.awt.event.*;
public class Test08_Mouse extends Frame{
	//변수
	
	//생성자
	public Test08_Mouse(){
		setTitle("창이름");
		
		//이벤트등록
		addMouseListener(new Mymouse());
		addWindowListener(new MYwin());
		setBounds(500,500,500,500);
		setVisible(true);
	}//cons end
	
	//inner class 
	class MYwin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);//
		}
	}//inner  class end
	
	
	//전역변수
	int x,y;
	String name="";
	
	//inner class2
	class Mymouse extends MouseAdapter{
		//오버라이딩
		public void mousePressed(MouseEvent me){
			//왼쪽버튼 누르면 내이름, 오른쪽버튼 누르면 친구이름  
			if(me.getButton()==me.BUTTON1){//왼쪽버튼
				name="내이름은 박문수";
				x=me.getX();
				y=me.getY();
				repaint(); //update()==>clearRect()==>paint() : jvm에 의해서 호출되어짐
			}else if(me.getButton()==me.BUTTON3){//오른쪽 버튼
				name="내친구 윌리엄";
				x=me.getX();
				y=me.getY();
				repaint();//update()==>clearRect()==>paint() : jvm에 의해서 호출되어짐
			}else if(me.getButton()==me.BUTTON2){//휠
				System.exit(0);//프로그램종료
				
			}//
			
			
		}//mousePressed end
	}//inner class end
	//메서드:오버라이딩
	public void paint(Graphics g){
		g.setFont(new Font("Dialog",Font.PLAIN,29));
		g.setColor(Color.green);
		g.drawString(name,x,y);
	}//paint() end
	
	public static void main(String args[]){
		new Test08_Mouse();
	}
	//메서드
}//class end
