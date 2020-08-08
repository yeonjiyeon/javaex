package ch17_util;
import java.util.*;
//면접시험
//Hashtable 과 HashMap 차이점
//Hashtable은 동기화 기능이 있고 
//HashMap은 동기화기능이 없다

//Vector : 스레드 기능이 있고
//ArrayList는 스레드 기능이 없다
//이둘의 차이점은 동기화(Synchronization)를 둘 수 있다
//HashMap은 동기화를 지원하지 않는다
//반면 다중스레드환경에서 Hashtable은 동기화를 지원한다

public class Test12_HashMap {
	public static void main(String args[]){
		Map <String,String>map=new HashMap<String,String>();//객체 생성
		map.put("id", "kim");
		map.put("pwd", "k12345");
		map.put("email", "kim@nate.com");
		map.put("date", new java.util.Date().toString());//********
		
		//출력
		System.out.println(map.get("id"));
		System.out.println(map.get("pwd"));
		System.out.println(map.get("email"));
		System.out.println(map.get("date"));
		
		//HashMap(key,value)
		//BoardDTO.java 빈 변수=값;
	}//main end
}//class end
