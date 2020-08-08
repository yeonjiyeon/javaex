package ch20_swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test05_table extends JFrame {
	//변수
	JTable table;
	
	//생성자
	public Test05_table(){
		String cols[]={"이름","나이","이메일"};
		Object data[][]={
				{"갑순이","17","g@nate.com"},
				{"갑돌이","19","g2@nate.com"},
				{"성춘향","16","s@nate.com"},
				{"이도령","20","lee@nate.com"},
				{"마당쇠","18","m@nate.com"},
				{"향단이","16","h@nate.com"},
				{"월매","85","w@nate.com"},
				{"아이유","28","iu@nate.com"},
				{"송중기","34","d@nate.com"},
				{"이상순","45","f@nate.com"}
		};
		
		table= new JTable(data,cols);
		JScrollPane jScrollPane=new JScrollPane(table);//테이블내용이 많을 때 스크롤바 넣으려고 
		
		getContentPane().add(jScrollPane,"Center");
		setSize(350,350);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 종료
	}//cons end
	//오버로드
	
	//main
	public static void main(String args[]){
		new Test05_table();
	}
}//class end
