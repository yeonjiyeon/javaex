package ch14_exception;

public class Test04_exception {
	public static void main(String args[]){
		try{
			//Class.forName("con.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException ex){
			System.out.println("����̺�ε� ����:"+ex);
		}
	}//main end
}//class end
