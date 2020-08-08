package ch04_while;
//반복문: while
public class Test01_while {
	public static void main(String args[]){
		//--------------------------
		//good-Afternoon 5번 출력하시오
		//--------------------------
		
		int i=1;//초기치
		while(i<=5){
			System.out.println("good-Afternoon");
			i++;//증감치
		}//while end
		
		//--------------------------
		//1~10 출력하시오
		//--------------------------
		i=1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}//while end
		System.out.println();//줄바꿈

		//--------------------------
		//1~10까지 2의 배수를 출력하시오
		//if,while 사용
		//--------------------------
		i=1;
		while(i<=10){
			if(i%2==0){
				System.out.print(i+" ");//if문에서 한문장일 경우에는 {}중괄호 생략이 가능하지만 여러 문장일시 X
			}//if
			i++;//1씩증가
		}//while end
		System.out.println();//줄바꿈
		

		//--------------------------
		//1~50까지 7의 배수를 출력하시오
		//if,while 사용
		//--------------------------
		i=1;
		while(i<=50){
			if(i%7==0){
				System.out.print(i+" ");
			}//if
			i++;
		}//while end
		System.out.println();
		
	}//main end
}//class end
