//JDBC 인터페이스는 java에서 제공한다 (java.sql.*)
import java.sql.*;
//DriverManager,Connection,Statement,PreparedStatement,ResultSet
public class Test01_Mysql {
	public static void main(String args[]){
		String DRIVER="com.mysql.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/mydb";//DB가 있는 url
		String USER="root";
		String PWD="12345";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try{
			Class.forName(DRIVER);//드라이버 로딩
			//System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException ex){
			System.out.println("드라이버 로딩 실패:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);//db연결
			//System.out.println("DB연결 성공");
			stmt=con.createStatement();//Statement 생성
			
			//2.insert
			//String sql="insert into test01 values('박종일','pp123','pp@daum.net','MySQL공부하기','오늘수업은 java DB연결')";
			//stmt.executeUpdate(sql);
			
			//3. update 박종일=>박종일2
			//String sql="update test01 set name='박종일2' where name='박종일'";
			//stmt.executeUpdate(sql);
			
			//4.delete 박종일2삭제
			//String sql="delete from test01 where name='박종일2'";
			//stmt.executeUpdate(sql);
			
			//1. 리스트----------------------------------------
			//select
			rs=stmt.executeQuery("select*from test01");
			while(rs.next()){
				//String name=rs.getString("name");
				String name=rs.getString(1);
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				String title=rs.getString("title");
				String content=rs.getString("content");
				
				//출력
				System.out.printf("%-10s %-10s %-17s %-17s %-100s\n", 
						name,pwd,email,title,content);
			}//while end
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(SQLException ex){
			System.out.println("DB연결 실패:"+ex);
		}//catch end
		
		
	}//main end
}//class end
