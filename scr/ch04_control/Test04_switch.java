package ch04_control;

public class Test04_switch {
	public static void main(String args[]){
		//������ �Է��Ͽ� �������ϱ�
		//90~100 A
		//80~89  B
		//70~79  C
		//60~69  D
		//0~59   F
		
		int score=88;
		char grade=' ';//����
		
		switch(score/10){
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
			default://0~59
				grade='F';
		}//switch end 
		
		System.out.println("����:"+score+"\n"+"����:"+grade);
	}//main end

}//class end


/*
score/10

100/10=10
99/9 =9
90/9 =9

89/9 =8
80/9 =8

79/7 =7
70/7 =7
*/
