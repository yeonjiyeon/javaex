package ch17_util;
import java.util.*;
public class Test07_List {
	public static void main(String args[]){
		List <String> list=new ArrayList<String>();//객체생성
		
		list.add("인사과");//index0
		list.add("인사과");//1
		list.add("충무과");//2
		list.add("회계");//3
		list.add("전산원");//4
		
		System.out.println("size, 요소갯수:" +list.size());
		
		//일반for
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}//for end
		System.out.println();
		
		//단축for
		for(String s:list){
			System.out.println(s);
		}
		
		//iterator를 사용하여 출력
		Iterator iter=list.iterator();
		while(iter.hasNext()){//자료가 있는 동안 반복실행
			System.out.println(iter.next());
			}//while
	}//main end
}//class end
