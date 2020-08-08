package ch15_IO;
import java.io.*;

public class Test08_byteR {
	public static void main(String args[]){
		FileInputStream fis=null;
		try{
			fis=new FileInputStream("a3.txt");
			
			int a;
			while((a=fis.read()) != -1 ){//파일 끝이 아닌동안 반복처리 
				System.out.print(a+" ");
			}
		}catch(IOException ie){
			System.out.println(ie);
		}finally{
			try{
				fis.close();
			}catch(IOException i2){}
		}//finally end
	}//main end
}//class end
