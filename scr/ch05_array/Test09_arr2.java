package ch05_array;

public class Test09_arr2 {
  public static void main(String args[]){
	  
	  int a[][]={
			  {70,80,90},
			  {80,90,100},
			  {88,99,77}
	  };
	  
	  String name[]={"�����","������","�ڰǿ�"};
	  int sum=0;//���� ���ϴ� ����
	  
	  for(int i=0;i<a.length;i++){//row
		  System.out.print(name[i]+" ");
		  
		  for(int j=0;j<a[i].length;j++){
			  sum+=a[i][j];
			  System.out.print(a[i][j]+" ");
		  }//inner for
		  
		  System.out.println(" "+sum+" avg:"+(sum)/3.);
		  sum=0;//�� Ŭ����
	  }//out for
  }//main end
}//class end
