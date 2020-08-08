import java.sql.*;
public class Test01_oracle {
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
			Class.forName(DRIVER);//드라이버로딩
			//System.out.println("드라이브로딩성공");
		}catch(ClassNotFoundException ex){
			System.out.println("드라이브로딩실패:"+ex);
		}//catch end
		
		try{
			con=DriverManager.getConnection(URL,USER,PWD);
			//System.out.println("DB연결성공");
			stmt=con.createStatement();//statement생성
			//2.insert
			String sql="insert into test01 values('안미숙','an123','an@nate.com','미숙의 글','오랜만이에요')";
			//stmt.executeUpdate(sql);
			
			//3.update 이순신 ->이강인
			sql="update test01 set name='이강인' where name='이순신'";
			//stmt.executeUpdate(sql);
			
			//4. delete 이강인 삭제하기
			sql="delete from test01 where name='이강인'";
			stmt.executeUpdate(sql);
			//1.리스트, select
			rs=stmt.executeQuery("select *from test01");
			
			while(rs.next()){//자료가 존재하는 동안 반복수행
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
			System.out.println("DB연결실패:"+ex);
		}//catch end
		
		
	}//main end
}//class end
