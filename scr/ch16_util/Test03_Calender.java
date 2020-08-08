package ch16_util;
import java.util.*;
public class Test03_Calender {
	public static void main(String args[]){
		//Calendar.getInstance()는 현재시간을 갖는 Calendar객체를 반환  
		Calendar cal=Calendar.getInstance();//get->추상클래스
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;//0 1 2 3 4 5 6 7 8 9 10 11
		                                    //1 2 3 4 5 6 7 8 9 10 11 12
		int date=cal.get(Calendar.DATE);
		
		int h=cal.get(Calendar.HOUR);
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);
		
		System.out.println(year+"년"+month+"월"+date+"일"+h+"시"+m+"분"+s+"초");
		System.out.println(year+"-"+month+"-"+date+" "+h+":"+m+":"+s);
		System.out.println(year+"/"+month+"/"+date+" "+h+":"+m+":"+s);
	}//main end
}//class end
