package ch20_swing;
import java.awt.*;//layout=> 컴포넌트배치
import javax.swing.*;

public class Test01_swing extends JFrame{
	//전역변수
	JButton b1,b2,b3;
	
	//생성자
	public Test01_swing(){
		getContentPane().setLayout(new FlowLayout());
		
		ImageIcon icon1=new ImageIcon("e:\\imgs2\\a1.gif");
		ImageIcon icon2=new ImageIcon("e:\\imgs2\\a2.gif");
		ImageIcon icon3=new ImageIcon("e:\\imgs2\\a3.gif");
		
		b1=new JButton("1번",icon1);
		b2=new JButton("2번",icon2);
		b3=new JButton("3번",icon3);
		
		b1.setToolTipText("내가 만든 첫번째 버튼입니다");
		b2.setToolTipText("내가 만든 두번째 버튼입니다");
		b3.setToolTipText("내가 만든 세번째 버튼입니다");
		
		//JButton에 버튼 붙이기
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		
		setBounds(200,200,350,350);//x,y,w,h
		setVisible(true);
		
		//창종료=프로그램종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new Test01_swing();
	}
}//class end
