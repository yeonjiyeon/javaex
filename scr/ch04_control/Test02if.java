package ch04_control;

public class Test02if {
	public static void main(String args[]){
		
		//int score=-88;
		int score=99;
		//90~ 100  A����
		//80~ 89   B����
		//70~79    C����
		//60~69    D����
		//0~59     F����
		char grade=' ';//�ʱ�ȭ
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
			System.out.println("������ 0~100������ �Է��ؾ� �մϴ�");
		}else{
			System.out.println("����:"+score+"\t"+"����:"+grade);
		}
	}//main end

}//class end
