package ch08_class;
//클래스 상속

class GeneralSuper01{
	static int roomNO=100;//전역변수
}//class end




public class Test04_extends extends GeneralSuper01{
  public static void main(String args[]){
	  System.out.println(roomNO);
	  //만약 상속관계가 아나라면 
	  //roomNo는 어떻게 사용할까요?
	  
	  //객체생성
	  //객체.필드  예: Math.PI
	  //객체.메서드()
  }//main end
}//class end
