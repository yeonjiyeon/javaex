package ch05_array;

public class Test06_arr {
  public static void main(String args[]){
	  //문자열을 각 문자 배열요소로 분해하기 
	  String str="Good-Afternoon-kil-dong";
	  //          012345678901234567890123
	  
	  System.out.println("글자수:"+str.length());
	  
	  char ch[]=new char[str.length()];//클래스는 갯수를 메소드로 사용해야 한다.
	  //str의 4인덱스부터 11인텍스직전까지데이터를 
	  //ch 배열에 1 index부터 복사하시오
	  ch[0]='A';
	  str.getChars(4, 11, ch, 1); 
	  //4부터 11직전까지 데이터를 ch배열 1번째부터 복사
	 
	  System.out.println(str);
	  
	  for(int i=0;i<ch.length;i++){
		  System.out.print(ch[i]);
	  }
	     }//main end
}//class end
