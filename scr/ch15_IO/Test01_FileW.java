package ch15_IO;
import java.io.*;
//���� ��Ʈ�� ����
public class Test01_FileW {
	public static void main(String args[]){
		FileWriter fw=null;//Ŭ��������(��ü,�޸𸮿� �ö���� �ν��Ͻ�), ��� Ŭ������ null�� �ʱ�ȭ�Ѵ�
		try{
			fw=new FileWriter("a1.txt");
			for(int i=1;i<=3;i++){
				fw.write("�ٹ�ȣ:"+i+'\n');
			}//for end
			
		}catch(IOException ie){
			System.out.println("����:"+ie);
		}finally{
			try{
				fw.close();
			}catch(IOException ie2){}
		}//finally end
	}//main end
}//class end
