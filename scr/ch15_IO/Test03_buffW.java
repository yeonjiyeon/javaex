package ch15_IO;
import java.io.*;
public class Test03_buffW {
	public static void main(String args[]) throws Exception{
		//FileWriter fw=new FileWriter("a2.txt");
		//BufferedWriter br=new BufferedWriter(fw);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("a2.txt"));
		
		//a2.txt���Ͽ� ���ڿ����� 
		for(int i=1;i<=5;i++){
			bw.write("�ٹ�ȣ:"+i+'\n');
		}//for end
		
		bw.close();
		
		
	}//main end
}//class end
