package ch06_oop;
//�迭�� �Ű������� ���
public class Test07_method_arr {
	
  public void disp(int b[]){
	  for(int i=0;i<b.length;i++){
		  System.out.print(b[i]+" ");
	  }//for end
  }//disp() end
	//main()�޼���� JMV�� ���ؼ� ȣ���� �Ǿ����� 
	public static void main(String args[]){
		int a[]={10,20,30,40,50};
		Test07_method_arr t=new Test07_method_arr();//��ü����
		t.disp(a);

	
	}//main end
}//class end
