package ch16_util;
import java.util.*;

//calendar
public class Test05_Calendar {
	public static void main(String args[]){
		Calendar cal=Calendar.getInstance();
		
		System.out.println("오늘은 이번주의 "+cal.get(Calendar.DAY_OF_WEEK)+"날입니다");
		System.out.println("오늘은 올해의 "+cal.get(Calendar.DAY_OF_YEAR)+"날입니다");
		System.out.println("오늘은 올해의 "+cal.get(Calendar.WEEK_OF_YEAR)+ "주입니다");
		
		//윤년,평년
		GregorianCalendar gcal=new GregorianCalendar(); //객체생성
		if(gcal.isLeapYear(Calendar.YEAR)){//윤년
			System.out.println(gcal.get(Calendar.YEAR)+"윤년입니다");
		}else{//평년
			System.out.println(gcal.get(Calendar.YEAR)+"평년입니다");
		}//if
		
		//1988년은 윤년인지 평년인지 구해보시오
		
		if(gcal.isLeapYear(1988)){//윤년
			System.out.println("1988은 윤년입니다");
		}else{//평년
			System.out.println("1988은 평년입니다");
		}//if
	}//main end
}//class end
