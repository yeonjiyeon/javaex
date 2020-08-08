package ch21_tab;
import java.awt.*;
import javax.swing.*;
public class Test07_tab extends JFrame{
	//변수
	Test02_msg t2=new Test02_msg();
	Test04_img t4=new Test04_img();
	Test06_table t6= new Test06_table();
	
	JTabbedPane tab=new JTabbedPane();
	
	//생성자
	public Test07_tab(){
		tab.add("t2_Dialog",t2);
		tab.add("t4_img",t4);
		tab.add("t6_table",t6);
		
		this.getContentPane().setLayout(new GridLayout(1,1));
		this.getContentPane().add(tab);
		
		this.setSize(350,350);
		this.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//cons end
	
	//main
	public static void main(String args[]){
		new Test07_tab();
	}
	
}//class end
