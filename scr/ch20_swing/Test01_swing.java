package ch20_swing;
import java.awt.*;//layout=> ������Ʈ��ġ
import javax.swing.*;

public class Test01_swing extends JFrame{
	//��������
	JButton b1,b2,b3;
	
	//������
	public Test01_swing(){
		getContentPane().setLayout(new FlowLayout());
		
		ImageIcon icon1=new ImageIcon("e:\\imgs2\\a1.gif");
		ImageIcon icon2=new ImageIcon("e:\\imgs2\\a2.gif");
		ImageIcon icon3=new ImageIcon("e:\\imgs2\\a3.gif");
		
		b1=new JButton("1��",icon1);
		b2=new JButton("2��",icon2);
		b3=new JButton("3��",icon3);
		
		b1.setToolTipText("���� ���� ù��° ��ư�Դϴ�");
		b2.setToolTipText("���� ���� �ι�° ��ư�Դϴ�");
		b3.setToolTipText("���� ���� ����° ��ư�Դϴ�");
		
		//JButton�� ��ư ���̱�
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		
		setBounds(200,200,350,350);//x,y,w,h
		setVisible(true);
		
		//â����=���α׷�����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new Test01_swing();
	}
}//class end
