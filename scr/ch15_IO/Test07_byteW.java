package ch15_IO;
import java.io.*;
//����Ʈ��Ʈ������: �޸������� ���� �������� �� �� ����
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
