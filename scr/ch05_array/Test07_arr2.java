package ch05_array;

public class Test07_arr2 {
  public static void main(String args[]){
	  int a[][]={
			  {10,20},
			  {30,40,50}
			  };
	  
	  System.out.println("�హ��:"+a.length);
	  System.out.println("�� ���� a[0].length:"+a[0].length);
	  System.out.println("�� ���� a[1].length:"+a[1].length);
	  
	  //data���
	  for(int i=0;i<a.length;i++){//row
		  for(int j=0;j<a[i].length;j++){//column
			  System.out.print(a[i][j]+" ");
			 
		  }//inner for
		  System.out.println();
	  }//out for
  }//main end
}//class end
