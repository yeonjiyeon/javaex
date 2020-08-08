package ch16_util;
//Object
import static java.lang.System.out;

class Test{
	
}

public class Test14_Object {
	public static void main(String args[]){
		Test A=new Test();
		Test B=new Test();
		Test C=new Test();
		
		out.println("A 클래스이름:"+A.getClass());
		out.println("A 해쉬코드:"+A.hashCode());
		out.println("A 객체문자열:"+A.toString());
		out.println();
		out.println("B 클래스이름:"+B.getClass());
		out.println("B 해쉬코드:"+B.hashCode());
		out.println("B 객체문자열:"+B.toString());
		out.println();
		out.println("c 클래스이름:"+C.getClass());
		out.println("c 해쉬코드:"+C.hashCode());
		out.println("c 객체문자열:"+C.toString());
		out.println();
		Test14_Object ob=new Test14_Object();
		out.println("ob 클래스이름:"+ob.getClass());
		out.println("ob 해쉬코드:"+ob.hashCode());
		out.println("ob 객체문자열:"+ob.toString());
	}//main end
}//class end
