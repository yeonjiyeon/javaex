package ch14_exception;
//���2:����ó��
public class Test02_exception {
	public static void main(String args[]) throws Exception{
		int su=Integer.parseInt(args[0]);
		
		//if(su%2==0){
		if(su%0==0){
			System.out.println(su+"�� ¦��");
		}else{
			System.out.println(su+"�� Ȧ��");			
		}//else end
	}//main end
}//class end
//1.�迭���� �Է¾ʰ� ����
//2.a��� �Է��ϰ� ����
//3.���ڸ� �Է��ϰ� ����(����)
//4.su&0 ����,���ڸ� �Է��ϰ� ����