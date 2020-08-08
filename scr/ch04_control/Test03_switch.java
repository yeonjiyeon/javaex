package ch04_control;

public class Test03_switch {
	public static void main(String args[]){
		int su=88;
		
		//어떤 수가 짝수인지 홀수인 판정하시오. 
		switch(su%2){
		case 0:
			System.out.println(su+"은 짝수");
			break;
		case 1: 
			System.out.println(su+"은 홀수");
		}//switch end
	}//main end

}//class end
