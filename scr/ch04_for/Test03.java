package ch04_for;

public class Test03 {
	public static void main(String args[]){
		//1~10���� �ձ��ϱ� 
		int sum=0;//�ʱ�ȭ, ���� Ŭ����
		for(int i=1; i<=10; i++){
			sum+=i;//sum=sum+i 
		}//for
		System.out.println("1~10���� ��:"+sum);
		//
		//1~100���� �ձ��ϱ� 
		sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;//sum=sum+i
		}//for
		System.out.println("1~100���� ��:"+sum);
		//
		//1~10���� ¦���� ���� ���Ͻÿ�
		sum=0;
		for(int i=1; i<=10; i++){
			if(i%2==0){//¦���϶��� ���� ���Ѵ�
				sum+=i;//sum=sum+i
				System.out.print("i"+i+'\t');
			}//if
			
		}//for
		System.out.println(" ");
		
		System.out.println("\n1~10���� ¦���� ��"+sum);
		
		sum=0;
		for(int i=1; i<=50; i++){
			if(i%7==0){
				sum+=i;
			}//if
		}//for
		System.out.println("1~50���� 7�� ����� ��"+sum);
	}//main end

}//class end
