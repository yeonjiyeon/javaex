package ch16_util;
import java.util.*;
/*메서드들
add(Object newElemnet):백터에 객체 추가
get(i) : 백터의 i번째 객체 얻기
size():요소 갯수 리턴
remove():요소 제거*/

public class Test08_Vector {
	public static void main(String args[]){
		Vector<String> vec=new Vector<String>();
		for(int i=0;i<args.length;i++){
			vec.add(args[i]);//백터의 객체 추가
		}//for end
		
		//출력
		String str="";
		for(int i=0;i<vec.size();i++){
			str=(String)vec.get(i);
			System.out.println("Vector :"+i+"번째요소"+str);
		}//for end
	}//main end
}//class end
