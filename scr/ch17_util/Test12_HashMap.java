package ch17_util;
import java.util.*;
//��������
//Hashtable �� HashMap ������
//Hashtable�� ����ȭ ����� �ְ� 
//HashMap�� ����ȭ����� ����

//Vector : ������ ����� �ְ�
//ArrayList�� ������ ����� ����
//�̵��� �������� ����ȭ(Synchronization)�� �� �� �ִ�
//HashMap�� ����ȭ�� �������� �ʴ´�
//�ݸ� ���߽�����ȯ�濡�� Hashtable�� ����ȭ�� �����Ѵ�

public class Test12_HashMap {
	public static void main(String args[]){
		Map <String,String>map=new HashMap<String,String>();//��ü ����
		map.put("id", "kim");
		map.put("pwd", "k12345");
		map.put("email", "kim@nate.com");
		map.put("date", new java.util.Date().toString());//********
		
		//���
		System.out.println(map.get("id"));
		System.out.println(map.get("pwd"));
		System.out.println(map.get("email"));
		System.out.println(map.get("date"));
		
		//HashMap(key,value)
		//BoardDTO.java �� ����=��;
	}//main end
}//class end
