package ch15_IO;
import java.io.*;
//문자열스트림 예제
public class Test02_FileWR {
	public static void main(String args[]){
		FileReader fr=null;
		
		try{
			fr=new FileReader("a1.txt");
			int a;
			
			while((a=fr.read()) != -1){//-1이 아니면 이것은 파일끝이 아닌 동안 반복처리하시오
				System.out.print((char)a);
			}//while
		}catch(IOException ie){
			System.out.println(ie);
		}finally{
			try{
				fr.close();
			}catch(IOException ie2){}
		}//finally end
	}//main end
}//class end
