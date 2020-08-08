package ch06_oop;
//static메서드는 static선언된 변수메서드만 사용가능하다 
//static메서드는 객체생성 말고도 호출가능하다
//예:클래스이름.메서드()
//예:Math.ceil(3.2);
//예:Math.PI 필드 사용

public class Test10_method_static {
	String name="홍길동";
	static String irum="박문수";
	
	//메서드
	public void aa(){
		System.out.println("aa() method");
	}//aa() end 
	//static메서드
	public static void bb(){
		System.out.println("bb() method");
	}//bb() end
  public static void main(String args[]){
	  //System.out.println("name:"+name);//static인 경우만 호출가능,객체생성해야 사용가능
	  System.out.println("irum:"+irum);
	  //Test010_method_static.aa(); //static메서드는 static선언된 변수메서드만 사용가능하다
	  Test10_method_static.bb();
  }//main end
}//class end
