package ch17_util;
import java.util.*;
public class Test09_List {
	public static void main(String args[]){
		List<String> list=new ArrayList<String>();//��ü ����
		list.add("���1");//index 0
		list.add("���2");//index 1
		list.add("���3");//index 2
		list.add("���4");//index 3
		list.add("���5");//index 4
		lstprint(list);//�޼��� ȣ��
		
		list.add(2,"Ű��");//index 2�� Ű���� ����
		lstprint(list);//�޼��� ȣ�� 
		
		list.set(4,"����");//index 4�� ������ �ٲ۴�
		lstprint(list);//�޼��� ȣ��
		
		list.remove(1);//index 1��° ������� 
		lstprint(list);//�޼��� ȣ��
		
		list.remove("Ű��");//Ű�� ����
		lstprint(list);//�޼��� ȣ��
		
		//���� ��ġ(index)�� ��� 
		int idx=list.indexOf("����");
		System.out.println("������ġ:"+idx);
	}//main end
	
	//����� ���� �޼���
	private static void lstprint(List<String> lst){
		for(String s:lst){
			System.out.print(s+" ");
		}//for end
		System.out.println();
	}//
}//class end
