package ch06_oop;
//배열을 매개변수로 사용
public class Test07_method_arr {
	
  public void disp(int b[]){
	  for(int i=0;i<b.length;i++){
		  System.out.print(b[i]+" ");
	  }//for end
  }//disp() end
	//main()메서드는 JMV에 의해서 호출이 되어진다 
	public static void main(String args[]){
		int a[]={10,20,30,40,50};
		Test07_method_arr t=new Test07_method_arr();//객체생성
		t.disp(a);

	
	}//main end
}//class end
