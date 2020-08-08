package ch02_datatype;

public class Test03 {
	public static void main(String args[]){
		
		//1.자동 형변환
		  int a1='A';
		  System.out.println();
		  double d=123; //123이 d변수로 할당되면서 자동으로 형변환이 된다. 
		 // int a=12.5; //에러  
		  System.out.println(10+12.5); //연산할때는 자료형이 큰쪽으로 변환된다.
		  System.out.println("d:"+d);
		  
		 /* 
		  강제 형변환=캐스팅(casting)
          :자료형 명시적으로 변환하는 것 
          */
		  
		  int a=(int)12.5; 
		  char ch=(char)65;
		  char ch2=(char)65.7; 
		 
		  System.out.println("a"+a);
		  System.out.println("ch:"+ch);
		  System.out.println("ch2:"+ch2);

		  
	}//main end

}//class end
