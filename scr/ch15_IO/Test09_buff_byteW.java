package ch15_IO;
//바이트스트림 예제
import java.io.*;
public class Test09_buff_byteW {
	public static void main(String args[]){
		BufferedOutputStream bos=null;
		try{
			
			bos=new BufferedOutputStream(new FileOutputStream("a4.txt"));
			
			for(int i=1;i<=10;i++){
				bos.write(i);
			}//for end
			
		}catch(IOException ie){
			System.out.println(ie);
		}finally{
			try{
				bos.close();
			}catch(IOException ie2){}
		}//finally end
		
	}//main end
}//class end
