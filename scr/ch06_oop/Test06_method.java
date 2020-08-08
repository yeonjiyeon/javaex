package ch06_oop;
//매개변수, 리턴값 연습
public class Test06_method {
	
  public int sum(int start, int end){
	  //start부터 end까지 합구하기
	  int s=0;//합을 누적할 변수
	  for(int i=start;i<=end;i++){//매개변수,인자값,인수값
		  s+=i;//s=s+i
	  }//for end
	  
	  return s;
  }//sum() end
	
	//main()메서드는 JVM에서 제일 먼저 호출한다
	public static void main(String args[]){
		Test06_method t=new Test06_method();//객체 생성
		int s1=t.sum(1, 10);
		System.out.println("s1:"+s1);
		
		int s2=t.sum(1, 100);
		System.out.println("s2:"+s2);
		//메서드 호출 10,20 값을 전달해서 return값을 출력하시오
		
		int s3=t.sum(10, 20);
		System.out.println("s3:"+s3);
	}//main end
}//class end
