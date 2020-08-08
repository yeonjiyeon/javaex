package ch20_swing;
import java.awt.*;//layout
import java.awt.event.*;

import javax.swing.*;
public class Test03_awt_Dialog extends Frame implements ActionListener {
	
	//����
	Button b1,b2,b3;
	
	//������
	public Test03_awt_Dialog(){
		b1=new Button("Massege");
		b2=new Button("confirm");
		b3=new Button("input");
		
		b1.setBackground(Color.blue);//����
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		
		b1.setForeground(Color.white);//�����(�۲û�)
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		
		b1.setFont(new Font("Dialog",Font.BOLD,16));
		b2.setFont(new Font("Dialog",Font.BOLD,16));
		b3.setFont(new Font("Dialog",Font.BOLD,16));
		
		//�̺�Ʈ ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(b1);//Frame�� ��ư ���̱�
		add(b2);
		add(b3);
		
		setBounds(200,200,350,350);//x,y,w,h
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter(){
			//����inner class
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}//����inner class
				);
	}//cons end
	
	//�޼���(�������̵�)
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "message.........");
		}else if(e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "confirm..........");
		}else if(e.getSource()==b3){
			String name=JOptionPane.showInputDialog(this,"��ȭ���� �Է� �Ͻÿ�");
			System.out.println("����� ��ȭ����"+name+"�Դϴ�");
		}//if end
		
		
		
	
	}//actionPerformed() end
	
	
	//main
	public static void main(String args[]){
		new Test03_awt_Dialog();
	}//main end
}//class end
