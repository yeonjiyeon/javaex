package ch06_oop;
//메스드 연습
//리턴값 돌려주기
public class Test04_method {
	public char aa(){
		System.out.println("char aa() called....");
		return'A';
	}//aa() end
	
	public String ss(){
		System.out.println("String ss() called...^^");
		return"홍길등";
	}//ss() end
	
	//JVM에 의해서 main()가 맨처음 호출되어진다.
  public static void main(String args[]){
	  //객체 생성하고 객체, 메서드() 
	  Test04_method test=new Test04_method();//객체 생성
	  char a=test.aa();
	  String name=test.ss();
	  
	  
	  System.out.println("a:"+a);
	  System.out.println("name:"+name);
	  
  }//main end
}//class end
