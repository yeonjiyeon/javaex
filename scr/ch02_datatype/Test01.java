package ch02_datatype;

public class Test01 {
  public static void main(String args[]){
	  //자료형,변수
	  byte a1=127;
	  //byte a1=1000; //error
	  short a2=32767;
	  char a3='A';
	  int a4=2147483647;//디폴트
	  long a5=1000;
	  
	  float a6=12.5f;//정밀도가 낮다
	  double a7=12.5;//정밀도가 높다
	  
	  boolean a8=true;
	  String name="박문수";
	  
	  System.out.println("a1:"+a1);
	  System.out.println("a2:"+a2);
	  System.out.println("a3:"+a3);
	  System.out.println("a4:"+a4);
	  System.out.println("a5:"+a5);
	  System.out.println("a6:"+a6);
	  System.out.println("a7:"+a7);
	  System.out.println("name"+name);
	  
  }//main end
  
}//class end
