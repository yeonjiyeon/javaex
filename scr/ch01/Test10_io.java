package ch01;

import java.util.Scanner;
//java1.5���� ����ִ� ���
public class Test10_io {//io:�����
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);//��ü����
		
		System.out.print("�����Է�>>");
		int a=sc.nextInt();//������ �Է¹޴´�
		System.out.printf("a:%d",a);
		//����
		System.out.println();//line skip
		
		System.out.print("�Ǽ� �Է�>>>");
		double d=sc.nextDouble();//�Ǽ��� �Է¹ޱ�
		System.out.printf("d:%f",d);
		//����
		System.out.println();//line skip
		
		System.out.print("�̸��� �Է�>>>");
		String name=sc.next();
		System.out.printf("name:%s",name);
		
	}//main end
}//class end
//���� ��,��� ���
//���� �Է±��: java.util.Scanner
//���� ��±��: System.out.printf("%d %f %s \n",12,66.7,"kim");