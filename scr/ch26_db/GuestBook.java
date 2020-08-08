package ch26_db;
import java.awt.*;//Layout
import java.awt.event.*;

import javax.swing.*;//JFrame 등등
import javax.swing.table.*;//DefaultTableModel

import java.sql.*;//DriverManager,Connection,Statement,PreparedStatement,ResultSet
public class GuestBook extends JFrame implements ActionListener{
	//전역변수=필드=속성=property
	JLabel laJemok;//제목
	JLabel laName,laId,laEmail,laTitle,laContent;
	JTextField tfName,tfId,tfEmail,tfTitle;
	JTextArea taContent;
	
	JButton buInsert,buUpdate,buDelete,buList,buExit;
	
	Object data[][]=new Object[0][5];
	Object cols[]={"이름","ID","Email","Title","글내용"};
	DefaultTableModel model=new DefaultTableModel(data,cols);
	JTable table=new JTable(model);
	JScrollPane scrollpane=new JScrollPane(table);//스크롤바 사용하려고
	
	String DRIVER="com.mysql.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3306/mydb"; //db가 있는 url
	String USER="root";
	String PWD="12345";
	
	Connection con=null;
	Statement stmt=null;
	PreparedStatement pstnt=null;
	ResultSet rs=null;
	
	UpdateTest updateTest=null;//*********
	//int i;
	//int j=10;
	
	//생성자
	public GuestBook(){
		getContentPane().setBackground(new Color(204,153,153));
		
		updateTest=new UpdateTest();//*******
		
		laJemok =new JLabel("GuestBook");
		laJemok.setFont(new Font("Dialog",Font.BOLD,25));
		//laJemok.setBackground(Color.yellow);
		laJemok.setForeground(Color.white);
		
		laName=new JLabel("이름",JLabel.RIGHT);
		laName.setForeground(Color.white);
		
		laId=new JLabel("ID",JLabel.RIGHT);
		laId.setForeground(Color.white);
		
		laEmail=new JLabel("Email",JLabel.RIGHT);
		laEmail.setForeground(Color.white);
		
		laTitle=new JLabel("Title",JLabel.RIGHT);
		laTitle.setForeground(Color.white);
		
		laContent=new JLabel("글내용",JLabel.RIGHT);
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
		
		//프로그래머가 배치작업을 하려면 아래와 같이 null로 layout을 설정한다
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
		
		
		//이벤트 등록
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
		
		
		//table 마우스 이벤트 등록
		table.addMouseListener(new MyMouse());
		
		setBounds(200,200,600,600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 종료
		
		//드라이버 로딩
		try{
			Class.forName(DRIVER);
			//System.out.println("드라이버로딩성공");
		}catch(ClassNotFoundException ex){
			System.out.println("드라이버로딩실패:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			stmt=con.createStatement();//Statement 생성
			disp();
			//System.out.println("DB연결성공");
		}catch(SQLException ex){
			System.out.println("DB연결실패:"+ex);
		}//catch end
	}//cons end
	
	//전역변수
	int row=-1;
	String value="";
	//inner class :table에서 마우스 클릭할때
	class MyMouse extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			row=table.getSelectedRow();//행선택
			value=(String)model.getValueAt(row,1);//id값얻기
			System.out.println("value:"+value);//id값얻기
		}//mousePressed() end
	}//inner class end
	//메서드
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==buExit){
			try{
				if(stmt !=null){stmt.close();}
				if(pstnt !=null){pstnt.close();}
				if(con !=null){con.close();}
			}catch(Exception ex){}
			System.exit(0);//프로그램 종료
		}//if
		
		if(e.getSource()==buList){
			disp();//메서드 호출
		}//if end------------
		
		
		//--------------------------enter 넘어가기
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
				JOptionPane.showMessageDialog(null, "이름을 입력하시오");
				tfName.requestFocus();
				return;
			}//if end

			if(id.equals("") || id.length()<0){
				JOptionPane.showMessageDialog(null, "id을 입력하시오");
				tfId.requestFocus();
				return;
			}//if end

			if(email.equals("") || email.length()<0){
				JOptionPane.showMessageDialog(null, "email을 입력하시오");
				tfEmail.requestFocus();
				return;
			}//if end

			if(title.equals("") || title.length()<0){
				JOptionPane.showMessageDialog(null, "title을 입력하시오");
				tfTitle.requestFocus();
				return;
			}//if end

			if(content.equals("") || content.length()<0){
				JOptionPane.showMessageDialog(null, "content을 입력하시오");
				taContent.requestFocus();
				return;
			}//if end


			//insert
			try{
				//String sql="insert into guest values('"+name+"')"
				String sql="insert into guest values(?,?,?,?,?)";

				pstnt=con.prepareStatement(sql);//prepareStatement생성
				//?값 채운다
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
				System.out.println("insert 중 예외발생:"+ex2);
			}//catch end
		}//if end----------
		
		//글수정 화면으로 데이터출력
		if(e.getSource()==buUpdate){
			if(row<0){
				JOptionPane.showMessageDialog(null,"수정할 데이터를 입력하시오");
				return;
			}//if
			
			String name=(String)model.getValueAt(row, 0);//이름
			String id=(String)model.getValueAt(row, 1);//id
			String email=(String)model.getValueAt(row, 2);//email
			String title=(String)model.getValueAt(row, 3);//title
			String content=(String)model.getValueAt(row, 4);//content
			
			//수정창에 출력
			updateTest.tfName.setText(name);
			updateTest.tfId.setText(id);
			updateTest.tfEmail.setText(email);
			updateTest.tfTitle.setText(title);
			updateTest.taContent.setText(content);
			
			updateTest.setVisible(true);//*********************
			row=-1;//*********
			value="";
			
		}//if--------
		
		//DB 데이터 수정
		if(e.getSource()==updateTest.buUpdate){
			String imname=updateTest.tfName.getText().trim();
			String imid=updateTest.tfId.getText().trim();
			String imemail=updateTest.tfEmail.getText().trim();
			String imTitle=updateTest.tfTitle.getText().trim();
			String imContent=updateTest.taContent.getText().trim();
			
			try{
				String sql="update guest set name=?,email=?,title=?,content=? where id=?";

				pstnt=con.prepareStatement(sql);//생성시인수값을 넣는다
				//?값채우기
				pstnt.setString(1, imname);
				pstnt.setString(2, imemail);
				pstnt.setString(3, imTitle);
				pstnt.setString(4, imContent);
				pstnt.setString(5, imid);//*************************************
				
				
				pstnt.executeUpdate();//쿼리수행
				disp();//메서드호출
				row=-1;//초기화
				value="";//초기화
				
				updateTest.setVisible(false);//update창을 안보이게
			}catch(Exception ex5){
				System.out.println("데이터 수정할 때 예외발생:"+ex5);
			}//catch end
			
		}//if------------------------------------------
		
		//데이터삭제
		if(e.getSource()==buDelete){
			if(row<0){
				JOptionPane.showMessageDialog(null,"삭제할 행을 선택하시오");
				return;
			}//if
			
			try{
				int anser=JOptionPane.showConfirmDialog(null,
						"정말로 삭제하시겠습니까?","삭제",JOptionPane.YES_NO_OPTION);
				//           message         창제목   버튼
				switch(anser){
				case JOptionPane.YES_OPTION:
					if(value!=null||!value.equals("")||value.length()>0){
						pstnt=con.prepareStatement("delete from guest where id=?");
						//?값채우기
						pstnt.setString(1, value);
						pstnt.executeUpdate();//쿼리수행
						
						disp();
						
						row=-1;//초기화
						value="";//초기화
						
						break;//*************
					}//if
					
				case JOptionPane.NO_OPTION:
					break;
				}//switch end
				
			}catch(Exception ex6){
				System.out.println("데이터 삭제 하던 중 예외발생");
			}//catch
		}
		
	}//actionPerformed() end
	
	//사용자정의 메서드:db에서 읽어온 가져온 데이터출력
	public void disp(){
		model.setRowCount(0);//table내용 지우기
		
		try{
			rs=stmt.executeQuery("select * from guest");
			
			while(rs.next()){
				String name=rs.getString("name");
				String id=rs.getString("id");
				String email=rs.getString("email");
				String title=rs.getString("title");
				String content=rs.getString("content");
				
				String temp[]={name,id,email,title,content};
				model.addRow(temp);//행추가
			}//while end
			rs.close();
					
		}catch(Exception ex1){
			System.out.println("disp()예외");
		}
	}//disp() end
	//main
	public static void main(String args[]){
		new GuestBook();
	}//main end
}//class end
