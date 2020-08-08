package ch03_oper;

public class Test09 {
	public static void main(String args[]){
		//boolean 연산자
		boolean b1=true;
		System.out.println("!b:"+!b1);
		System.out.println("!!b:"+!!b1);
		
		//대입 연산자
		int a=10; 
		int b=2;
		a+=b;
		System.out.println("a:"+a);//12
		a-=b;
		System.out.println("a:"+a);//a=12 10
		a*=b;
		System.out.println("a:"+a);//a=10  20
		a/=b; //a=20/2
		System.out.println("a:"+a);//a=20/10 10
		a%=b;
		System.out.println("a:"+a);//나머지10%2
	}//main end 

}//class end
