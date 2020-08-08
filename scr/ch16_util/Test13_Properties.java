package ch16_util;
import java.util.*;
import java.io.*;

//db.properties

public class Test13_Properties {
	//변수
	
	//생성자
	public Test13_Properties(){
		Properties pro=new Properties();//객체생성
		try{
			pro.load(new FileInputStream("c:\\_aa\\db.properties"));
		}catch(Exception e){
			System.out.println("예외:"+e);
		}//catch end
		String driver=pro.getProperty("driver");
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String pwd=pro.getProperty("pwd");
		
		//DB연결 작업하고, 다른데서 사용
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);
	}//cons end
	//메서드
	
	//main
	public static void main(String args[]){
		new Test13_Properties();
	}
}//class end
