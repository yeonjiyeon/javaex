package ch09_interface_abs;

interface AA2{
	int MAX=100;//변수를 상수화 한다, static final이다
	void aa();//접근제한자 생략해도 public
}//interface end

public class Test02_interface implements AA2{
	public void aa(){
		System.out.println("aa() called....");
	}//aa() end
  public static void main(String args[]){
	  AA2 a=new Test02_interface();//객체 생성
	  a.aa();
	  
	  System.out.println("MAX:"+MAX);
	  //MAX=1000;에러 
	  
	  final double PI=3.14159;
	  System.out.println("PI:"+PI);
	  //PI=3.14//error
	  
  }//main end
}//class end
