package ch17_util;
import java.util.*;
/*2.Enhanced Loop(���� for)
Enhanced Loop(for��)�� Collection �̳� �迭���� ���������͸� ó���� �� ����Ѵ� 

���� 
for(�Ķ����:������(�ݷ����ڷ�)){
  ó��
  ��� :�Ķ����
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
		System.out.println();//����
		//-------------------------------
		
		List <String> list=new ArrayList<String>();//��ü����
		list.add("����");
		list.add("ġŲ");
		list.add("�ܹ���");
		list.add("���̽�ũ��");
		list.add("�ݶ�");
		
		for(String s:list){
			System.out.println(s);
		}
	}//main end
}//class end
