package ch19_applet;

import java.awt.*;
import java.applet.*;
public class Test03_thread extends Applet implements Runnable{
	//변수
	int x,y;
	Dimension d;//컴포넌트크기구하려고(창크기 구할 것)
	Thread t;
	Color cols[]={Color.red,Color.yellow,Color.blue,Color.green,Color.cyan};
	
	//int() ==생성자==초기화 작업
 	public void init(){
		t=new Thread(this);//객체생성
		t.start();// run()메서드 호출
		}

	//run() 오버라이딩
	public void run(){
		try{
			while(true){
				repaint();//update()->clearRect()->paint()
				Thread.sleep(100);//100밀리초
			}//while end
			
		}catch(Exception ex){}
	}//run end

	//update() 오버라이딩
	public void update(Graphics g){
		paint(g);
	}
	public void paint(Graphics g){
		d=getSize();
		x=(int)(Math.random()*d.width);
		y=(int)(Math.random()*d.height);
		
		int c=(int)(Math.random()*cols.length);
		g.setColor(cols[c]);
		
		g.drawOval(x,y,20,20);
	}
	
}//class end

