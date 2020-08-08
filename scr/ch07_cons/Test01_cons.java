package ch07_cons;

public class Test01_cons {
	public Test01_cons(){//인수가 없는 것을 디폴트생성자라고 한다.
		System.out.println("인자없는 생성자 입니다.");
	}//cons1
		
	
 public static void main(String args[]){
	 new Test01_cons();//객체 생성시 생성자는 자동 호출된다
  }//main end
 
 
}//class end
