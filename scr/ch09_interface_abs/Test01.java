package ch09_interface_abs;

interface AA{
	void aa();
	void bb();
}//interface end

class AAA implements AA{
	
	//오버라이딩
	public void aa(){
		System.out.println("aa() called...");
	}
	public void bb(){
		System.out.println("bb() called...");
	}	
		
}//class end
public class Test01 {
  public static void main(String args[]){
	  AA a=new AAA();
	  a.aa();
	  a.bb();
	  
	  
  }//main end
}//class end  
