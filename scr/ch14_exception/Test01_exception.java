package ch14_exception;
import java.util.Scanner;
//���1:����ó��
public class Test01_exception {
	public static void main(String args[]){
		try{
			System.out.print("���ڸ� �Է��Ͻÿ�>>");
			Scanner scanner=new Scanner(System.in);
			int su=Integer.parseInt(args[0]);//�����ޱ�

			//if(su%2==0){
			if(su%0==0){
				System.out.println(su+"�� ¦��");
			}else{
				System.out.println(su+"�� Ȧ��");
				}//else end
			}catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("�迭����:"+e1);
			}catch(NumberFormatException e2){
				System.out.println("���ڰ� �ƴմϴ�:"+e2);
			}catch(ArithmeticException e3){
				System.out.println("0���� ���� �� ����:"+e3);
			}finally{
				System.out.println("finally���� ���ܹ߻��� ������� �����մϴ�");
			}//finally end
			
		
	}//main end
}//class end
//1.�迭���� �Է¾ʰ� ����
//2.a��� �Է��ϰ� ����
//3.���ڸ� �Է��ϰ� ����(����)
//4.su&0 ����,���ڸ� �Է��ϰ� ����