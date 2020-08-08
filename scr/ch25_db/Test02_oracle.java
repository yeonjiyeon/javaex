import java.sql.*;
public class Test02_oracle {
	public static void main(String args[]){
		//변수
		String DRIVER="oracle.jdbc.driver.OracleDriver";
		String URL="jdbc:oracle:thin:@localhost:1521:xe";
		String USER="j77";
		String PWD="j77";
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		try{
			Class.forName(DRIVER);
			//System.out.println("드라이버 로딩 성공");
		}catch(ClassNotFoundException ex){
			System.out.println("드라이버 로딩 실패:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			//System.out.println("DB연결 성공");
			stmt=con.createStatement();
			
			String sql="insert into test02 values('펭수',210,100,10,'x')";
			//stmt.executeUpdate(sql);
			
			sql="update test02 set weight=98 where name='펭수'";
			//stmt.executeUpdate(sql);
			sql="delete from test02 where name='펭수'";
			stmt.executeUpdate(sql);
			
			rs=stmt.executeQuery("select *from test02");
			while(rs.next()){
				String name=rs.getString("name"); 
				double height=rs.getDouble("height");
				double weight=rs.getDouble("weight");
				int age=rs.getInt("age");
				String sex=rs.getString("sex");
				
				System.out.printf("%-10s %7.2f  %6.2f  %5d  %-6s\n",
						name,height,weight,age,sex);
			}//while end
			//rs.close();
			//stmt.close();
			//con.close();
		}catch(SQLException ex){
			//System.out.println("DB연결 실패:"+ex);
			System.out.println("DBSQL예외:"+ex);
		}//catch end
		finally{
			try{
				if(rs!=null){rs.close();}
				if(stmt!=null){stmt.close();}
				if(con!=null){con.close();}
			}catch(Exception ex){}
		}
	}//main end
}//class end
