package ch14_exception;
import java.io.*;

//CompileException ����
public class Test03_exception {
	public static void main(String args[]){
		try{
			Runtime r=Runtime.getRuntime();//���� ���� ������ �� ,������ �����ʰ� get�� ���� ���� �߻�Ŭ����
			//r.exec("c:\\Windows\\notepad.exe");//���� ���Ͻ���
			//r.exec("c:\\Windows\\System32\\calc.exe");
			//r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.exe");
			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https:\\www.naver.com");
		}catch(Exception ex){
			System.out.println("����:"+ex);
		}finally{
			System.out.println("���ܹ߻��� ������� ���� �ȴ�");
		}//finally end
	}//main end
}//class end
