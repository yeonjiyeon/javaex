package ch17_util;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;



public class Test08_Set_Lotto {
	public static void main(String args[]){
		Set<String> set=new HashSet<String>();//,��ü����
		Random r=new Random();
		while(set.size()<6){
			//int a=(int)(Math.random()*45+1);
			int a=r.nextInt(44)+1;
			String str=""+a;//������ ���ڿ��� ��ȯ
			set.add(str);
		}//while end
		//���� for ���
		for(String s:set){
			System.out.print(s+" ");
		}//for end
		
	}//main end
}//class end
