package ch11_awt;
import java.awt.*;
import java.awt.event.*;
public class Test08_Mouse extends Frame{
	//����
	
	//������
	public Test08_Mouse(){
		setTitle("â�̸�");
		
		//�̺�Ʈ���
		addMouseListener(new Mymouse());
		addWindowListener(new MYwin());
		setBounds(500,500,500,500);
		setVisible(true);
	}//cons end
	
	//inner class 
	class MYwin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);//
		}
	}//inner  class end
	
	
	//��������
	int x,y;
	String name="";
	
	//inner class2
	class Mymouse extends MouseAdapter{
		//�������̵�
		public void mousePressed(MouseEvent me){
			//���ʹ�ư ������ ���̸�, �����ʹ�ư ������ ģ���̸�  
			if(me.getButton()==me.BUTTON1){//���ʹ�ư
				name="���̸��� �ڹ���";
				x=me.getX();
				y=me.getY();
				repaint(); //update()==>clearRect()==>paint() : jvm�� ���ؼ� ȣ��Ǿ���
			}else if(me.getButton()==me.BUTTON3){//������ ��ư
				name="��ģ�� ������";
				x=me.getX();
				y=me.getY();
				repaint();//update()==>clearRect()==>paint() : jvm�� ���ؼ� ȣ��Ǿ���
			}else if(me.getButton()==me.BUTTON2){//��
				System.exit(0);//���α׷�����
				
			}//
			
			
		}//mousePressed end
	}//inner class end
	//�޼���:�������̵�
	public void paint(Graphics g){
		g.setFont(new Font("Dialog",Font.PLAIN,29));
		g.setColor(Color.green);
		g.drawString(name,x,y);
	}//paint() end
	
	public static void main(String args[]){
		new Test08_Mouse();
	}
	//�޼���
}//class end
