
package ch01;
//"Test03.java"저장
class Demo{
 public void prn(){
  System.out.println("Demo class 입니다");
 }

}//-------------------------------------------

//주클래스
public class Test03{
 public static void main(String args[]){
   System.out.println("Test03 주 클래스 이다");
  
   Demo d1=new Demo();//객체생성
   d1.prn();
 
 }//main

}//-----------------------------------------------

//C:\java_work\01_ javatest>javac Test03.java 
//C:\java_work\01_ javatest>java Test03
//클래스에서는 public 띄어쓰기x main이 들어감//