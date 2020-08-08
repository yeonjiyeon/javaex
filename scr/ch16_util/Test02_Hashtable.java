package ch16_util;
import java.util.*;
//Hashtable抗力

public class Test02_Hashtable {
	public static void main(String args[]){
		Hashtable<String,Object> ht=new Hashtable<String,Object>();//按眉积己
		
		ht.put("id", "kim");
		ht.put("pwd", "k12345");
		ht.put("date", new java.util.Date());
		ht.put("email", "kim@nate.com");
		ht.put("addr", "辑匡备肺备");
		
		System.out.println("肮荐:"+ht.size());
		String id=(String)ht.get("id");
		System.out.println("id:"+id);
		
		System.out.println("id:"+ht.get("id"));
		System.out.println("pwd:"+ht.get("pwd"));
		System.out.println("date:"+ht.get("date"));
		System.out.println("email:"+ht.get("email"));
		System.out.println("addr:"+ht.get("addr"));
	}//main end
}//class end
