package ch16_util;
import java.util.*;
//StringTokenizer, String split()
public class Test11_StringTokenizer {
	public static void main(String args[]){
		String addr="서울시:마포구 부산시:동례구 대전시:대덕구";
		String temp[]=addr.split(" ");
		for(int i=0;i<temp.length;i++){
			StringTokenizer st=new StringTokenizer(temp[i],":");
			while(st.hasMoreTokens()){//token이 있는동안 반복실행
				System.out.print(st.nextToken()+" ");
			}//while
			System.out.println();
		}//for end
	}//main end 
}//class end
