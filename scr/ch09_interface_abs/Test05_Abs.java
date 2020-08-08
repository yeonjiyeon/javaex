package ch09_interface_abs;
//추상 클래스
abstract class AA5{
	abstract public void aa();//추상메서드
	public void bb(){
		System.out.println("AA5.bb() called...");
	}
}//abstract class end

class BB5 extends AA5{
	public void aa(){
		System.out.println("BB5.aa() 오버라이딩");
	}
}//class end

class CC5 extends AA5{
	public void aa(){
		System.out.println("cc5.aa() 오버라이딩");
	}
}//class end


public class Test05_Abs {
  public static void main(String args[]){
	  //AA5 a=new AA5();//error 추상메서드 호출x
	  AA5 a=new BB5();
	  a.aa();
	  a.bb();
	  
	  a=new CC5();
	  a.aa();
	  a.bb();
  }//main end
}//class end
