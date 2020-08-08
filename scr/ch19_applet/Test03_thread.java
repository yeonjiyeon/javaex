package ch19_applet;

import java.awt.*;
import java.applet.*;
public class Test03_thread extends Applet implements Runnable{
	//����
	int x,y;
	Dimension d;//������Ʈũ�ⱸ�Ϸ���(âũ�� ���� ��)
	Thread t;
	Color cols[]={Color.red,Color.yellow,Color.blue,Color.green,Color.cyan};
	
	//int() ==������==�ʱ�ȭ �۾�
 	public void init(){
		t=new Thread(this);//��ü����
		t.start();// run()�޼��� ȣ��
		}

	//run() �������̵�
	public void run(){
		try{
			while(true){
				repaint();//update()->clearRect()->paint()
				Thread.sleep(100);//100�и���
			}//while end
			
		}catch(Exception ex){}
	}//run end

	//update() �������̵�
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

