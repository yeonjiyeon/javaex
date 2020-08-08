package ch16_util;
import java.util.*;
//properties
public class Test12_Properties {
	public static void main(String args[]){
		Properties pro=new Properties();//객체생성
		pro.put("driver","com.mysql.jdbc.Driver"); //(변수,값)
		pro.put("url","jdbc:mysql://localhost:3306/mydb");
		pro.put("user","root");
		pro.put("pwd","12345");
		
		//속성가져오기
		String driver=pro.getProperty("driver");
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String pwd=pro.getProperty("pwd");
		
		//출력
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd+'\n');
		
	//-----------------------------------
		//Enumeration:순서없이 처리된다
		Enumeration en=pro.propertyNames();
		while(en.hasMoreElements()){//요소가 있는 반복 실행
			String kk=(String)en.nextElement();//key
			String vv=pro.getProperty(kk);//key에 해당하는 value
			System.out.println(kk+":"+vv);
		}//while
		
		System.out.println();
		pro.list(System.out);
	}//main end
}//class end
