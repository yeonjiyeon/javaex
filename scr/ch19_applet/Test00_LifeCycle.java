package ch19_applet;
import java.awt.*;

public class Test00_LifeCycle extends java.applet.Applet
{
	//변수
	String msg="1,전역 변수";
	
	public void init(){
		msg+="2. init() ";
	}
	public void start(){//창이 활성환 될 때 호출
		msg+=" start() ";	
	}
	public void stop(){//창이 비활성화 될때 호출
		msg+=" stop() ";
	}
	public void paint(Graphics g){
		msg+=" paint() ";
		g.drawString(msg, 50, 50);
	}
	public void destroy(){
		System.out.println("destroy() 호출");
	}
}//class end

