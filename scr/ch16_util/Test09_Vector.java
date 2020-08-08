package ch16_util;
import java.util.*;
/*메서드들
add(Object newElemnet):백터에 객체 추가
get(i) : 백터의 i번째 객체 얻기
size():요소 갯수 리턴
remove():요소 제거*/
public class Test09_Vector {
	public static void main(String args[]){
		Vector<String> vec=new Vector<String>();
		
		String s1="hello1";
		String s2="hello2";
		String s3="hello3";
		String s4="hello4";
		String s5="hello5";
		String s6="hello6";
		
		vec.add(s1);//0
		vec.add(s2);//1
		vec.add(s3);//2
		vec.add(s4);
		vec.add(s5);
		vec.add(s6);
		
		for(int i=0;i<vec.size();i++){
			System.out.println((String)vec.get(i) );
		}//for end
		System.out.println();
		//---------------------------------------------
		vec.remove(1);//hellow2, index가 다시 매겨진다
		for(int i=0;i<vec.size();i++){
			System.out.println((String)vec.get(i) );
		}//for end
		System.out.println();
		
		//--------------------------------------------
		//Enumeration:나열형 자료를 받을 때 사용한다
		//              순서없이 처리된다
		//---------------------------------------------
		System.out.println("Enumeration");
		Enumeration en=vec.elements();
		
		while(en.hasMoreElements()){//요소가 있는 동안 반복
			String s=(String)en.nextElement();
			System.out.println(s);
			
		}//while end
		
	}//main end
}//class end
