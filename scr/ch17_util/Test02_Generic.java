package ch17_util;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

//Iterator�� Enumeration �� Collection�� �����ؼ� �޾Ƴ� �� �ִ� ����� ������ �ִ� ��

//Iterator�� ��ӹ��� Ŭ������(Collection,Set,List,ArrayList)
//���ʸ� ���
public class Test02_Generic {
	//����� ���� �޼���
		private void testCollection(){
			List<String> list=new ArrayList<String>();
			list.add(new String("hello"));
			list.add(new String("Good"));
			//list.add(new Integer(10));
			
			outPrint(list);//�޼��� ȣ��
		}
		//����� ���� �޼��� 
		private void outPrint(Collection c){
			Iterator iter=c.iterator();
			
			while(iter.hasNext()){//�ڷᰡ �ִ� ���� �ݺ� ����
				String item=(String)iter.next();
				System.out.println(item);
			}//while end
		}//end
		//main 
		public static void main(String args[]){
			Test02_Generic tg=new Test02_Generic();
			tg.testCollection();
		}//main end

}//class end
