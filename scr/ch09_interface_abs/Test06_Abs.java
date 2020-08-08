package ch09_interface_abs;
//추상클래스는 내용있는 메서드와 추상메서드가 혼합된 경우이다 

abstract class Abs{
	String name;//전역 변수
	//생성자
	public Abs(String name){
		this.name=name;
	}
	//일반메서드
	public void kk(){
		System.out.println("추상클래스안에 있는 일반 메서드");
	}
	
	//추상메서드
	abstract void disp();
	
}//abstract class end

public class Test06_Abs extends Abs {
	
	//생성자
	public Test06_Abs(String name){
		super(name);//상위 클래스생성자 호출
		
	}
	
	//오버라이딩
	public void disp(){
		System.out.println("추상메서드 오버라이딩");
		System.out.println("name:"+name);
	}
  public static void main(String args[]){
	  Abs abs=new Test06_Abs("아이유");
	  
	  abs.kk();
	  abs.disp();
  }//main end
}//class end
