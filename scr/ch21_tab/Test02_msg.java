package ch21_tab;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test02_msg extends JPanel implements ActionListener{
	//전역변수
	JButton b1,b2,b3;
	
	//생성자
	public Test02_msg(){
		ImageIcon icon1=new ImageIcon("e:\\imgs2\\a1.gif");
		ImageIcon icon2=new ImageIcon("e:\\imgs2\\a2.gif");
		ImageIcon icon3=new ImageIcon("e:\\imgs2\\a3.gif");
		
		b1=new JButton("정보",icon1);
		b2=new JButton("경고",icon2);
		b3=new JButton("에러",icon3);
		
		b1.setToolTipText("정보대화상자입니다");
		b2.setToolTipText("경고대화상자입니다");
		b3.setToolTipText("에러대화상자입니다");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(b1);//컨테이너에 컴포넌트 붙이기
		add(b2);//컨테이너에 컴포넌트 붙이기
		add(b3);//컨테이너에 컴포넌트 붙이기
		
		setSize(350,350);//창크기
		setVisible(true);//창표시
		
		//창종료=프로그램종료
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons end
	
	//오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this,"정보전달 메시지.......");
		}else if(e.getSource()==b2){
			JOptionPane.showMessageDialog(this, "경고 메시지...","경고",JOptionPane.WARNING_MESSAGE);
		}else if(e.getSource()==b3){
			JOptionPane.showMessageDialog(this, "에러 메시지...","에러",JOptionPane.ERROR_MESSAGE);
			                          //   부모    메시지                창제목   아이콘
		}//if
	}//actionPerformed()end
	
	/*
	public static void main(String args[]){
		new Test02_msg();
	}main end */
}//class end  
//컴파일=저장
	
