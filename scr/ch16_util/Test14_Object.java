package ch16_util;
//Object
import static java.lang.System.out;

class Test{
	
}

public class Test14_Object {
	public static void main(String args[]){
		Test A=new Test();
		Test B=new Test();
		Test C=new Test();
		
		out.println("A Ŭ�����̸�:"+A.getClass());
		out.println("A �ؽ��ڵ�:"+A.hashCode());
		out.println("A ��ü���ڿ�:"+A.toString());
		out.println();
		out.println("B Ŭ�����̸�:"+B.getClass());
		out.println("B �ؽ��ڵ�:"+B.hashCode());
		out.println("B ��ü���ڿ�:"+B.toString());
		out.println();
		out.println("c Ŭ�����̸�:"+C.getClass());
		out.println("c �ؽ��ڵ�:"+C.hashCode());
		out.println("c ��ü���ڿ�:"+C.toString());
		out.println();
		Test14_Object ob=new Test14_Object();
		out.println("ob Ŭ�����̸�:"+ob.getClass());
		out.println("ob �ؽ��ڵ�:"+ob.hashCode());
		out.println("ob ��ü���ڿ�:"+ob.toString());
	}//main end
}//class end
