package ch07_cons;
//super: 상위 클래스 객체
//super():상위 클래스 생성자 호출
//슈퍼클래스
class ConSuper{
	String title;//전역변수,필드
	int num;
	
	//디폴트 생성자
	public ConSuper(){}
	
	//인자있는 생성자
	public ConSuper(String title,int num){
		this.title=title;//매개변수값을 전역변수에 할당
		this.num=num;
	}
		
	//사용자정의 메서드:임의로 만든 메서드
	public void disp(){
		System.out.println(title+" "+num);
	}
	}//super class end

//파생클래스=하위 클래스
class ConSub extends ConSuper{
	//생성자
	public ConSub(){
		super("abc",123);//상위 클래스 생성자호출  display는 위에서 상속받는다
	}
}//sub class end

public class Test07_super {
  public static void main(String args[]){
	  //파생클래스 사용
	  ConSub sub=new ConSub();//객체 생성
	  sub.disp();
	  
	  //클래스 사용
	  ConSuper ss=new ConSuper("AAA",1000);
	  ss.disp();
  }//main end
}//class end
