package ch15_IO;
import java.io.*;
//바이트스트림예제: 메모장으로 무슨 내용인지 알 수 없다
public class Test07_byteW {
	public static void main(String args[]){
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("a3.txt");
			for(int i=1;i<=7;i++){
				fos.write(i);
			}//for end
			
		}catch(IOException ie){
			
		}finally{
			try{
				fos.close();
			}catch(IOException i2){}
		}//finally end
	}//main end 
}//class end
