package ch08_class;

class Super2{
	//��������� �޼���
	public void disp(){
		System.out.println("Super2.disp() called");
	}//disp() end
}//class end
//-----------------------------------------------------------
//�Ļ�Ŭ����
class Sub2 extends Super2{
	//�������̵�:��ӹ��� �޼��� ���� ������
	public void disp(){
		System.out.println("Sub2.dis() called");
	}
	//����� ���� �޼���
	public void aa(){
		System.out.println("Sub2.aa() called");
	}
}//class end
public class Test09_downcasting {
  public static void main(String args[]){
	  Super2 s=new Super2();
	  s.disp();
	  //
	  s=new Sub2();
	  s.disp();
	  //
	  ((Sub2)s).aa(); //downcasting ((����ȯ))���� Ÿ������ ĳ������ ȣ�����־����
	  
	  
  }//main end
}//class end
