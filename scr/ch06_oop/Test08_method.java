package ch06_oop;
//전역변수는 메서드 밖에서 선언하는 것
//전역변수는 자동으로 초기화가 된다

//지역변수는 메서드 안에서 선언한 것을 말한다 
//지역변수는 자동으로 초기화안된다

//배열은 지역일지라도 자동으로 초기화된다. 
public class Test08_method {
  String name;//전역변수
  int age;
  double ki;
  //값을 전역변수에 설정하는 메서드 
  public void setData(String name,int age, double ki){
	 this.name=name;//this.전역변수=매개변수  =>다른 메소드에서도 활용할 수 있게 하기위해 전역변수에 값을 넣어놓는다         this:이 클래스의 자기자신 
	 this.age=age;
	 this.ki=ki;
  }//setData() end
  
  //메서드, 출력하기 위해 
  public void disp(){
	  System.out.println("이름:"+name);
	  System.out.println("나이:"+age);
	  System.out.println("키:"+ki);
  }//disp() end
  
  public static void main(String args[]){
	  Test08_method t=new Test08_method();//객체 생성
	  t.setData("홍길동", 27, 177.7);
	  t.disp();
	  //
	  System.out.println();
	  t.setData("손흥민", 28, 184.7);
	  t.disp();
	  
  }//main end
}//class end
