package ch17_util;
//Autoboxing: �⺻ �ڷ����� heap�������� ����� �� 
//Unboxing: heap�����ڷᰡ stack�� ���� 
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
