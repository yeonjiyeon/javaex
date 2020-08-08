import java.sql.*;
public class Test01_oracle {
	public static void main(String args[]){
		//����
		String DRIVER="oracle.jdbc.driver.OracleDriver";
		String URL="jdbc:oracle:thin:@localhost:1521:xe";
		String USER="j77";
		String PWD="j77";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName(DRIVER);//����̹��ε�
			//System.out.println("����̺�ε�����");
		}catch(ClassNotFoundException ex){
			System.out.println("����̺�ε�����:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			//System.out.println("DB���Ἲ��");
			stmt=con.createStatement();//statement����
			//2.insert
			String sql="insert into test01 values('�ȹ̼�','an123','an@nate.com','�̼��� ��','�������̿���')";
			//stmt.executeUpdate(sql);
			
			//3.update �̼��� ->�̰���
			sql="update test01 set name='�̰���' where name='�̼���'";
			//stmt.executeUpdate(sql);
			
			//4. delete �̰��� �����ϱ�
			sql="delete from test01 where name='�̰���'";
			stmt.executeUpdate(sql);
			//1.����Ʈ, select
			rs=stmt.executeQuery("select *from test01");
			
			while(rs.next()){//�ڷᰡ �����ϴ� ���� �ݺ�����
				String name=rs.getString("name");
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				String title=rs.getString("title");
				String content=rs.getString("content");
				
				System.out.println(name+"--"+pwd+"--"+email+"--"+title+"--"+content);
			}//while end
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException ex){
			System.out.println("DB�������:"+ex);
		}//catch end
		
		
	}//main end
}//class end
