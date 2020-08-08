package ch15_IO;
import java.io.*;
//바이트스트림예제
public class Test10_buff_byteR {
	public static void main(String args[]){
		BufferedInputStream bis=null;
		try{
			bis=new BufferedInputStream(new FileInputStream("a4.txt"));
			
			int a;
			while((a=bis.read()) != -1 ){//파일끝이 아닌동안 반복수행
				System.out.print(a+" ");
			}//while end
			
		}catch(IOException ie){
			System.out.println(ie);
		}finally{
			try{
				bis.close();
			}catch(IOException ie2){}
		}//finally end
	}//main end
}//class end
