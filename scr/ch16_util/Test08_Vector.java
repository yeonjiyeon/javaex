package ch16_util;
import java.util.*;
/*�޼����
add(Object newElemnet):���Ϳ� ��ü �߰�
get(i) : ������ i��° ��ü ���
size():��� ���� ����
remove():��� ����*/

public class Test08_Vector {
	public static void main(String args[]){
		Vector<String> vec=new Vector<String>();
		for(int i=0;i<args.length;i++){
			vec.add(args[i]);//������ ��ü �߰�
		}//for end
		
		//���
		String str="";
		for(int i=0;i<vec.size();i++){
			str=(String)vec.get(i);
			System.out.println("Vector :"+i+"��°���"+str);
		}//for end
	}//main end
}//class end
