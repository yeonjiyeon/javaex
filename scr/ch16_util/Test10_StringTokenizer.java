package ch16_util;
import java.util.*;
/*nextToken():�Ľ̵� ���ڿ��� ���ʷ� �������ش�
hasMoreTokens():  nextToken()�� �ڿ� Token�� �����ִ��� ���� Ȯ��
countTokens():��ū��������*/

public class Test10_StringTokenizer {
	public static void main(String args[]){
		StringTokenizer st=new StringTokenizer("�趱��|«¥��|���뱹|������ġ","|");
		System.out.println("��ū����:"+st.countTokens());
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}//while end
		System.out.println();//����
		
		StringTokenizer st2=new StringTokenizer("����,����,���,��,��",",");
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}//while end
		System.out.println();
		
		//String split() ���
		String str="���ɸ���:���ø�:���ϸ�";
		String temp[]=str.split(":");// |������
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}//for end
		
		
	}//main end
}//class end
