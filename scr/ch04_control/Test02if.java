package ch04_control;

public class Test02if {
	public static void main(String args[]){
		
		//int score=-88;
		int score=99;
		//90~ 100  A학점
		//80~ 89   B학점
		//70~79    C학점
		//60~69    D학점
		//0~59     F학점
		char grade=' ';//초기화
		if(score>=90 && score<=100){
			grade='A';
		}else if(score>=80 && score<90){
			grade='B';
		}else if(score>70 && score<80){
			grade='C';
		}else if(score>=60 && score<70){
			grade='D';
		}else if(score>=0 && score<60){
			grade='F';
		}else {
			grade='X';
		}
		//
		if(grade=='X'){
			System.out.println("점수는 0~100까지만 입력해야 합니다");
		}else{
			System.out.println("점수:"+score+"\t"+"학점:"+grade);
		}
	}//main end

}//class end
