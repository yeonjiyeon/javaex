package ch15_IO;
import java.io.*;
//����Ʈ��Ʈ������
public class Test10_buff_byteR {
	public static void main(String args[]){
		BufferedInputStream bis=null;
		try{
			bis=new BufferedInputStream(new FileInputStream("a4.txt"));
			
			int a;
			while((a=bis.read()) != -1 ){//���ϳ��� �ƴѵ��� �ݺ�����
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
