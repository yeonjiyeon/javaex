package ch16_util;
import java.util.*;
//properties
public class Test12_Properties {
	public static void main(String args[]){
		Properties pro=new Properties();//��ü����
		pro.put("driver","com.mysql.jdbc.Driver"); //(����,��)
		pro.put("url","jdbc:mysql://localhost:3306/mydb");
		pro.put("user","root");
		pro.put("pwd","12345");
		
		//�Ӽ���������
		String driver=pro.getProperty("driver");
		String url=pro.getProperty("url");
		String user=pro.getProperty("user");
		String pwd=pro.getProperty("pwd");
		
		//���
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd+'\n');
		
	//-----------------------------------
		//Enumeration:�������� ó���ȴ�
		Enumeration en=pro.propertyNames();
		while(en.hasMoreElements()){//��Ұ� �ִ� �ݺ� ����
			String kk=(String)en.nextElement();//key
			String vv=pro.getProperty(kk);//key�� �ش��ϴ� value
			System.out.println(kk+":"+vv);
		}//while
		
		System.out.println();
		pro.list(System.out);
	}//main end
}//class end
