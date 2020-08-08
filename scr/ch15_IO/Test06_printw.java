package ch15_IO;
import java.io.*;
//PrintWriter(OutputStream os) 생성자
//PrintWriter(OutputStream os, boolean flushOnNewLine) 생성자
//boolean flushOnNewLine은 줄바꿈(true/false)
//PrintWriter(Writer w) 생성자
//PrintWriter(Writer w,boolean flushOnNewLine) 생성자

//java의 PrintWriter 객체는 Object를 비롯한 모든 형식에 대해서 print(),println()메서드를 지원한다
public class Test06_printw {
	public static void main(String args[]){
		
		PrintWriter pp=new PrintWriter(System.out);
		
		pp.println(100);
		pp.println('A');
		pp.println(12.5f);
		pp.println(22.55d);
		pp.println(true);
		pp.println("홍길동");
		pp.println(new java.util.Date());//객체
		
		pp.close();
		
	}//main end
}//class end
