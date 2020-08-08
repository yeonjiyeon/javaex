package ch17_util;
//Autoboxing: 기본 자료형이 heap영역으로 저장될 때 
//Unboxing: heap영역자료가 stack에 저장 
public class Test04_auto_unboxing {
	public static void main(String args[]){
		int a=10;
		Integer A=a;//Autoboxing
		System.out.println("a:"+a);
		System.out.println("A:"+A);
		
		System.out.println(a+a);
		System.out.println(A+A);
		System.out.println(A+a);
		
		Double D=new Double(33.3);
		double d=D;//Unboxing
		System.out.println(D);
		System.out.println(d);
		System.out.println(D+d);
		
	}//main end
}//class end
