package ch16_util;
import java.util.*;

//calendar
public class Test05_Calendar {
	public static void main(String args[]){
		Calendar cal=Calendar.getInstance();
		
		System.out.println("������ �̹����� "+cal.get(Calendar.DAY_OF_WEEK)+"���Դϴ�");
		System.out.println("������ ������ "+cal.get(Calendar.DAY_OF_YEAR)+"���Դϴ�");
		System.out.println("������ ������ "+cal.get(Calendar.WEEK_OF_YEAR)+ "���Դϴ�");
		
		//����,���
		GregorianCalendar gcal=new GregorianCalendar(); //��ü����
		if(gcal.isLeapYear(Calendar.YEAR)){//����
			System.out.println(gcal.get(Calendar.YEAR)+"�����Դϴ�");
		}else{//���
			System.out.println(gcal.get(Calendar.YEAR)+"����Դϴ�");
		}//if
		
		//1988���� �������� ������� ���غ��ÿ�
		
		if(gcal.isLeapYear(1988)){//����
			System.out.println("1988�� �����Դϴ�");
		}else{//���
			System.out.println("1988�� ����Դϴ�");
		}//if
	}//main end
}//class end
