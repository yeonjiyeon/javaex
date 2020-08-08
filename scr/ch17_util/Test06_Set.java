package ch17_util;
import java.util.*;
public class Test06_Set {
	public static void main(String args[]){
		Set<String> set=new HashSet<String>();//객체 생성
		
		set.add("인사과");
		set.add("인사과");
		set.add("충무과");
		set.add("회계");
		set.add("전산원");
		
		System.out.println("size 요소갯수:"+set.size());
		
		for(String str:set){
			System.out.println(str); //순서없이 처리 중복제거
		}//for end
		System.out.println();
		//-------------------------------
		//iterator: 모든 컬랙션에서 사용할 수 있다
		//-------------------------------------
		Iterator iter=set.iterator();
		while(iter.hasNext()){//자료가 있는 동안 반복실행
			System.out.println(iter.next());
		}//while end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end
	
}//class end
