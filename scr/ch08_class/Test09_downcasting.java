package ch08_class;

class Super2{
	//사용자정의 메서드
	public void disp(){
		System.out.println("Super2.disp() called");
	}//disp() end
}//class end
//-----------------------------------------------------------
//파생클래스
class Sub2 extends Super2{
	//오버라이딩:상속받은 메서드 내용 재정의
	public void disp(){
		System.out.println("Sub2.dis() called");
	}
	//사용자 정의 메서드
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
	  ((Sub2)s).aa(); //downcasting ((형변환))원래 타입으로 캐스팅후 호출해주어야함
	  
	  
  }//main end
}//class end
