package ch05_array;
import java.util.*;

public class Test11_lotto {
  public static void main(String args[]){
	  int lotto[]=new int[6];
	  
	  for(int i=0; i<6; i++){
		 lotto[i]=(int)(Math.random()*(45)+1);
		 
		 for(int j=0; j<i; j++){
			 if(lotto[i]==lotto[j]){
				 i--;
				 break;//안쪽 탈출
			 }//if
		 }//inner for		 
	  }//out for
	  //출력
	  for(int i=0;i<6;i++){
		  System.out.print(lotto[i]+" ");
	  }//for
	  System.out.println();
	  System.out.println(Long.MAX_VALUE);
	  System.out.println(Float.MAX_VALUE);
	  System.out.println(Double.MAX_VALUE);
  }//main end
}//class end
