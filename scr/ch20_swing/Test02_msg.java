package ch20_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test02_msg extends JFrame implements ActionListener{
	//��������
	JButton b1,b2,b3;
	
	//������
	public Test02_msg(){
		ImageIcon icon1=new ImageIcon("e:\\imgs2\\a1.gif");
		ImageIcon icon2=new ImageIcon("e:\\imgs2\\a2.gif");
		ImageIcon icon3=new ImageIcon("e:\\imgs2\\a3.gif");
		
		b1=new JButton("����",icon1);
		b2=new JButton("���",icon2);
		b3=new JButton("����",icon3);
		
		b1.setToolTipText("������ȭ�����Դϴ�");
		b2.setToolTipText("����ȭ�����Դϴ�");
		b3.setToolTipText("������ȭ�����Դϴ�");
		
		//�̺�Ʈ ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(b1);//�����̳ʿ� ������Ʈ ���̱�
		getContentPane().add(b2);//�����̳ʿ� ������Ʈ ���̱�
		getContentPane().add(b3);//�����̳ʿ� ������Ʈ ���̱�
		
		setSize(350,350);//âũ��
		setVisible(true);//âǥ��
		
		//â����=���α׷�����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons end
	
	//�������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this,"�������� �޽���.......");
		}else if(e.getSource()==b2){
			JOptionPane.showMessageDialog(this, "��� �޽���...","���",JOptionPane.WARNING_MESSAGE);
		}else if(e.getSource()==b3){
			JOptionPane.showMessageDialog(this, "���� �޽���...","����",JOptionPane.ERROR_MESSAGE);
			                          //   �θ�    �޽���                â����   ������
		}//actionPerformed()end
	}
	
	public static void main(String args[]){
		new Test02_msg();
	}
}//class end

	
