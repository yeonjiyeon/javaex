package ch06_oop;

public class Test02_method extends Object{//extends Object생략가능
  
	public void aa(){
		System.out.println("aa() method called...");
	}//aa end
	
	public void bb(){
		System.out.println("bb() method called...");
	}//bb end
	
	public static void main(String args[]){
		Test02_method t1=new Test02_method();//객체생성
		t1.aa();//aa() 메서드 호출
		t1.bb();//
	}//main end
}//class end
