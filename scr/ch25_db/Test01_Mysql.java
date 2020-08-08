//JDBC �������̽��� java���� �����Ѵ� (java.sql.*)
import java.sql.*;
//DriverManager,Connection,Statement,PreparedStatement,ResultSet
public class Test01_Mysql {
	public static void main(String args[]){
		String DRIVER="com.mysql.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/mydb";//DB�� �ִ� url
		String USER="root";
		String PWD="12345";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName(DRIVER);//����̹� �ε�
			//System.out.println("����̹� �ε� ����");
		}catch(ClassNotFoundException ex){
			System.out.println("����̹� �ε� ����:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//db����
			//System.out.println("DB���� ����");
			stmt=con.createStatement();//Statement ����
			
			//2.insert
			//String sql="insert into test01 values('������','pp123','pp@daum.net','MySQL�����ϱ�','���ü����� java DB����')";
			//stmt.executeUpdate(sql);
			
			//3. update ������=>������2
			//String sql="update test01 set name='������2' where name='������'";
			//stmt.executeUpdate(sql);
			
			//4.delete ������2����
			//String sql="delete from test01 where name='������2'";
			//stmt.executeUpdate(sql);
			
			//1. ����Ʈ----------------------------------------
			//select
			rs=stmt.executeQuery("select*from test01");
			while(rs.next()){
				//String name=rs.getString("name");
				String name=rs.getString(1);
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				String title=rs.getString("title");
				String content=rs.getString("content");
				
				//���
				System.out.printf("%-10s %-10s %-17s %-17s %-100s\n", 
						name,pwd,email,title,content);
			}//while end
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(SQLException ex){
			System.out.println("DB���� ����:"+ex);
		}//catch end
		
		
	}//main end
}//class end
