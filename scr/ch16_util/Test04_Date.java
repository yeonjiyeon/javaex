package ch16_util;
import java.util.*;//Date
import java.text.*;//SimpleDateFormat:��¥����

public class Test04_Date {
	public static void main(String args[]){
		//Date date=new Date();
		java.util.Date date=new java.util.Date(); //��Ű���� ����ؼ� ��ü������ �� ����
		
		System.out.println(date);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd H:m:s EEEE");
		                                                             //����
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd H:m:s E");
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		
	}//main end
}//class end
