package ch03_oper;

public class Test10 {
	public static void main(String args[]){
		//조건 연산자, 3항 연산자
		int a=(7>5)?7:5;//true면 7, false면 5
		int b=(7<5)?7:5;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println((10<5)?10:5);
		//cast연산자(강제행변환)
		int a1=(int)33.7;
		char ch=(char)66.7;
		char ch2=(char)67;
		
		System.out.println("a1:"+a1);
		System.out.println("ch:"+ch);
		System.out.println("ch2:"+ch2);
	}

}//class end
