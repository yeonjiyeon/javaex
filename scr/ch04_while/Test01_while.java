package ch04_while;
//�ݺ���: while
public class Test01_while {
	public static void main(String args[]){
		//--------------------------
		//good-Afternoon 5�� ����Ͻÿ�
		//--------------------------
		
		int i=1;//�ʱ�ġ
		while(i<=5){
			System.out.println("good-Afternoon");
			i++;//����ġ
		}//while end
		
		//--------------------------
		//1~10 ����Ͻÿ�
		//--------------------------
		i=1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}//while end
		System.out.println();//�ٹٲ�

		//--------------------------
		//1~10���� 2�� ����� ����Ͻÿ�
		//if,while ���
		//--------------------------
		i=1;
		while(i<=10){
			if(i%2==0){
				System.out.print(i+" ");//if������ �ѹ����� ��쿡�� {}�߰�ȣ ������ ���������� ���� �����Ͻ� X
			}//if
			i++;//1������
		}//while end
		System.out.println();//�ٹٲ�
		

		//--------------------------
		//1~50���� 7�� ����� ����Ͻÿ�
		//if,while ���
		//--------------------------
		i=1;
		while(i<=50){
			if(i%7==0){
				System.out.print(i+" ");
			}//if
			i++;
		}//while end
		System.out.println();
		
	}//main end
}//class end
