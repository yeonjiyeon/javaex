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
	  
	  for(int i=0;i<2;i++){//��
		  for(int j=0;j<2;j++){//��
			  for(int k=0;k<3;k++){//��
				  System.out.print(ch[i][j][k]+" ");
			  }//for3
			  System.out.println();//�౸�� �ٹٲ�
		  }//for2
		  System.out.println();//�鱸�� �ٹٲ�
	  }//for1
  }//main end
}//class end
