package ch17_util;
import java.util.*;
public class Test05_io {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);//��ü����
		System.out.print("���� �Է� �Ͻÿ�>>>");
		int a=sc.nextInt();
		System.out.printf("%d\n",a);
		//-----------------------------------------
		System.out.print("�Ǽ��� �Է��Ͻÿ�");
		double d=sc.nextDouble();
		System.out.printf("%f\n", d);
		//-----------------------------------------
		System.out.print("�̸��� �Է��Ͻÿ�");
		String name=sc.next();
		System.out.printf("%s\n", name);
	}//main end
}//class end 
