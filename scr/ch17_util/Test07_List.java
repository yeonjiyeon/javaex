package ch17_util;
import java.util.*;
public class Test07_List {
	public static void main(String args[]){
		List <String> list=new ArrayList<String>();//��ü����
		
		list.add("�λ��");//index0
		list.add("�λ��");//1
		list.add("�湫��");//2
		list.add("ȸ��");//3
		list.add("�����");//4
		
		System.out.println("size, ��Ұ���:" +list.size());
		
		//�Ϲ�for
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}//for end
		System.out.println();
		
		//����for
		for(String s:list){
			System.out.println(s);
		}
		
		//iterator�� ����Ͽ� ���
		Iterator iter=list.iterator();
		while(iter.hasNext()){//�ڷᰡ �ִ� ���� �ݺ�����
			System.out.println(iter.next());
			}//while
	}//main end
}//class end
