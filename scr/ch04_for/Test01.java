package ch04_for;

public class Test01 {
	public static void main(String args[]){
		//�ݿ����� 10�� ����ϱ�
		for(int i=1; i<=10; i++){
			System.out.println(i+", �ݿ���");
		}//for end
		
		//1~10���� ��� 1 2 3 4 5 6 8 9 10
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
		}//for end
		System.out.println();//line skip
		
		// A B C....Z����ϱ�
		for(int i=65; i<=90; i++){
			System.out.print((char)i);
		}//for end
		
		System.out.println();//line skip
		
		// A B C....Z����ϱ�
		for(char ch='A'; ch<='Z'; ch++){
			System.out.print(ch);
		}//for end
		
		System.out.println();//line skip
		
		//10~1���
		for(int i=10; i>=1; i--){
			System.out.print(i+" ");
		}//for end
	}//main end

}//class end
