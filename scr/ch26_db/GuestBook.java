package ch26_db;
import java.awt.*;//Layout
import java.awt.event.*;

import javax.swing.*;//JFrame ���
import javax.swing.table.*;//DefaultTableModel

import java.sql.*;//DriverManager,Connection,Statement,PreparedStatement,ResultSet
public class GuestBook extends JFrame implements ActionListener{
	//��������=�ʵ�=�Ӽ�=property
	JLabel laJemok;//����
	JLabel laName,laId,laEmail,laTitle,laContent;
	JTextField tfName,tfId,tfEmail,tfTitle;
	JTextArea taContent;
	
	JButton buInsert,buUpdate,buDelete,buList,buExit;
	
	Object data[][]=new Object[0][5];
	Object cols[]={"�̸�","ID","Email","Title","�۳���"};
	DefaultTableModel model=new DefaultTableModel(data,cols);
	JTable table=new JTable(model);
	JScrollPane scrollpane=new JScrollPane(table);//��ũ�ѹ� ����Ϸ���
	
	String DRIVER="com.mysql.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3306/mydb"; //db�� �ִ� url
	String USER="root";
	String PWD="12345";
	
	Connection con=null;
	Statement stmt=null;
	PreparedStatement pstnt=null;
	ResultSet rs=null;
	
	UpdateTest updateTest=null;//*********
	//int i;
	//int j=10;
	
	//������
	public GuestBook(){
		getContentPane().setBackground(new Color(204,153,153));
		
		updateTest=new UpdateTest();//*******
		
		laJemok =new JLabel("GuestBook");
		laJemok.setFont(new Font("Dialog",Font.BOLD,25));
		//laJemok.setBackground(Color.yellow);
		laJemok.setForeground(Color.white);
		
		laName=new JLabel("�̸�",JLabel.RIGHT);
		laName.setForeground(Color.white);
		
		laId=new JLabel("ID",JLabel.RIGHT);
		laId.setForeground(Color.white);
		
		laEmail=new JLabel("Email",JLabel.RIGHT);
		laEmail.setForeground(Color.white);
		
		laTitle=new JLabel("Title",JLabel.RIGHT);
		laTitle.setForeground(Color.white);
		
		laContent=new JLabel("�۳���",JLabel.RIGHT);
		laContent.setForeground(Color.white);
		//---------
		tfName=new JTextField();
		tfId=new JTextField();
		
		tfEmail=new JTextField();
		tfTitle=new JTextField();
		taContent=new JTextArea();
		taContent.setBackground(Color.white);
		
		buInsert=new JButton("Insert");
		//buInsert.setBackground(new Color(153,102,102));
		buUpdate=new JButton("Update");
		buDelete=new JButton("Delete");
		buList=new JButton("List");
		buExit=new JButton("Exit");
		
		//���α׷��Ӱ� ��ġ�۾��� �Ϸ��� �Ʒ��� ���� null�� layout�� �����Ѵ�
		getContentPane().setLayout(null);
		
		getContentPane().add(laJemok).setBounds(220,30,300,30); //x,y,w,h
		getContentPane().add(laName).setBounds(80,70,50,20);
		getContentPane().add(laId).setBounds(80,100,50,20);
		getContentPane().add(laEmail).setBounds(80,130,50,20);
		getContentPane().add(laTitle).setBounds(80,160,50,20);
		getContentPane().add(laContent).setBounds(80,190,50,20);
		
		getContentPane().add(tfName).setBounds(150,70,300,20);
		getContentPane().add(tfId).setBounds(150,100,300,20);
		getContentPane().add(tfEmail).setBounds(150,130,300,20);
		getContentPane().add(tfTitle).setBounds(150,160,300,20);
		getContentPane().add(taContent).setBounds(150,190,300,100);
		
		getContentPane().add(buInsert).setBounds(80,300,80,30);
		getContentPane().add(buUpdate).setBounds(170,300,80,30);
		getContentPane().add(buDelete).setBounds(260,300,80,30);
		getContentPane().add(buList).setBounds(350,300,80,30);
		getContentPane().add(buExit).setBounds(440,300,80,30);
		
		getContentPane().add(scrollpane).setBounds(10,350,570,200);//table
		
		
		//�̺�Ʈ ���
		buInsert.addActionListener(this);
		buUpdate.addActionListener(this);
		updateTest.buUpdate.addActionListener(this);//********
		buDelete.addActionListener(this);
		buList.addActionListener(this);
		buExit.addActionListener(this);
		
		tfName.addActionListener(this);
		tfId.addActionListener(this);
		tfEmail.addActionListener(this);
		tfTitle.addActionListener(this);
		//taContent.addActionListener(this);
		
		
		//table ���콺 �̺�Ʈ ���
		table.addMouseListener(new MyMouse());
		
		setBounds(200,200,600,600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���α׷� ����
		
		//����̹� �ε�
		try{
			Class.forName(DRIVER);
			//System.out.println("����̹��ε�����");
		}catch(ClassNotFoundException ex){
			System.out.println("����̹��ε�����:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			stmt=con.createStatement();//Statement ����
			disp();
			//System.out.println("DB���Ἲ��");
		}catch(SQLException ex){
			System.out.println("DB�������:"+ex);
		}//catch end
	}//cons end
	
	//��������
	int row=-1;
	String value="";
	//inner class :table���� ���콺 Ŭ���Ҷ�
	class MyMouse extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			row=table.getSelectedRow();//�༱��
			value=(String)model.getValueAt(row,1);//id�����
			System.out.println("value:"+value);//id�����
		}//mousePressed() end
	}//inner class end
	//�޼���
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==buExit){
			try{
				if(stmt !=null){stmt.close();}
				if(pstnt !=null){pstnt.close();}
				if(con !=null){con.close();}
			}catch(Exception ex){}
			System.exit(0);//���α׷� ����
		}//if
		
		if(e.getSource()==buList){
			disp();//�޼��� ȣ��
		}//if end------------
		
		
		//--------------------------enter �Ѿ��
		if(e.getSource()==tfName){
			tfId.requestFocus();
		}
		if(e.getSource()==tfId){
			tfEmail.requestFocus();
		}
		if(e.getSource()==tfEmail){
			tfTitle.requestFocus();
		}
		if(e.getSource()==tfTitle){
			taContent.requestFocus();
		}
		
		if(e.getSource()==buInsert){
			String name=tfName.getText().trim();
			String id=tfId.getText().trim();
			String email=tfEmail.getText().trim();
			String title=tfTitle.getText().trim();
			String content=taContent.getText().trim();

			if(name.equals("") || name.length()<0){
				JOptionPane.showMessageDialog(null, "�̸��� �Է��Ͻÿ�");
				tfName.requestFocus();
				return;
			}//if end

			if(id.equals("") || id.length()<0){
				JOptionPane.showMessageDialog(null, "id�� �Է��Ͻÿ�");
				tfId.requestFocus();
				return;
			}//if end

			if(email.equals("") || email.length()<0){
				JOptionPane.showMessageDialog(null, "email�� �Է��Ͻÿ�");
				tfEmail.requestFocus();
				return;
			}//if end

			if(title.equals("") || title.length()<0){
				JOptionPane.showMessageDialog(null, "title�� �Է��Ͻÿ�");
				tfTitle.requestFocus();
				return;
			}//if end

			if(content.equals("") || content.length()<0){
				JOptionPane.showMessageDialog(null, "content�� �Է��Ͻÿ�");
				taContent.requestFocus();
				return;
			}//if end


			//insert
			try{
				//String sql="insert into guest values('"+name+"')"
				String sql="insert into guest values(?,?,?,?,?)";

				pstnt=con.prepareStatement(sql);//prepareStatement����
				//?�� ä���
				pstnt.setString(1, name);
				pstnt.setString(2, id);
				pstnt.setString(3, email);
				pstnt.setString(4, title);
				pstnt.setString(5, content);

				pstnt.executeUpdate();
				disp();

				tfName.setText("");
				tfId.setText("");
				tfEmail.setText("");
				tfTitle.setText("");
				taContent.setText("");

				tfName.requestFocus();

				row=-1;//////**************
				value="";////////*************

				pstnt.close();

			}catch(Exception ex2){
				System.out.println("insert �� ���ܹ߻�:"+ex2);
			}//catch end
		}//if end----------
		
		//�ۼ��� ȭ������ ���������
		if(e.getSource()==buUpdate){
			if(row<0){
				JOptionPane.showMessageDialog(null,"������ �����͸� �Է��Ͻÿ�");
				return;
			}//if
			
			String name=(String)model.getValueAt(row, 0);//�̸�
			String id=(String)model.getValueAt(row, 1);//id
			String email=(String)model.getValueAt(row, 2);//email
			String title=(String)model.getValueAt(row, 3);//title
			String content=(String)model.getValueAt(row, 4);//content
			
			//����â�� ���
			updateTest.tfName.setText(name);
			updateTest.tfId.setText(id);
			updateTest.tfEmail.setText(email);
			updateTest.tfTitle.setText(title);
			updateTest.taContent.setText(content);
			
			updateTest.setVisible(true);//*********************
			row=-1;//*********
			value="";
			
		}//if--------
		
		//DB ������ ����
		if(e.getSource()==updateTest.buUpdate){
			String imname=updateTest.tfName.getText().trim();
			String imid=updateTest.tfId.getText().trim();
			String imemail=updateTest.tfEmail.getText().trim();
			String imTitle=updateTest.tfTitle.getText().trim();
			String imContent=updateTest.taContent.getText().trim();
			
			try{
				String sql="update guest set name=?,email=?,title=?,content=? where id=?";

				pstnt=con.prepareStatement(sql);//�������μ����� �ִ´�
				//?��ä���
				pstnt.setString(1, imname);
				pstnt.setString(2, imemail);
				pstnt.setString(3, imTitle);
				pstnt.setString(4, imContent);
				pstnt.setString(5, imid);//*************************************
				
				
				pstnt.executeUpdate();//��������
				disp();//�޼���ȣ��
				row=-1;//�ʱ�ȭ
				value="";//�ʱ�ȭ
				
				updateTest.setVisible(false);//updateâ�� �Ⱥ��̰�
			}catch(Exception ex5){
				System.out.println("������ ������ �� ���ܹ߻�:"+ex5);
			}//catch end
			
		}//if------------------------------------------
		
		//�����ͻ���
		if(e.getSource()==buDelete){
			if(row<0){
				JOptionPane.showMessageDialog(null,"������ ���� �����Ͻÿ�");
				return;
			}//if
			
			try{
				int anser=JOptionPane.showConfirmDialog(null,
						"������ �����Ͻðڽ��ϱ�?","����",JOptionPane.YES_NO_OPTION);
				//           message         â����   ��ư
				switch(anser){
				case JOptionPane.YES_OPTION:
					if(value!=null||!value.equals("")||value.length()>0){
						pstnt=con.prepareStatement("delete from guest where id=?");
						//?��ä���
						pstnt.setString(1, value);
						pstnt.executeUpdate();//��������
						
						disp();
						
						row=-1;//�ʱ�ȭ
						value="";//�ʱ�ȭ
						
						break;//*************
					}//if
					
				case JOptionPane.NO_OPTION:
					break;
				}//switch end
				
			}catch(Exception ex6){
				System.out.println("������ ���� �ϴ� �� ���ܹ߻�");
			}//catch
		}
		
	}//actionPerformed() end
	
	//��������� �޼���:db���� �о�� ������ ���������
	public void disp(){
		model.setRowCount(0);//table���� �����
		
		try{
			rs=stmt.executeQuery("select * from guest");
			
			while(rs.next()){
				String name=rs.getString("name");
				String id=rs.getString("id");
				String email=rs.getString("email");
				String title=rs.getString("title");
				String content=rs.getString("content");
				
				String temp[]={name,id,email,title,content};
				model.addRow(temp);//���߰�
			}//while end
			rs.close();
					
		}catch(Exception ex1){
			System.out.println("disp()����");
		}
	}//disp() end
	//main
	public static void main(String args[]){
		new GuestBook();
	}//main end
}//class end
