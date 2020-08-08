package ch04_control;
import java.util.*;

public class Test06_switch {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("달을 입력하세요>>>");

		int month=sc.nextInt();//int 형 입력
		int days=0;

		if(month>=1 && month<=12){
			switch(month){
			case 1: case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 2:
				days=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
			}//switch end

			System.out.println(month+"월은(달)"+days+"까지 있는 달입니다");
		}else{
			System.out.println("입력오류.....1~12까지만 입력하시오");
		}//if end
	}//main end

}//class end
