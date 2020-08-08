package ch06_oop;
//static 변수는 모든 객체가 공유한다
//static 변수를 잘못사용한 예
public class Test12_method_static {
	String pum;//품명
	  int su;//수량
	  static int don;//단가
	  
	  //값설정 메소드
	  public void setData(String p,int s,int d){
		  pum=p;
		  su=s;
		  don=d;
	  }//setData() end
	  
	  //출력하는 메서드
	  public void disp(){
		  System.out.println("품명:"+pum);
		  System.out.println("수량:"+su);
		  System.out.println("단가:"+don+'\n');
	  }//disp() end
	  
  public static void main(String args[]){
	  Test12_method_static apple=new Test12_method_static();//객체생성
	  Test12_method_static banana=new Test12_method_static();//객체생성
	  Test12_method_static orange=new Test12_method_static();//객체생성
	  apple.setData("사과",5,800);
	  banana.setData("바나나", 1, 3500);
	  orange.setData("오렌지", 1, 500);
	  apple.disp();
	  banana.disp();
	  orange.disp();
  }//main end 
}//class end
