package ch15_IO;
import java.io.*;
//System.in�� InputStream�� ��ü�̱⶧���� 
//InputStreamReader ������ �μ��� ���޵ȴ�  ��:InputStreamReader(InputStream is)
//�׷����� InputStreamReader ��ü�� BufferStreamReader �������μ��� ���޵ȴ�
//�̷� ����� ���ļ� Ű����κ��� ���� �Է¹޴´�
public class Test05_readconsole {
	public static void main(String args[]) throws Exception{
		//InputStreamReader isr=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(isr);
		
		//��ø���
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String strKor,strEng;
		int kor,eng,tot;
		
		System.out.print("���������� �Է��Ͻÿ�>>>");
		strKor=br.readLine();
		
		System.out.print("���������� �Է��Ͻÿ�>>>");
		strEng=br.readLine();
		
		kor=Integer.parseInt(strKor);//���ڿ��� ������ ��ȯ
		eng=Integer.parseInt(strEng);
		
		tot=kor+eng;
		System.out.println("tot:"+tot);
		br.close();
				
	}//main end
}//class end
