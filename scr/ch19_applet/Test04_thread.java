package ch19_applet;
import java.awt.*;
import java.applet.*;
public class Test04_thread extends Applet implements Runnable
{
	//변수
	int cnt;
	Thread t;
	public void init(){//생성자와 같은 기능
		cnt=0;
		t=new Thread(this);
		t.start(); //run() 호출
	}
	
	//run()오버라이딩
	public void run(){
		try{
			while(true){
				repaint();
				Thread.sleep(1000);//1초동안 쉬고
				++cnt;
			}//while end
			
		}catch(Exception ex){}
	}//run end
	
	//public void update(Graphics g){
	//paint(g);
	//}
	public void paint(Graphics g){
		
		g.setFont(new Font("Dialog",Font.BOLD,36));
		FontMetrics fm=g.getFontMetrics();//글꼴 정보 사용하기 위해
		String str=cnt+"";//숫자를 문자열로
		Dimension d=getSize();//창크기를 구한다
		
		int x=d.width/2-fm.stringWidth(str)/2;
		int y=d.height/2;
		
		g.drawString(str, x, y);
	}
}

