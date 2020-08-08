package ch17_util;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

//Iterator는 Enumeration 과 Collection을 통합해서 받아낼 수 있는 기능을 가지고 있는 것

//Iterator를 상속받은 클래스들(Collection,Set,List,ArrayList)
//제너리 사용
public class Test02_Generic {
	//사용자 정의 메서드
		private void testCollection(){
			List<String> list=new ArrayList<String>();
			list.add(new String("hello"));
			list.add(new String("Good"));
			//list.add(new Integer(10));
			
			outPrint(list);//메서드 호출
		}
		//사용자 정의 메서드 
		private void outPrint(Collection c){
			Iterator iter=c.iterator();
			
			while(iter.hasNext()){//자료가 있는 동안 반복 수행
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
