package ch05_array;
//난수=무작위수 발생시키는 Math.random()=>0.0~0.9999999999
//                  클래스.메서드() => 0.0<x<1.0
//주사위1~6발생한다
//int a=(int)(Math.random()*나올 수 있는 가지수+나올 수 있는 가장 작은 수 );
//int a=(int)(Math.random()*6+1)

//10~100사이의 난수를 구하기(가지수=큰수-작은수+1)
//                          100-10+1
//125~233 까지의 난수를 발생하시오
//int a=(int)(Math.random()*(233-125+1)+125);
import java.util.*;

public class Test11_arr2 {
  public static void main(String args[]){
	//주사위
	  for(int i=1;i<=10;i++){
		  int a=(int)(Math.random()*6+1);
		  System.out.print(a+" ");
	  }//for
	  System.out.println();//line skip
	  //------------------------------------------------------
	  for(int i=1;i<=10;i++){
		  int a=(int)(Math.random()*(100-10+1)+10);
		  System.out.print(a+" ");
	  }//for
	  System.out.println();
	  //----------------------------------------------------
	  for(int i=1;i<=10;i++){
		  int a=(int)(Math.random()*(233-125+1)+125);
		  System.out.print(a+" ");
	  }//for
	  System.out.println();
	  
	  
  }//main end
  
}//class end
