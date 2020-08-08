package ch15_IO;
import java.io.*;
//문자스트림 예제
public class Test04_buffR {
	public static void main(String args[])throws IOException{
		//FileReader fr=new FileReader("a2.txt");
		//BufferedReader br=new BufferedReader(fr);
		
		//중첩사용
		BufferedReader br=new BufferedReader(new FileReader("a2.txt"));
		
		//파일로부터 각 줄을 읽어서 화면에 출력
		String str;
		
		while((str=br.readLine()) != null){//null이 아닌동안( 파일 끝이 아닌동안) 반복수행
			System.out.println(str);
		} //while end
		br.close();
	}//main end
}//class end
