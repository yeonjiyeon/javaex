package ch04_while;
//while���� do~while����
//while���� ������ false�϶��� �ѹ��� ó���� ���Ѵ�
//do~while�� ������ flase�϶� 1�� ó���� �Ѵ� 

public class Test03_while_do_while {
	public static void main(String args[]){
		//while
		int a=10000;
		while(a<=100){
			System.out.println("hi~");
			a++;
		}//while end
		
		//do~ while
		a=10000;
		do{
			System.out.println("good~");
			a++;
		}while(a<=100);
	}//main end

}//class end
