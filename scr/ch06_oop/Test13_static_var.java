package ch06_oop;
//static������ ��� ��ü�� �����Ѵ�
//static�޼���� this�� ������
//��? �ڱ��ڽ��� ��Ī�ϹǷ�

public class Test13_static_var{
	int a=10;//��������
	static int b=20;//��������
	public static void main(String args[]){
		int a=100;//������ ��ĥ�������� ��������=>���������� �켱������ ����Ѵ�
		System.out.println("a:"+a);//100
		//System.out.println("this.a:"+this.a);
		int b=900;
		System.out.println("b:"+b);
	}
}
