package ch17_util;
import java.util.*;
public class Test06_Set {
	public static void main(String args[]){
		Set<String> set=new HashSet<String>();//��ü ����
		
		set.add("�λ��");
		set.add("�λ��");
		set.add("�湫��");
		set.add("ȸ��");
		set.add("�����");
		
		System.out.println("size ��Ұ���:"+set.size());
		
		for(String str:set){
			System.out.println(str); //�������� ó�� �ߺ�����
		}//for end
		System.out.println();
		//-------------------------------
		//iterator: ��� �÷��ǿ��� ����� �� �ִ�
		//-------------------------------------
		Iterator iter=set.iterator();
		while(iter.hasNext()){//�ڷᰡ �ִ� ���� �ݺ�����
			System.out.println(iter.next());
		}//while end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end
	
}//class end
