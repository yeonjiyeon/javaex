package ch19_applet;
import java.awt.*;
import java.applet.*;
public class Test04_thread extends Applet implements Runnable
{
	//����
	int cnt;
	Thread t;
	public void init(){//�����ڿ� ���� ���
		cnt=0;
		t=new Thread(this);
		t.start(); //run() ȣ��
	}
	
	//run()�������̵�
	public void run(){
		try{
			while(true){
				repaint();
				Thread.sleep(1000);//1�ʵ��� ����
				++cnt;
			}//while end
			
		}catch(Exception ex){}
	}//run end
	
	//public void update(Graphics g){
	//paint(g);
	//}
	public void paint(Graphics g){
		
		g.setFont(new Font("Dialog",Font.BOLD,36));
		FontMetrics fm=g.getFontMetrics();//�۲� ���� ����ϱ� ����
		String str=cnt+"";//���ڸ� ���ڿ���
		Dimension d=getSize();//âũ�⸦ ���Ѵ�
		
		int x=d.width/2-fm.stringWidth(str)/2;
		int y=d.height/2;
		
		g.drawString(str, x, y);
	}
}

