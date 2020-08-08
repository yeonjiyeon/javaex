package ch15_IO;
import java.io.*;
//System.in은 InputStream의 객체이기때문에 
//InputStreamReader 생성자 인수로 전달된다  예:InputStreamReader(InputStream is)
//그런다음 InputStreamReader 객체가 BufferStreamReader 생성자인수로 전달된다
//이런 방법을 거쳐서 키보드로부터 값을 입력받는다
public class Test05_readconsole {
	public static void main(String args[]) throws Exception{
		//InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(isr);
		
		//중첩사용
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String strKor,strEng;
		int kor,eng,tot;
		
		System.out.print("국어점수를 입력하시오>>>");
		strKor=br.readLine();
		
		System.out.print("영어점수를 입력하시오>>>");
		strEng=br.readLine();
		
		kor=Integer.parseInt(strKor);//문자열을 정수로 반환
		eng=Integer.parseInt(strEng);
		
		tot=kor+eng;
		System.out.println("tot:"+tot);
		br.close();
				
	}//main end
}//class end
