package ch17_util;
import java.util.*;
public class Test05_io {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);//객체생성
		System.out.print("정수 입력 하시오>>>");
		int a=sc.nextInt();
		System.out.printf("%d\n",a);
		//-----------------------------------------
		System.out.print("실수를 입려하시오");
		double d=sc.nextDouble();
		System.out.printf("%f\n", d);
		//-----------------------------------------
		System.out.print("이름을 입려하시오");
		String name=sc.next();
		System.out.printf("%s\n", name);
	}//main end
}//class end 
