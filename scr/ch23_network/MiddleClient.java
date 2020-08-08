package ch23_network;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.*;
import javax.swing.*;

//Ŭ���̾�Ʈ
public class MiddleClient extends JFrame implements ActionListener,Runnable{
	
	//����
	JButton b1,b2,b3;
	JTextField tf;//��ȭ�����Է¶�
	JTextArea ta;//��ȭ��������� �뵵�� ���
	String name; //��ȭ�� ���� ����
	
	private DataInputStream in;
	private DataOutputStream out;
	private Thread thread;
	JScrollPane scrollPane;//ta�� ������ �������� ��ũ�ѹ� �ֱ����� 
	JScrollBar scrollBar;
	
	//������
	public MiddleClient(String ip,int port){
		try{
			Socket sock=new Socket(ip,port);//��������
			in=new DataInputStream(sock.getInputStream());//�о���� �غ�
			out=new DataOutputStream(sock.getOutputStream());//������ ������ �غ�
		}catch(Exception ex){
			System.out.println("���� ���� ����:"+ex);
			System.exit(0);
		}//catch
		
		ImageIcon icon1=new ImageIcon("e:\\imgs2\\a1.gif");
		b1=new JButton("����",icon1);
		b1.addActionListener(this);
		
		ImageIcon icon2=new ImageIcon("e:\\imgs2\\a2.gif");
		b2=new JButton("����Ʈ",icon2);
		b2.addActionListener(this);
		
		ImageIcon icon3=new ImageIcon("e:\\imgs2\\a3.gif");
		b3=new JButton("��������",icon3);
		b3.addActionListener(this);
		
		tf=new JTextField();
		tf.addActionListener(this);
		
		ta=new JTextArea();
		ta.setLineWrap(true);//������ ������ �ڵ����� �ٹٲ�
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,1));
		p.add(b1);//�����̳ʿ� ������Ʈ ���̱�
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
		tf.requestFocus();//��Ŀ�� ����
		
		//,��ȭ�� �ޱ�
		name=JOptionPane.showInputDialog(this,"��ȭ���� �Է��Ͻÿ�");
		
		thread =new Thread(this);
		thread.start();//�غ�ܰ�, run()ȣ��
		
	}//cons end
	
	//�������̵�
	//������ ��û�� �� ����� �뵵  
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==tf){
			//��ȭ������ ������ ������ ���
			try{
				String msg=tf.getText().trim();//��������
				if(msg.length()<1){
					JOptionPane.showMessageDialog(this, "��ȭ������ �Է��Ͻÿ�");
					tf.requestFocus();
					return;
				}//if
				
				//������ ������ �۾�
				out.writeUTF("["+name+"]���� ��>>"+msg);
				tf.setText("");
			}catch(Exception ex1){
				ta.append("������ �����͸� ������ �� ���ܹ߻�:"+ex1);
				ta.append("10���Ŀ� �����մϴ�");
				try{
					Thread.sleep(10000);
				}catch(Exception ex5){}
				System.exit(0);
			}//catch end
			
		}else if(e.getSource()==b1){//����
			int an=JOptionPane.showConfirmDialog(this,"�����ұ��?","����",JOptionPane.YES_NO_OPTION); 
			//    �θ�    �ɼ�             â����  
			
			switch(an){
				case JOptionPane.YES_OPTION:
					System.exit(0);
					break;
				case JOptionPane.NO_OPTION:
					break;
			}//switch end
		}else if(e.getSource()==b2){//����Ʈ
			ta.setText("");
			ta.append(name);
			
		}else if(e.getSource()==b3){//��������
			ta.setFont(new Font("Dialog",Font.BOLD,20));
			ta.setForeground(Color.blue);
			ta.setBackground(Color.yellow);
		}//else if
	}//actionPerformed()
	
	//�������̵�
	//������ ������ ������ ����ϴ� ���ó��
	public void run(){
		try{
			while(true){
				String str=in.readUTF();
				ta.append(str+"\n");
			}//while end
		}catch(Exception ex){
			ta.append("�����κ��� �����͸� �޴� �� ����:"+ex);
			ta.append("10���Ŀ� �����մϴ�");
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
