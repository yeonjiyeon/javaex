package ch16_util;
import java.util.*;
/*nextToken():파싱된 문자열을 차례로 리턴해준다
hasMoreTokens():  nextToken()한 뒤에 Token이 남아있는지 여부 확인
countTokens():토큰갯수리턴*/

public class Test10_StringTokenizer {
	public static void main(String args[]){
		StringTokenizer st=new StringTokenizer("김떡순|짬짜면|순대국|샌드위치","|");
		System.out.println("토큰갯수:"+st.countTokens());
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}//while end
		System.out.println();//개행
		
		StringTokenizer st2=new StringTokenizer("참외,수박,사과,감,밤",",");
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}//while end
		System.out.println();
		
		//String split() 사용
		String str="막걸리도:마시면:취하리";
		String temp[]=str.split(":");// |사용못함
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}//for end
		
		
	}//main end
}//class end
