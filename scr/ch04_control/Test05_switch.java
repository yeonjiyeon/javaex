package ch04_control;

public class Test05_switch {
	public static void main(String args[]){
		//달(월)입력하여 그 말달의 날짜수 출력하기
		int month=2;
		int days=0;
		
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
	}//main end

}//class end
