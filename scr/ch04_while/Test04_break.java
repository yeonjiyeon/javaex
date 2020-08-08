package ch04_while;
//break문: 반복문 블럭을 탈출
public class Test04_break {
	public static void main(String args[]){
		//for
		for(int a=1; a<=10000; a++){
			System.out.println(a+"월요일");
			if(a==10) break;
		}//for
		System.out.println();
		
		//while
		int a=1; 
		while(a<=10000){
			System.out.println(a+"하이~");
			if(a==10) break;//while 블럭탈출
			a++;
		}//while end
		
		
		
		
	}//main end

}//class end
