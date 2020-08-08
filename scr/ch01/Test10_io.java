package ch01;

import java.util.Scanner;
//java1.5부터 들어있는 기능
public class Test10_io {//io:입출력
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);//객체생성
		
		System.out.print("정수입력>>");
		int a=sc.nextInt();//정수를 입력받는다
		System.out.printf("a:%d",a);
		//실행
		System.out.println();//line skip
		
		System.out.print("실수 입력>>>");
		double d=sc.nextDouble();//실수형 입력받기
		System.out.printf("d:%f",d);
		//실행
		System.out.println();//line skip
		
		System.out.print("이름을 입력>>>");
		String name=sc.next();
		System.out.printf("name:%s",name);
		
	}//main end
}//class end
//향상된 입,출력 기능
//향상된 입력기능: java.util.Scanner
//향상된 출력기능: System.out.printf("%d %f %s \n",12,66.7,"kim");