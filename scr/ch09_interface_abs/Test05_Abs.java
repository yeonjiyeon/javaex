package ch09_interface_abs;
//�߻� Ŭ����
abstract class AA5{
	abstract public void aa();//�߻�޼���
	public void bb(){
		System.out.println("AA5.bb() called...");
	}
}//abstract class end

class BB5 extends AA5{
	public void aa(){
		System.out.println("BB5.aa() �������̵�");
	}
}//class end

class CC5 extends AA5{
	public void aa(){
		System.out.println("cc5.aa() �������̵�");
	}
}//class end


public class Test05_Abs {
  public static void main(String args[]){
	  //AA5 a=new AA5();//error �߻�޼��� ȣ��x
	  AA5 a=new BB5();
	  a.aa();
	  a.bb();
	  
	  a=new CC5();
	  a.aa();
	  a.bb();
  }//main end
}//class end
