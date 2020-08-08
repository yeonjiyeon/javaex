package ch24_network;
import java.awt.*;

import javax.swing.table.*;
import javax.swing.*;
import javax.swing.text.*;

public class RoomClient extends JFrame{
	//변수
	TextArea ta=new TextArea();//대화내용 출력할 곳
	TextField tf=new TextField();//대화내용 입력
	
	String data1[][]=new String[0][1];//0행,1열
	String cols1[]={"대화명"};
	DefaultTableModel model1=new DefaultTableModel(data1,cols1);
	JTable table1=new JTable(model1);
	JScrollPane roomInForPane=new JScrollPane(table1);
	
	JLabel lab1=new JLabel("현재인원");
	TextField inwon=new TextField(10); //////
	
	JButton nickB=new JButton("대화명변경");
	JButton sayB=new JButton("귓속말");
	JButton outB=new JButton("나가기");
	
	
	
	//생성자
	public RoomClient(){//생성자
		setTitle("");
		this.getContentPane().setLayout(null);
		
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setEditable(false);
		ta.setBounds(10,10,350,350);
		getContentPane().add(ta);
		
		table1.getTableHeader().setBackground(Color.yellow);
		roomInForPane.setBounds(370,10,200,250);
		getContentPane().add(roomInForPane);
		
		
		lab1.setBounds(370,270,60,30);//x,y,w,h
		getContentPane().add(lab1);
		
		inwon.setBounds(430,270,100,30);
		getContentPane().add(inwon);
		
		nickB.setBounds(370,310,160,30);
		getContentPane().add(nickB);
		
		sayB.setBounds(370,350,160,30);
		getContentPane().add(sayB);
		
		outB.setBounds(370,390,160,30);
		getContentPane().add(outB);
		
		tf.setBounds(10,380,350,40);
		getContentPane().add(tf);
		
		setSize(600,500);
		//setVisible(true);
	}//cons end
	
	
	//main
	/*public static void main(String args[]){
		new RoomClient();
	}*/
}//class end
