package ch16_util;
//��ü ��

class Test2{
	int val;
	public Test2(int vl){//������
		this.val=val;
	}
}//class end
public class Test17_String {
	public static void main(String args[]){
		Test2 A=new Test2(10);
		Test2 B=new Test2(10);
		
		if(A==B){
			System.out.println("A==B");
		}else{
			System.out.println("A!=B");
		}//if 
		
		//------------------------------------------------
		if(A.equals(B)){
			System.out.println("A.equals(B)");
		}else{
			System.out.println("A.equals(B) �ƴϴ�");
		}//if
		
		//----------------------------
		A=B;
		if(A==B){
			System.out.println("A==B");
		}else{
			System.out.println("A!=B");
		}
		
		if(A.equals(B)){
			System.out.println("A.equals(B)");
		}else{
			System.out.println("A.equals(B) �ƴϴ�");
		}
	}//main end
}//class end
