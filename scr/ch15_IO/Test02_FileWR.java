package ch15_IO;
import java.io.*;
//���ڿ���Ʈ�� ����
public class Test02_FileWR {
	public static void main(String args[]){
		FileReader fr=null;
		
		try{
			fr=new FileReader("a1.txt");
			int a;
			
			while((a=fr.read()) != -1){//-1�� �ƴϸ� �̰��� ���ϳ��� �ƴ� ���� �ݺ�ó���Ͻÿ�
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
