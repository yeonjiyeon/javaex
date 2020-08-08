package ch17_util;
import java.util.*;

public class Test10_vector {
	public static void main(String args[]){
		Vector<String> vec=new Vector<String>();//°´Ã¼ »ý¼º
		
		vec.add("¹«´ë¸®");
		vec.add("±è±â»ç");
		vec.add("°©µ¹ÀÌ");
		vec.add("°©¼øÀÌ");
		vec.add("¿ù¸Å");
		
		System.out.println("size, ¿ä¼Ò°¹¼ö:"+vec.size());
		
		//for
		for(int i=0;i<vec.size();i++){
			System.out.print(vec.get(i)+" ");
		}//for 
		
		System.out.println();
		
		
		//for
		for(String s:vec){
			System.out.print(s+" ");
		}//for end
		
		System.out.println();
		//iterator
		Iterator iter=vec.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		
	}//main end
}//class end
