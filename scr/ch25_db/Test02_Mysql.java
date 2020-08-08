import java.sql.*;
public class Test02_Mysql {
	public static void main(String args[]){
		//���� 
		String DRIVER="com.mysql.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/mydb";
		String USER="root";
		String PWD="12345";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName(DRIVER);
			//System.out.println("����̺꿬�Ἲ��");
		}catch(ClassNotFoundException ex){
			System.out.println("����̺꿬�����:"+ex);
		}//catch
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			//System.out.println("DB���� ����");
			stmt=con.createStatement();
			
			//String sql="insert into test02 values('IU',162,43,28,'��')";
			//stmt.executeUpdate(sql);
			
			String sql="update test02 set age=49 where name='�豸��'";
			stmt.executeUpdate(sql);
			
			//sql="delete from test02 where name='IU'";
			//stmt.executeUpdate(sql);
			
			rs=stmt.executeQuery("select *from test02");
			while(rs.next()){
				String name=rs.getString("name");
				double height=rs.getDouble("height");
				double weight=rs.getDouble("weight");
				int age=rs.getInt("age");
				String sex=rs.getString("sex");
				System.out.printf("%-10s %7.2f  %6.2f  %5d  %-6s\n",
						name,height,weight,age,sex);
			}//while
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException ex){
			System.out.println("DB���� ����:"+ex);
		}//catch end
		
	}//main end
}//class end
