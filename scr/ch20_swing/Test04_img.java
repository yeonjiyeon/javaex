package ch20_swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Test04_img extends Frame implements ActionListener{
	//����
	Image img;
	int num=6;
	Button b[][];
	Dimension d;
	
	//������
	public Test04_img(){
		b=new Button[num][num];//�迭 ����
		setLayout(new GridLayout(num,num));
		setFont(new Font("Dialog",Font.BOLD,50));
		
		int a=1; //��ư�� ��ȣ ��������
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				b[i][j]=new Button(""+a++);//��ü����
				b[i][j].setBackground(Color.blue);
				b[i][j].setForeground(Color.white);
				b[i][j].addActionListener(this);
				add(b[i][j]);//Frame�� ��ư ���̱�
				
			}//inner for
		}//out for
		
		//
		img=Toolkit.getDefaultToolkit().getImage("e:\\imgs2\\t16.jpg");
		setSize(500,500);
		setVisible(true);
		
		//���� inner class
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}	
				);
		
	}//cons end
	
	
	public void paint(Graphics g){
		d=getSize();//âũŰ ���Ѵ�
		g.drawImage(img,0,0,d.width,d.height,this);
	}
	
	
	//�������̵�
	public void actionPerformed(ActionEvent e){
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){		
		if (e.getSource()==b[i][j]){
			int an=JOptionPane.showConfirmDialog(this,"�ڹٴ� ����","����",JOptionPane.YES_NO_OPTION);
			
			switch(an){
				case JOptionPane.YES_OPTION:
					b[i][j].setVisible(false);
					break;
				case JOptionPane.NO_OPTION:
					break;
			}//switch end
		}//if end
			}//inner for
		}//out for
	}//actionPerformed() end
	
	
	
	
	//main
	public static void main(String args[]){
		new Test04_img();
	}//main end
}//class end
