package ch14_exception;
import java.io.*;

//CompileException 예외
public class Test03_exception {
	public static void main(String args[]){
		try{
			Runtime r=Runtime.getRuntime();//실행 파일 정보를 얻어서 ,생성을 하지않고 get을 통해 들어가면 추상클래스
			//r.exec("c:\\Windows\\notepad.exe");//실행 파일실행
			//r.exec("c:\\Windows\\System32\\calc.exe");
			//r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.exe");
			r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe https:\\www.naver.com");
		}catch(Exception ex){
			System.out.println("예외:"+ex);
		}finally{
			System.out.println("예외발생과 상관없이 실행 된다");
		}//finally end
	}//main end
}//class end
