package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//inner class로 창종류
public class Test04_graphics extends Frame{
	//생성자
	public Test04_graphics(){
		setTitle("연습");
		addWindowListener(new Mywin());
		setBounds(300,300,600,600);
		setVisible(true);
		
	}//cons end
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner end
	
	//paint(): window창의 출력담당 
	//paint()는 창이 활성화된 후에 실행된다 
	//Frame->window에서 상속받음
	public void paint(Graphics g){
		
		//Font f=new Font("Dialog",Font.BOLD,30);
		//g.setFont(f);
		g.setFont(new Font("Dialog",Font.BOLD,30));
		g.setColor(Color.blue);		
		g.drawString("오늘은 즐금",30,70);
		
		//RGB Color: Red,  Green,    Blue 
		           //0~255 0~255    0~255 
		//QBColor :16색 
		
		//선그리기
		g.setColor(Color.red);
		g.drawLine(30,100,100,100);//x1,y1  x2,y2
		
		//사각형
		g.setColor(Color.green);
		//g.drawRect(90, 130, 200, 200);
		//g.fillRect(90, 130, 200, 200);
		
		//원그리기
		g.setColor(Color.red);
		//g.drawOval(90, 130, 200, 200);
		//g.fillOval(90, 130, 200, 200);
		
		//둥근사각형
		//g.drawRoundRect(90, 130, 200, 200,30,30);
		//g.fillRoundRect(90, 130, 200, 200,30,30);
		
		//호 그리기
		//g.drawArc(160, 100, 200, 200, 30, 150);
		//g.fillArc(160, 100, 200, 200, 30, 150);
		
		//다각형그리기
		int x[]={30,200,250,400,450,40};
		int y[]={140,50,70,10,140,140};
		
		
		for(int i=0;i<y.length;i++){
			y[i]+=100;
		}
		g.drawPolygon(x,y,x.length);
		g.fillPolygon(x,y,x.length);
	}//paint end
	
	
	
	public static void main(String args[]){
		new Test04_graphics();
	}//main end
	

}//class end
