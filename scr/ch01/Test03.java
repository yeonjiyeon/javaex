
package ch01;
//"Test03.java"����
class Demo{
 public void prn(){
  System.out.println("Demo class �Դϴ�");
 }

}//-------------------------------------------

//��Ŭ����
public class Test03{
 public static void main(String args[]){
   System.out.println("Test03 �� Ŭ���� �̴�");
  
   Demo d1=new Demo();//��ü����
   d1.prn();
 
 }//main

}//-----------------------------------------------

//C:\java_work\01_ javatest>javac Test03.java 
//C:\java_work\01_ javatest>java Test03
//Ŭ���������� public ����x main�� ��//