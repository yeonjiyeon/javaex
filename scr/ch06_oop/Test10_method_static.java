package ch06_oop;
//static�޼���� static����� �����޼��常 ��밡���ϴ� 
//static�޼���� ��ü���� ���� ȣ�Ⱑ���ϴ�
//��:Ŭ�����̸�.�޼���()
//��:Math.ceil(3.2);
//��:Math.PI �ʵ� ���

public class Test10_method_static {
	String name="ȫ�浿";
	static String irum="�ڹ���";
	
	//�޼���
	public void aa(){
		System.out.println("aa() method");
	}//aa() end 
	//static�޼���
	public static void bb(){
		System.out.println("bb() method");
	}//bb() end
  public static void main(String args[]){
	  //System.out.println("name:"+name);//static�� ��츸 ȣ�Ⱑ��,��ü�����ؾ� ��밡��
	  System.out.println("irum:"+irum);
	  //Test010_method_static.aa(); //static�޼���� static����� �����޼��常 ��밡���ϴ�
	  Test10_method_static.bb();
  }//main end
}//class end
