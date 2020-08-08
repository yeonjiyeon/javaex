package ch17_util;
import java.util.*;

public class Test11_Hashtable {
	public static void main(String args[]){
		Hashtable<String,Object> ht=new Hashtable<String,Object>();//객체 생성 
		
		ht.put("id","kim");
		ht.put("pwd","k123");
		ht.put("date", new java.util.Date());
		
		//출력
		System.out.println(ht.get("id"));
		System.out.println(ht.get("pwd"));
		System.out.println(ht.get("date"));
	}//main end
}//class end
