package ch24_network;
/*   ��������
 * ��������            100
 * �游���               200
 * �����            210
 * ��ȭ�濡�� ��ȭ�ϱ� 400
 * ��ȭ�� ����           420
 * �ӼӸ�                 450
 * ������                 290
 * ����                    900
 */
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;//Vector

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MainClient extends JFrame implements ActionListener,Runnable,MouseListener{
	//����
	Socket s;
	BufferedReader in;
	OutputStream out;//byte stream
	
	String name;//��ȭ��
	String ip;
	String title="����";
	
	Object[][] data1=new String[0][2];//�࿭
	String []cols1={"������","�ο�"};
	DefaultTableModel model1=new DefaultTableModel(data1,cols1){
		//�� �������ϰ� �ϱ�
		public boolean isCellEditable(int rows,int cols){
			return false;
		}
	};//DefaultTableModel�� �־�� ���̺��� ���뼺�ְ� ����� �� ����(ex)addRow()��밡��)
	JTable table1=new JTable(model1);
	JScrollPane scrollPane1=new JScrollPane(table1);
	
	Object[][] data2=new String[0][1];//�࿭
	String[]cols2={"��ȭ��"};
	DefaultTableModel model2=new DefaultTableModel(data2,cols2);
	//                                              ������  ����
	JTable table2=new JTable(model2);
	JScrollPane scrollPane2=new JScrollPane(table2);
	
	Object[][]data3=new Object[0][2];//�࿭
	String []cols3={"��ȭ��","��ġ"};
	DefaultTableModel model3=new DefaultTableModel(data3,cols3);
	JTable table3=new JTable(model3);
	JScrollPane scrollPane3=new JScrollPane(table3);
	
	JButton createB=new JButton("�游���");
	JButton roominB=new JButton("�����");
	JButton exitB=new JButton("�� ��");
	
	RoomClient roomclient=new RoomClient();//��ȭ��
	
	//������
	public MainClient(String ip){
		setTitle("MainClient");
		this.ip=ip;
		
		table1.getTableHeader().setReorderingAllowed(false);//������ ���� ���ϰ� �Ѵ�
		table2.getTableHeader().setReorderingAllowed(false);
		table3.getTableHeader().setReorderingAllowed(false);
		
		table1.getTableHeader().setBackground(new Color(204,153,153));
		table2.getTableHeader().setBackground(new Color(204,204,255));
		table3.getTableHeader().setBackground(new Color(204,204,255));
		
		createB.setBackground(new Color(153,153,255));
		roominB.setBackground(new Color(153,153,255));
		exitB.setBackground(new Color(153,153,255));
		
		setLayout(null);//************
		
		scrollPane1.setBounds(10,10,400,250);
		getContentPane().add(scrollPane1);
		//getContentPane().add(scrollPane1).setBounds(10,10,400,250); ���ٷ� ���� �͵� ������ 
		
		scrollPane2.setBounds(415,10,168,250);
		getContentPane().add(scrollPane2);
		
		scrollPane3.setBounds(10,270,400,197);
		getContentPane().add(scrollPane3);
		
		createB.setBounds(449,300,100,30);
		getContentPane().add(createB);
		
		roominB.setBounds(449,340,100,30);
		getContentPane().add(roominB);
		
		exitB.setBounds(449,380,100,30);
		getContentPane().add(exitB);
		
		name=JOptionPane.showInputDialog(null,"��ȭ���� �Է� �ϼ���","");
		//                               �ҼӾȽ�Ŵ  �޽���                      ����
		
		name=name.trim();//��������
		if(name==null || name.length()<1){
			JOptionPane.showMessageDialog(null,"��ȭ���� �Է� �ϼ���");
			return;
		}//if 
		setSize(600,500);
		setVisible(true);
		
		eventUp();//��������� �޼��� ȣ��
		connectProcess();//����� ���� �޼��� ȣ��,���� ����
	}//cons end
	
	//��������� �޼���
	public void eventUp(){
		createB.addActionListener(this);
		roominB.addActionListener(this);
		exitB.addActionListener(this);
		
		table1.addMouseListener(this);
		
		
		//RoomClient �̺�Ʈ ���
		roomclient.tf.addActionListener(this);
		roomclient.nickB.addActionListener(this);
		roomclient.sayB.addActionListener(this);
		roomclient.outB.addActionListener(this);
		
		
	}//eventUp() end
	
	
	////��������� �޼���:��������
	public void connectProcess(){
		try{
		s=new Socket(ip,7777);// ���� ������ ip,port �μ��� �޴´� 	
		in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		out=s.getOutputStream();
		
		out.write((name+"\r\n").getBytes());// readUTF(),writeUTF()
		//                        ���ڵ��۾�: �ѱ��� ������ �ʵ���
		new Thread(this).start();//run()ȣ��
		}catch(Exception ex){
			System.out.println("���� ���� ����:"+ex);
		}//catch end
	}//connectProcess() end
	
	//��������� �޼���:
	public void closeProcess(){
		try{
			roomclient.setVisible(false);//��ȭâ�� �Ⱥ��̰� �Ѵ�
			roomclient.dispose();//���ҽ���ȯ
			out.write(("900|\r\n").getBytes());
			
			s.close();
			in.close();
			out.close();
			
		}catch(Exception ex){}
	}
	//�������̵�
	public void mousePressed(MouseEvent e){
		model2.setRowCount(0);//���̺��� ��� �����
		
		int r=table1.getSelectedRow();//������ ���� ��´�
		String temp=(String)model1.getValueAt(r,0);//�������� ��´�
		
		for(int i=0;i<model3.getRowCount();i++){
			String roomt=(String)model3.getValueAt(i, 1);
			if(temp.equals(roomt)){//�������� ������
				Object ob[]={model3.getValueAt(i, 0)};
				model2.addRow(ob);
			}//if end
		}//for end
		
	}//mousePressed()
	
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	//������ ��û�� �ϴ� �κ�
	public void actionPerformed(ActionEvent e){
		Object ob=e.getSource();
		
		if(ob==createB){//�游���
			title=JOptionPane.showInputDialog(this,"�������� �Է��Ͻÿ�");

			if(title==null || title.length()<1){
				JOptionPane.showMessageDialog(this,"������ �Է��϶��~~~");
				return;
			}//if

			try{
				out.write(("200|"+title+"\r\n").getBytes());//������ ��û
			}catch(Exception ex){}

		}//if
			
		if(ob==roominB){//�� ����
			int row=table1.getSelectedRow();//������ ���� ��´�
			if(row<0){//0��0��
				JOptionPane.showMessageDialog(this,"���� ���� �����ϼ���");
				return;
			}//if

			title=(model1.getValueAt(row,0)).toString();//��������

			try{
				out.write(("210|"+title+"\r\n").getBytes());//������ ������
			}catch(Exception ex){}
		}//if
			
		if(ob==roomclient.tf){//��ȭ�ϱ�
			String msg=roomclient.tf.getText().trim();
			roomclient.tf.setText("");
			if(msg.length()<1){//��ȭ ������ ������
				return;
			}//if

			try{
				out.write(("400|"+msg+"\r\n").getBytes());//�޽����� ������ ������
				roomclient.tf.setText("");
			}catch(Exception ex){}
		}//if
		
		if(ob==roomclient.outB){//��ȭ�濡�� ������
			try{
				out.write(("290|\r\n").getBytes());//������ ������
			}catch(Exception ex){}
			title="����";
		}//if end
		
		//��ȭ����
		if(ob==roomclient.nickB){
			String newName=JOptionPane.showInputDialog(roomclient,"������ ��ȭ���� �Է��Ͻÿ�","");
			newName=newName.trim();
			if(newName==null||newName.length()<1){
				JOptionPane.showMessageDialog(null, "���ο� ��ȭ���� �Է��Ͻÿ�");
				return;
			}//if
			
			//�̹� ������� ��ȭ���϶�
			for(int i=0; i<roomclient.model1.getRowCount();i++){
				String nname=(String)roomclient.model1.getValueAt(i, 0);//��ȭ���� ������
				if(newName.equals(nname)){//��ȭ��񱳸� �Ͽ� ��ġ�ϴ� ���� ������
					JOptionPane.showMessageDialog(null, "������� ��ȭ���Դϴ�");
					return;
				}//if
			}//for
			
			try{
				out.write(("420|"+newName+"\r\n").getBytes());//������ ������
			}catch(Exception ex){}
			
		}//if
		
		//�ӼӸ�
		if(ob==roomclient.sayB){
			int row=roomclient.table1.getSelectedRow();//�ӼӸ� ���� ������ ����
			
			if(row<0){
				JOptionPane.showMessageDialog(null, "�ӼӸ����� ������ ���� �Ͻÿ�");
				return;
			}//if
			String sayName=(roomclient.model1.getValueAt(row,0).toString());//��ȭâ���� ��ȭ����
			String say=JOptionPane.showInputDialog(roomclient,"�ӼӸ��� �Է��Ͻÿ�");
			
			if(say==null ||say.length()<1){
				return;
			}//if
			try{
				out.write(("450|"+sayName+"|"+say+"\r\n").getBytes());//������ ������  
				
				//�ڽ��� ��ȭâ���� ���
				roomclient.ta.append("[�ͼӸ�(to)]"+sayName+">>"+say+"\n");
			}catch(Exception ex){}
		}//if
		
		//����
		if(ob==exitB){
			closeProcess();//�޼��� ȣ��
			System.exit(0);
		}//if
	}//actionPerformed()
	//������ ������ ������ ����ϴ� Ŭ���̾�Ʈ ȭ�鿡 �ݿ�
	int protocol=0;//����
	public void run(){
		while(true){
			try{
				String msg=in.readLine();//������ ������ ������ �޴´�
				if(msg==null){return;}
				//msg="100|��ȭ��|����ġ"
				StringTokenizer token=new StringTokenizer(msg,"|");
				protocol=Integer.parseInt(token.nextToken());
				
				switch(protocol){
				case 100:{//��������
					String ob[]={token.nextToken(),token.nextToken()};
					model3.addRow(ob);
					break;
				}//100
				case 200:{//�游��� 
					String ob[]={token.nextToken(),token.nextToken()};
					//                  ������                 �ο�
					model1.addRow(ob);
					break;
				}//200
				case 210:{//�����
					String n=token.nextToken();//��ȭ�� �ް� 
					String t=token.nextToken();//������ �ް� 
					
					//model3 ������ ���������� ����
					for(int i=0;i<model3.getRowCount();i++){
						String temp=(String)model3.getValueAt(i, 0);//��ȭ��
						if(temp.equals(n)){//��ȭ���� ��ġ�ϸ�
							model3.setValueAt(t, i, 1);//���������� ����
							break;//for Ż��
						}//if
					}//for end
					
					//model1�� �ο��� ����
					for(int i=0;i<model1.getRowCount();i++){
						String temp=(String)model1.getValueAt(i, 0);//������
						if(temp.equals(t)){//���̸��� ��ġ�ϸ�
							int inwon=Integer.parseInt(model1.getValueAt(i,1)+"");
							model1.setValueAt(++inwon, i, 1);//�ο� ����
							break;
						}//if
					}//for
					
					if(n.equals(name)){//n�� ������ ������ ��ȭ��
						//���� �濡 �� �� ȣ��
						roomInProcess();//�޼��� ȣ��
					}else if(t.equals(title)){
						//�ٸ� ����� ��ȭ�濡 ���� ��  
						Object ob[]={n};
						roomclient.model1.addRow(ob);//��ȭ�濡�� ��ȭ���� �߰�
						roomclient.inwon.setText(roomclient.model1.getRowCount()+"");//�� �ο�����
						roomclient.ta.append("***["+n+"] ���� �����Ͽ����ϴ�***\n");
					}
					break;
				}//210
				case 400:{//��ȭ�濡�� ��ȭ�ϱ�
					roomclient.ta.append("\n"+token.nextToken()+" ");
					
					break;
				}//400
				case 290:{//������
					String n=token.nextToken();//��ȭ��
					String t=token.nextToken();//������
					
					//model1 �ο�����
					for(int i=0;i<model1.getRowCount();i++){
						String temp=(String)model1.getValueAt(i, 0);//��������
						
						if(t.equals(temp)){//�������� ��ġ�ϸ�
							int inwon=Integer.parseInt(model1.getValueAt(i,1)+"");//�ο��� ������
							if(inwon==1){
								model1.removeRow(i);//1���� �ִٰ� ��������, �����
							}else{
								model1.setValueAt(--inwon,i,1);//�ο� ����
							}//else end
							break; //for Ż��
						}//if
					}//for end:�ο�����
					
					//model3�� ��ȭ���̸��� ���Ƿ� ����
					for(int i=0;i<model3.getRowCount();i++){
						String temp=(String)model3.getValueAt(i, 0);//��ȭ���� ������
						if(n.equals(temp)){//��ȭ���� ��ġ�ϸ�
							model3.setValueAt("����", i, 1);
							break;//for Ż��
						}//if
					}//for end 
					
					//��ȭ�濡�� ���� ������
					if(n.equals(name)){//��ȭ���� ��ġ�ϸ�
						roomOutProcess();//�޼��� ȣ��
					}//if
					
					//��ȭ�濡�� �ٸ������ ������
					if(t.equals(title)){
						//��ȭ�濡�� ���� ���� ��� ����
						for(int i=0;i<roomclient.model1.getRowCount();i++){
							String temp=(String)roomclient.model1.getValueAt(i,0);//��ȭ���� ������ 
							if(n.equals(temp)){//��ȭ���� ��ġ�ϸ� ����
								roomclient.model1.removeRow(i);//���� �������
								break;//for Ż��
							}//if
						}//for
						roomclient.inwon.setText(roomclient.model1.getRowCount()+"");//�ο��� ����
						roomclient.ta.append("***["+n+"]�� �����Ͽ����ϴ�***\n");
					}//if
					
					break;
				}//290
				case 420:{// ��ȭ�� ����
					String oldN=token.nextToken();//������ ������ ������ȭ��
					String newN=token.nextToken();//������ ������ ���ο� ��ȭ��
					String t=token.nextToken();//������ ������ ������
					
					//model3�� ��ȭ���� ���̸����� �����۾�
					for(int i=0;i<model3.getRowCount();i++){
						String nn=(String)model3.getValueAt(i, 0);//��ȭ���� ������ 
						if(oldN.equals(nn)){//��ȭ���� ��ġ�ϸ� ���ο� ��ȭ������ ����
							model3.setValueAt(newN,i,0);
							break;//for Ż��
						}//if
					}//for 
					
					//��ȭ���� ��ȭ�� ����
					if(t.equals(title)){
						for(int i=0;i<roomclient.model1.getRowCount();i++){
							String nn=(String)roomclient.model1.getValueAt(i,0);//��ȭ���� ������
							if(oldN.equals(nn)){//��ȭ���� ��ġ�ϸ�,��ȭ�� ����
								roomclient.model1.getValueAt(i,0);//��ȭ���� ������ 
								break;//for Ż��
							}//if
						}//for
						roomclient.ta.append("***["+oldN+"]���� ��ȭ���� ["+newN+"] �� �ٲ�����ϴ�***\n");
					}//if
					
					if(oldN.equals(name)){
						name=newN;
					}//if
					
					break;
				}//420
				case 450:{//�ӼӸ�
					String n=token.nextToken();//��ȭ��
					String str=token.nextToken();//�ӼӸ�
					roomclient.ta.append("[�ӼӸ�(from)]"+n+">>"+str+"\n");
					
					break;
					
				}//450
				case 900:{//����
				  String n=token.nextToken();//��ȭ��
				  String t=token.nextToken();//������,����
					
				  //model3���� ����
				  for(int i=0;i<model3.getRowCount();i++){
					  String temp=(String)model3.getValueAt(i, 0);//��ȭ���� ������ 
					  if(temp.equals(n)){//��ȭ���� ��ġ�ϸ� ����
						  model3.removeRow(i);
						  break;//for Ż��
					  }//if
				  }//for
				  
				  //��ȭ�� ������ �� model1���� �ο�������
				  if(!t.equals("����")){
					  for(int i=0;i<model1.getRowCount();i++){
						  String temp=(String)model1.getValueAt(i, 0);//�������
						  if(temp.equals(t)){//�� ������ ��ġ�ϸ�
							  int a=Integer.parseInt(model1.getValueAt(i, 1).toString());//�ο����� ������
							  if(--a==0){//ȥ�� �ִٰ� ��������
								  model1.removeRow(i);//�����
							  }else{
								  model1.setValueAt(a+"", i, 1);//�ο�����
							  }//else
							  break;//for Ż��
						  }//if
					  }//for end
				  }//if ����
				  
				  //��ȭ�濡�� �ٸ� ����� ���� ���
				  if(t.equals(title)){
					  for(int i=0;i<roomclient.model1.getRowCount();i++){
						  String temp=(String)roomclient.model1.getValueAt(i,0);//��ȭ���� ������
						  
						  if(temp.equals(n)){//��ȭ���� ã�Ƽ�
							  roomclient.model1.removeRow(i);//���� �������
							  break;//for Ż��
						  }//if
					  }//for end
					  roomclient.inwon.setText(roomclient.model1.getRowCount()+"");//�ο�����
					  roomclient.ta.append("***["+n+"]���� ���� �Ͽ����ϴ�");
				  }//if
					break;
				}//900
				
				}//switch end
				
			}catch(Exception ex){
				System.out.println("run()���� ������ ���� ����"+ex);
				return;
			}//catch end
		}//while end
	}//run() end
	
	//��������� �޼���:
	//���� �濡 ����
	public void roomInProcess(){
		roomclient.setVisible(true);
		roomclient.tf.requestFocus();
		
		roomclient.ta.append("***["+title+"] �濡 �����Ͽ����ϴ�\n");
		for(int i=0;i<model3.getRowCount();i++){
			String temp=(String)model3.getValueAt(i,1);//����ġ�� ��´�
			if(temp.equals(title)){//���� ���̸�
				Object ob[]={model3.getValueAt(i,0)};//��ȭ���� ������ 
				roomclient.model1.addRow(ob);//��ȭâ�� ��ȭ�� �Ѹ���
			}//if end
		}//for end
		roomclient.inwon.setText(roomclient.model1.getRowCount()+"");
		roominB.setEnabled(false);//����� ��Ȱ��ȭ
		createB.setEnabled(false);//�游��� ��Ȱ��ȭ
	}//roomInProcess() end
	
	//��������� �޼���
	//���� ��ȭ�濡�� ���� �� 
	public void roomOutProcess(){
		roomclient.ta.setText("");//��ȭ���� ����
		roomclient.inwon.setText("");//�ο����� ����
		//���̺����� ��� �����
		//for(int i=0;i<roomclient.model1.getRowCount();i++){
			//roomclient.model1.removeRow(0);
		//}//for end
		
		roomclient.model1.setRowCount(0);//���̺����� ��� �����
		int a=roomclient.model1.getRowCount();
		roomclient.inwon.setText(a+"");
		roomclient.setVisible(false);//��ȭâ�� �Ⱥ��̰� �Ѵ�
		
		createB.setEnabled(true);//Ȱ��ȭ
		roominB.setEnabled(true);//Ȱ��ȭ
	}//roomOutProcess() end
	public static void main(String args[]){
		new MainClient(args[0]);
	}
}//class end




