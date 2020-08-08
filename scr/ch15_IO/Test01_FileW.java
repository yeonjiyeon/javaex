package ch15_IO;
import java.io.*;
//문자 스트링 예제
public class Test01_FileW {
	public static void main(String args[]){
		FileWriter fw=null;//클래스변수(객체,메모리에 올라오면 인스턴스), 모든 클래스는 null로 초기화한다
		try{
			fw=new FileWriter("a1.txt");
			for(int i=1;i<=3;i++){
				fw.write("줄번호:"+i+'\n');
			}//for end
			
		}catch(IOException ie){
			System.out.println("예외:"+ie);
		}finally{
			try{
				fw.close();
			}catch(IOException ie2){}
		}//finally end
	}//main end
}//class end
