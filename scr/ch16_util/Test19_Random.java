package ch16_util;
import java.util.*;
//Random,Math.random()
public class Test19_Random {
	public static void main(String args[]){
		//Math.random()
		for(int i=1;i<=10;i++){
			System.out.println(Math.random());//0.0<x<1.0
		}//for end
		
		Random r=new Random();//��ü����
		int a1=r.nextInt();//������ ����
		int a2=r.nextInt(10);//0~10����
		int a3=r.nextInt(100);//0~100����
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		
		float f=r.nextFloat();//0.0~1.0������ ���� �߻�
		double d=r.nextDouble();//0.0~1.0������ ���� �߻�
		boolean b=r.nextBoolean();//true,false
		System.out.println("f:"+f);
		System.out.println("d:"+d);
		System.out.println("b:"+b);
	}//main end
}//class end
