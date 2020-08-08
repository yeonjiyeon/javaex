package ch11_awt;
import java.awt.*;
import java.awt.event.*;

//inner class 창종료
public class Test05_img extends Frame{
	
	//변수
	Image im;
	
	
	//생성자
	public Test05_img(){
		setTitle("v");
		
		im=Toolkit.getDefaultToolkit().getImage("e:\\imgs\\kkk.jpg");
		addWindowListener(new K());
		setBounds(300,300,600,600);
		setVisible(true);
	}//cons end
	
	
	//inner class 
	class K extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class 
	
	//paint
	public void paint(Graphics g){
		//g.drawImage(im,30,50,this);
		g.drawImage(im,30,50,350,250,this);
		g.drawRect(30,50,350,250);
	}//paint end
	
	
	//main
	public static void main(String args[]){
		new Test05_img();
	}

}//class end
