package ch06_oop;
//static변수는 모든 객체가 공유한다
//static메서드는 this를 사용못함
//왜? 자기자신을 지칭하므로

public class Test13_static_var{
	int a=10;//전역변수
	static int b=20;//전역변수
	public static void main(String args[]){
		int a=100;//변수가 겹칠때에서는 지역변수=>지역변수를 우선적으로 사용한다
		System.out.println("a:"+a);//100
		//System.out.println("this.a:"+this.a);
		int b=900;
		System.out.println("b:"+b);
	}
}
