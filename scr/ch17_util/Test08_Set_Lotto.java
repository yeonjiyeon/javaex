package ch17_util;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;



public class Test08_Set_Lotto {
	public static void main(String args[]){
		Set<String> set=new HashSet<String>();//,객체생성
		Random r=new Random();
		while(set.size()<6){
			//int a=(int)(Math.random()*45+1);
			int a=r.nextInt(44)+1;
			String str=""+a;//정수를 문자열로 변환
			set.add(str);
		}//while end
		//단축 for 출력
		for(String s:set){
			System.out.print(s+" ");
		}//for end
		
	}//main end
}//class end
