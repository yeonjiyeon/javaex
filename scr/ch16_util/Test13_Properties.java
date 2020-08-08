package ch16_util;
import java.util.*;
import java.io.*;

//db.properties

public class Test13_Properties {
	//����
	
	//������
	public Test13_Properties(){
		Properties pro=new Properties();//��ü����
		try{
			pro.load(new FileInputStream("c:\\_aa\\db.properties"));
		}catch(Exception e){
			System.out.println("����:"+e);
		}//catch end
		String driver=pro.getProperty("driver");
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String pwd=pro.getProperty("pwd");
		
		//DB���� �۾��ϰ�, �ٸ����� ���
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);
	}//cons end
	//�޼���
	
	//main
	public static void main(String args[]){
		new Test13_Properties();
	}
}//class end
