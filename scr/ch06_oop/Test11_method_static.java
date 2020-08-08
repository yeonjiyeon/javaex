package ch06_oop;
//static메서드는 static선언된 변수메서드만 사용가능하다 
//static메서드는 객체생성 말고도 호출가능하다
//예:클래스이름.메서드()
//예:Math.ceil(3.2);

//static 변수는 모든 객체가 공유한다 
//static 변수를 올바르게 사용한 예제 
public class Test11_method_static {
	String name;//전역변수
	int nai;
	static int sungin=18;
	
	//값을 설정하는 메서드 
	public void setData(String name,int nai){
		this.name=name;
		this.nai=nai;
	}//setData() end 
	
	//출력하는 메서드
	public void disp(){
		String in="";//지역변수
		if(nai<sungin){
			in="미성년자";
		}else{
			in="성인";
		}//else...
		System.out.println(name+"님의 나이는"+nai+"살이고"+in+"입니다");
	}//disp() end
  public static void main(String args[]){
	  Test11_method_static kim=new Test11_method_static();//객체 생성
	  Test11_method_static lee=new Test11_method_static();//객체 생성
	  Test11_method_static park=new Test11_method_static();//객체 생성
	  
	  kim.setData("김연아", 27);
	  kim.disp();
	  
	  lee.setData("이순신", 41);
	  lee.disp();
	  
	  park.setData("박건우", 3);
	  park.disp();
	  

	  /*
	   * kim.disp(); 
	     lee.disp();
	     park.disp(); -> 한번에 써도 상관없음
	  */
	     
  }//main end
}//class end
