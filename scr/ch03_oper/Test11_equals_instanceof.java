package ch03_oper;

public class Test11_equals_instanceof {
	public static void main(String args[]){
		/*
		 ==������: �⺻ ���������� ������ �����(��ҹ��� ����)
equls()�޼���: ���ڿ��� ���� �� ���
equalsIgnoreCase():���ڿ��� ��ҹ��ڱ��оʰ� ���Ѵ�. 
YES, Yes, yes

     */
		String str="hello";
		System.out.println(str.equals("hello"));//t
		System.out.println(str.equals("Hello"));
		System.out.println(str.equalsIgnoreCase("Hello"));
		
		/*instatnceof : ��ü��(��: ��ü instanceof Ŭ����)
              ������ ��ü, �������� Ŭ������ ����Ѵ�. 
              ���� ��ü������ ������ Ŭ������ ������Ʈ(�ν��Ͻ�)�ΰ� */
		
		Object ob=new Object();
		String str1=new String("kim");
		System.out.println(str1 instanceof String);//true
		System.out.println(str1 instanceof Object);//true
		System.out.println(ob instanceof String);//false
	}

}//class end
