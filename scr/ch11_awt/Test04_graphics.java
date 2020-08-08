package ch11_awt;
import java.awt.*;
import java.awt.event.*;
//inner class�� â����
public class Test04_graphics extends Frame{
	//������
	public Test04_graphics(){
		setTitle("����");
		addWindowListener(new Mywin());
		setBounds(300,300,600,600);
		setVisible(true);
		
	}//cons end
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner end
	
	//paint(): windowâ�� ��´�� 
	//paint()�� â�� Ȱ��ȭ�� �Ŀ� ����ȴ� 
	//Frame->window���� ��ӹ���
	public void paint(Graphics g){
		
		//Font f=new Font("Dialog",Font.BOLD,30);
		//g.setFont(f);
		g.setFont(new Font("Dialog",Font.BOLD,30));
		g.setColor(Color.blue);		
		g.drawString("������ ���",30,70);
		
		//RGB Color: Red,  Green,    Blue 
		           //0~255 0~255    0~255 
		//QBColor :16�� 
		
		//���׸���
		g.setColor(Color.red);
		g.drawLine(30,100,100,100);//x1,y1  x2,y2
		
		//�簢��
		g.setColor(Color.green);
		//g.drawRect(90, 130, 200, 200);
		//g.fillRect(90, 130, 200, 200);
		
		//���׸���
		g.setColor(Color.red);
		//g.drawOval(90, 130, 200, 200);
		//g.fillOval(90, 130, 200, 200);
		
		//�ձٻ簢��
		//g.drawRoundRect(90, 130, 200, 200,30,30);
		//g.fillRoundRect(90, 130, 200, 200,30,30);
		
		//ȣ �׸���
		//g.drawArc(160, 100, 200, 200, 30, 150);
		//g.fillArc(160, 100, 200, 200, 30, 150);
		
		//�ٰ����׸���
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
