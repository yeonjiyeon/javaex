package ch16_util;
import java.util.*;
public class Test03_Calender {
	public static void main(String args[]){
		//Calendar.getInstance()�� ����ð��� ���� Calendar��ü�� ��ȯ  
		Calendar cal=Calendar.getInstance();//get->�߻�Ŭ����
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;//0 1 2 3 4 5 6 7 8 9 10 11
		                                    //1 2 3 4 5 6 7 8 9 10 11 12
		int date=cal.get(Calendar.DATE);
		
		int h=cal.get(Calendar.HOUR);
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+date+"��"+h+"��"+m+"��"+s+"��");
		System.out.println(year+"-"+month+"-"+date+" "+h+":"+m+":"+s);
		System.out.println(year+"/"+month+"/"+date+" "+h+":"+m+":"+s);
	}//main end
}//class end
