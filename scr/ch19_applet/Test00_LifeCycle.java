package ch19_applet;
import java.awt.*;

public class Test00_LifeCycle extends java.applet.Applet
{
	//����
	String msg="1,���� ����";
	
	public void init(){
		msg+="2. init() ";
	}
	public void start(){//â�� Ȱ��ȯ �� �� ȣ��
		msg+=" start() ";	
	}
	public void stop(){//â�� ��Ȱ��ȭ �ɶ� ȣ��
		msg+=" stop() ";
	}
	public void paint(Graphics g){
		msg+=" paint() ";
		g.drawString(msg, 50, 50);
	}
	public void destroy(){
		System.out.println("destroy() ȣ��");
	}
}//class end

