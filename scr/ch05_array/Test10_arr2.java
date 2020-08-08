package ch05_array;
//a b c
//d e f
//
//g h i
//j k l
public class Test10_arr2 {
  public static void main(String args[]){
	  char ch[][][]={
			  {{'a','b','c'},{'d','e','f'}},
			  {{'g','h','i'},{'j','k','l'}}
	  };
	  
	  for(int i=0;i<2;i++){//면
		  for(int j=0;j<2;j++){//행
			  for(int k=0;k<3;k++){//열
				  System.out.print(ch[i][j][k]+" ");
			  }//for3
			  System.out.println();//행구분 줄바꿈
		  }//for2
		  System.out.println();//면구분 줄바꿈
	  }//for1
  }//main end
}//class end
