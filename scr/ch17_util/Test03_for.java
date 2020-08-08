package ch17_util;
import java.util.*;
/*2.Enhanced Loop(단축 for)
Enhanced Loop(for문)은 Collection 이나 배열같은 군집데이터를 처리할 때 사용한다 

형식 
for(파라미터:변수명(콜렉션자료)){
  처리
  출력 :파라미터
}*/
public class Test03_for {
	public static void main(String args[]){
		String str[]={"kim","lee","park"};
		
		for(String s:str){
			System.out.println(s);
		}
		//--------------------------------------------
		
		int arr[]={10,20,30,40,50};
		for(int a:arr){
			System.out.print(a+" ");
		}//for
		System.out.println();//개행
		//-------------------------------
		
		List <String> list=new ArrayList<String>();//객체생성
		list.add("피자");
		list.add("치킨");
		list.add("햄버거");
		list.add("아이스크림");
		list.add("콜라");
		
		for(String s:list){
			System.out.println(s);
		}
	}//main end
}//class end
