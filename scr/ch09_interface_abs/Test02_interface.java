package ch09_interface_abs;

interface AA2{
	int MAX=100;//������ ���ȭ �Ѵ�, static final�̴�
	void aa();//���������� �����ص� public
}//interface end

public class Test02_interface implements AA2{
	public void aa(){
		System.out.println("aa() called....");
	}//aa() end
  public static void main(String args[]){
	  AA2 a=new Test02_interface();//��ü ����
	  a.aa();
	  
	  System.out.println("MAX:"+MAX);
	  //MAX=1000;���� 
	  
	  final double PI=3.14159;
	  System.out.println("PI:"+PI);
	  //PI=3.14//error
	  
  }//main end
}//class end
