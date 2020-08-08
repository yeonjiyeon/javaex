package ch03_oper;

public class Test05 {
	public static void main(String args[]){
		
		int a=5; 
		int b= ++a + ++a;
		System.out.println("b:"+b);

		a=5;   
		int c= ++a + a++;
		System.out.println("c:"+c); //변수는 소문자사용 
		System.out.println("a:"+a);
		
		a=5;
		System.out.println(++a);
	}//main end
		
		
}//class end
