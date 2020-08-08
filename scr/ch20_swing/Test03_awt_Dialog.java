package ch20_swing;
import java.awt.*;//layout
import java.awt.event.*;

import javax.swing.*;
public class Test03_awt_Dialog extends Frame implements ActionListener {
	
	//변수
	Button b1,b2,b3;
	
	//생성자
	public Test03_awt_Dialog(){
		b1=new Button("Massege");
		b2=new Button("confirm");
		b3=new Button("input");
		
		b1.setBackground(Color.blue);//배경색
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		
		b1.setForeground(Color.white);//전경색(글꼴색)
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		
		b1.setFont(new Font("Dialog",Font.BOLD,16));
		b2.setFont(new Font("Dialog",Font.BOLD,16));
		b3.setFont(new Font("Dialog",Font.BOLD,16));
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(b1);//Frame에 버튼 붙이기
		add(b2);
		add(b3);
		
		setBounds(200,200,350,350);//x,y,w,h
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter(){
			//무명inner class
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}//무명inner class
				);
	}//cons end
	
	//메서드(오버라이딩)
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this, "message.........");
		}else if(e.getSource()==b2){
			JOptionPane.showConfirmDialog(this, "confirm..........");
		}else if(e.getSource()==b3){
			String name=JOptionPane.showInputDialog(this,"대화명을 입력 하시오");
			System.out.println("당신의 대화명은"+name+"입니다");
		}//if end
		
		
		
	
	}//actionPerformed() end
	
	
	//main
	public static void main(String args[]){
		new Test03_awt_Dialog();
	}//main end
}//class end
