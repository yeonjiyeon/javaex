package ch15_IO;
import java.io.*;
//���ڽ�Ʈ�� ����
public class Test04_buffR {
	public static void main(String args[])throws IOException{
		//FileReader fr=new FileReader("a2.txt");
		//BufferedReader br=new BufferedReader(fr);
		
		//��ø���
		BufferedReader br=new BufferedReader(new FileReader("a2.txt"));
		
		//���Ϸκ��� �� ���� �о ȭ�鿡 ���
		String str;
		
		while((str=br.readLine()) != null){//null�� �ƴѵ���( ���� ���� �ƴѵ���) �ݺ�����
			System.out.println(str);
		} //while end
		br.close();
	}//main end
}//class end
