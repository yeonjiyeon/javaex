package ch06_oop;
//�޽��� ����
//���ϰ� �����ֱ�
public class Test04_method {
	public char aa(){
		System.out.println("char aa() called....");
		return'A';
	}//aa() end
	
	public String ss(){
		System.out.println("String ss() called...^^");
		return"ȫ���";
	}//ss() end
	
	//JVM�� ���ؼ� main()�� ��ó�� ȣ��Ǿ�����.
  public static void main(String args[]){
	  //��ü �����ϰ� ��ü, �޼���() 
	  Test04_method test=new Test04_method();//��ü ����
	  char a=test.aa();
	  String name=test.ss();
	  
	  
	  System.out.println("a:"+a);
	  System.out.println("name:"+name);
	  
  }//main end
}//class end
