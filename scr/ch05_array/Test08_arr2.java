package ch05_array;

public class Test08_arr2 {
  public static void main(String args[]){
	  double ki[][]={
			  {177.7, 167.7},
			  {201.0, 160.3}	  
	  };
	  //2중으로 for문을 출력해보시오. 
	  for(int i=0; i<ki.length;i++){//row
		  for(int j=0;j<ki[i].length;j++){//column
			  System.out.print(ki[i][j]+"\t");
		  }//inner for
		  System.out.println();//line skip
	  }//out for
		  
  }//main end
}//class end
