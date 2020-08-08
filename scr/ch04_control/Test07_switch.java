package ch04_control;
import java.util.*;
public class Test07_switch {
	public static void main(String args[]){
		//연도와 달을 입력하여, 그달의 날수 구하기 
		
		Scanner sc=new Scanner(System.in);//객체 생성
		System.out.print("년도입력>>>");
		int year=sc.nextInt();
		
		System.out.println("달을 입력>>>");
		int month=sc.nextInt();
		
		int days=0;//변수초기화
		
		switch(month){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 2:
			if((year%4==0) && (year%100!=0) || (year%400==0)){
				days=29;//윤년
			}else{
				days=28;;//평년
			}//else end
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		}//switch end
		System.out.println(year+"년"+month+"월은"+days+"일 까지 있습니다");
	}//main end

}//class end
