package ch16_util;
import java.util.*;
//StringTokenizer, String split()
public class Test11_StringTokenizer {
	public static void main(String args[]){
		String addr="�����:������ �λ��:���ʱ� ������:�����";
		String temp[]=addr.split(" ");
		for(int i=0;i<temp.length;i++){
			StringTokenizer st=new StringTokenizer(temp[i],":");
			while(st.hasMoreTokens()){//token�� �ִµ��� �ݺ�����
				System.out.print(st.nextToken()+" ");
			}//while
			System.out.println();
		}//for end
	}//main end 
}//class end
