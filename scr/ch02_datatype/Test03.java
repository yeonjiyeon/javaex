package ch02_datatype;

public class Test03 {
	public static void main(String args[]){
		
		//1.�ڵ� ����ȯ
		  int a1='A';
		  System.out.println();
		  double d=123; //123�� d������ �Ҵ�Ǹ鼭 �ڵ����� ����ȯ�� �ȴ�. 
		 // int a=12.5; //����  
		  System.out.println(10+12.5); //�����Ҷ��� �ڷ����� ū������ ��ȯ�ȴ�.
		  System.out.println("d:"+d);
		  
		 /* 
		  ���� ����ȯ=ĳ����(casting)
          :�ڷ��� ��������� ��ȯ�ϴ� �� 
          */
		  
		  int a=(int)12.5; 
		  char ch=(char)65;
		  char ch2=(char)65.7; 
		 
		  System.out.println("a"+a);
		  System.out.println("ch:"+ch);
		  System.out.println("ch2:"+ch2);

		  
	}//main end

}//class end
