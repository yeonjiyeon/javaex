package ch20_swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Test04_img extends Frame implements ActionListener{
	//변수
	Image img;
	int num=6;
	Button b[][];
	Dimension d;
	
	//생성자
	public Test04_img(){
		b=new Button[num][num];//배열 생성
		setLayout(new GridLayout(num,num));
		setFont(new Font("Dialog",Font.BOLD,50));
		
		int a=1; //버튼에 번호 넣으려고
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				b[i][j]=new Button(""+a++);//객체생성
				b[i][j].setBackground(Color.blue);
				b[i][j].setForeground(Color.white);
				b[i][j].addActionListener(this);
				add(b[i][j]);//Frame에 버튼 붙이기
				
			}//inner for
		}//out for
		
		//
		img=Toolkit.getDefaultToolkit().getImage("e:\\imgs2\\t16.jpg");
		setSize(500,500);
		setVisible(true);
		
		//무명 inner class
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		}	
				);
		
	}//cons end
	
	
	public void paint(Graphics g){
		d=getSize();//창크키 구한다
		g.drawImage(img,0,0,d.width,d.height,this);
	}
	
	
	//오버라이딩
	public void actionPerformed(ActionEvent e){
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){		
		if (e.getSource()==b[i][j]){
			int an=JOptionPane.showConfirmDialog(this,"자바는 쉽다","질문",JOptionPane.YES_NO_OPTION);
			
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
