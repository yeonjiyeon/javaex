package ch23_network;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.*;
import javax.swing.*;

//클라이언트
public class MiddleClient extends JFrame implements ActionListener,Runnable{
	
	//변수
	JButton b1,b2,b3;
	JTextField tf;//대화내용입력란
	JTextArea ta;//대화내용출력할 용도로 사용
	String name; //대화명 넣을 변수
	
	private DataInputStream in;
	private DataOutputStream out;
	private Thread thread;
	JScrollPane scrollPane;//ta의 내용이 많아지면 스크롤바 넣기위해 
	JScrollBar scrollBar;
	
	//생성자
	public MiddleClient(String ip,int port){
		try{
			Socket sock=new Socket(ip,port);//서버접속
			in=new DataInputStream(sock.getInputStream());//읽어오기 준비
			out=new DataOutputStream(sock.getOutputStream());//데이터 내보낼 준비
		}catch(Exception ex){
			System.out.println("서버 접속 실패:"+ex);
			System.exit(0);
		}//catch
		
		ImageIcon icon1=new ImageIcon("e:\\imgs2\\a1.gif");
		b1=new JButton("종료",icon1);
		b1.addActionListener(this);
		
		ImageIcon icon2=new ImageIcon("e:\\imgs2\\a2.gif");
		b2=new JButton("리스트",icon2);
		b2.addActionListener(this);
		
		ImageIcon icon3=new ImageIcon("e:\\imgs2\\a3.gif");
		b3=new JButton("색상지정",icon3);
		b3.addActionListener(this);
		
		tf=new JTextField();
		tf.addActionListener(this);
		
		ta=new JTextArea();
		ta.setLineWrap(true);//내용이 많으면 자동으로 줄바꿈
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(b1);//컨테이너에 컴포넌트 붙이기
		p.add(b2);
		p.add(b3);
		
		scrollPane=new JScrollPane(ta);
		scrollBar=scrollPane.getVerticalScrollBar();
		scrollBar.setValue(scrollBar.getMaximum());
		
		this.getContentPane().add(p,"East");
		this.getContentPane().add(scrollPane,"Center");
		this.getContentPane().add(tf,"South");
		
		this.setSize(450,450);
		this.setVisible(true);
		tf.requestFocus();//포커스 설정
		
		//,대화명 받기
		name=JOptionPane.showInputDialog(this,"대화명을 입력하시오");
		
		thread =new Thread(this);
		thread.start();//준비단계, run()호출
		
	}//cons end
	
	//오버라이딩
	//서버로 요청할 때 사용할 용도  
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==tf){
			//대화내용을 서버로 보내는 기능
			try{
				String msg=tf.getText().trim();//공백제거
				if(msg.length()<1){
					JOptionPane.showMessageDialog(this, "대화내용을 입력하시오");
					tf.requestFocus();
					return;
				}//if
				
				//서버로 보내는 작업
				out.writeUTF("["+name+"]님의 말>>"+msg);
				tf.setText("");
			}catch(Exception ex1){
				ta.append("서버로 데이터를 보내던 중 예외발생:"+ex1);
				ta.append("10초후에 종료합니다");
				try{
					Thread.sleep(10000);
				}catch(Exception ex5){}
				System.exit(0);
			}//catch end
			
		}else if(e.getSource()==b1){//종료
			int an=JOptionPane.showConfirmDialog(this,"종료할까요?","종료",JOptionPane.YES_NO_OPTION); 
			//    부모    옵션             창제목  
			
			switch(an){
				case JOptionPane.YES_OPTION:
					System.exit(0);
					break;
				case JOptionPane.NO_OPTION:
					break;
			}//switch end
		}else if(e.getSource()==b2){//리스트
			ta.setText("");
			ta.append(name);
			
		}else if(e.getSource()==b3){//색상지정
			ta.setFont(new Font("Dialog",Font.BOLD,20));
			ta.setForeground(Color.blue);
			ta.setBackground(Color.yellow);
		}//else if
	}//actionPerformed()
	
	//오버라이딩
	//서버가 보내준 내용을 출력하는 기능처리
	public void run(){
		try{
			while(true){
				String str=in.readUTF();
				ta.append(str+"\n");
			}//while end
		}catch(Exception ex){
			ta.append("서버로부터 데이터를 받던 중 예외:"+ex);
			ta.append("10초후에 종료합니다");
			try{
				Thread.sleep(10000);
			}catch(Exception ex5){}
			System.exit(0);
		}//catch end
	}//run()
	
	//main
	public static void main(String args[]){
		new MiddleClient(args[0],Integer.parseInt(args[1]));
	}//main end
}//class end
