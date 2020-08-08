package ch04_for;

public class Test01 {
	public static void main(String args[]){
		//금요일을 10번 출력하기
		for(int i=1; i<=10; i++){
			System.out.println(i+", 금요일");
		}//for end
		
		//1~10까지 출력 1 2 3 4 5 6 8 9 10
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
		}//for end
		System.out.println();//line skip
		
		// A B C....Z출력하기
		for(int i=65; i<=90; i++){
			System.out.print((char)i);
		}//for end
		
		System.out.println();//line skip
		
		// A B C....Z출력하기
		for(char ch='A'; ch<='Z'; ch++){
			System.out.print(ch);
		}//for end
		
		System.out.println();//line skip
		
		//10~1출력
		for(int i=10; i>=1; i--){
			System.out.print(i+" ");
		}//for end
	}//main end

}//class end
