package ch16_util;
import java.util.*;
/*�޼����
add(Object newElemnet):���Ϳ� ��ü �߰�
get(i) : ������ i��° ��ü ���
size():��� ���� ����
remove():��� ����*/
public class Test09_Vector {
	public static void main(String args[]){
		Vector<String> vec=new Vector<String>();
		
		String s1="hello1";
		String s2="hello2";
		String s3="hello3";
		String s4="hello4";
		String s5="hello5";
		String s6="hello6";
		
		vec.add(s1);//0
		vec.add(s2);//1
		vec.add(s3);//2
		vec.add(s4);
		vec.add(s5);
		vec.add(s6);
		
		for(int i=0;i<vec.size();i++){
			System.out.println((String)vec.get(i) );
		}//for end
		System.out.println();
		//---------------------------------------------
		vec.remove(1);//hellow2, index�� �ٽ� �Ű�����
		for(int i=0;i<vec.size();i++){
			System.out.println((String)vec.get(i) );
		}//for end
		System.out.println();
		
		//--------------------------------------------
		//Enumeration:������ �ڷḦ ���� �� ����Ѵ�
		//              �������� ó���ȴ�
		//---------------------------------------------
		System.out.println("Enumeration");
		Enumeration en=vec.elements();
		
		while(en.hasMoreElements()){//��Ұ� �ִ� ���� �ݺ�
			String s=(String)en.nextElement();
			System.out.println(s);
			
		}//while end
		
	}//main end
}//class end
