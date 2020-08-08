package ch16_util;
//StringBuffer는 String보다 처리 속도가 빠르다 
//StringBuffer는 동적문자열 처리에 사용 

//import java.util.*;
public class Test06_StringBuffer {
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer();// 객체생성
		
		sb.append("Hellow");
		sb.append("Good");
		
		System.out.println(sb.toString());
		
		//sb.reverse();//역순으로 출력
		//System.out.println(sb.toString());
		
		//sb.delete(0, 5); //HellowGood
		//                   012345678  end직전까지 출력
		//System.out.println(sb.toString());
		
		System.out.println("실제 데이터길이"+sb.length());//9
		System.out.println("버퍼크기"+sb.capacity());//16
		
		//---------------------------------------------------
		StringBuffer sb2=new StringBuffer("java");//객체 생성
		StringBuffer sb3=new StringBuffer(10);//
		StringBuffer sb4=new StringBuffer();//객체 생성
		StringBuffer sb5=new StringBuffer();//객체 생성
		
		sb5.append("aaaaabbbbbcccccdd");//17*2
		sb5.append("aaaaabbbbbcccccdd");
		System.out.println("버퍼크기"+sb2.capacity());//16+4
		System.out.println("버퍼크기"+sb3.capacity());//10
		System.out.println("버퍼크기"+sb4.capacity());//16
		System.out.println("버퍼크기"+sb5.capacity());//34
	}//main end
}//class end
