package ch17_util;
import java.util.*;
public class Test09_List {
	public static void main(String args[]){
		List<String> list=new ArrayList<String>();//객체 생성
		list.add("사과1");//index 0
		list.add("사과2");//index 1
		list.add("사과3");//index 2
		list.add("사과4");//index 3
		list.add("사과5");//index 4
		lstprint(list);//메서드 호출
		
		list.add(2,"키위");//index 2에 키위를 삽입
		lstprint(list);//메서드 호출 
		
		list.set(4,"포도");//index 4를 포도로 바꾼다
		lstprint(list);//메서드 호출
		
		list.remove(1);//index 1번째 요소제거 
		lstprint(list);//메서드 호출
		
		list.remove("키위");//키위 제거
		lstprint(list);//메서드 호출
		
		//포도 위치(index)값 얻기 
		int idx=list.indexOf("포도");
		System.out.println("포도위치:"+idx);
	}//main end
	
	//사용자 정의 메서드
	private static void lstprint(List<String> lst){
		for(String s:lst){
			System.out.print(s+" ");
		}//for end
		System.out.println();
	}//
}//class end
