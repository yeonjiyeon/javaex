package ch05_array;

public class Test01_arr {
	public static void main(String[] args) {
		//�Ϲ� �������
		int a=10;
		int b=20;
		int c=30;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		//�迭���
		int n[]={40,50,60};
		System.out.println("n[0]:"+n[0]);
		System.out.println("n[1]:"+n[1]);
		System.out.println("n[2]:"+n[2]);
		System.out.println();//line skip
		
		for(int i=0;i<3;i++){
			System.out.println("n["+i+"]"+n[i]);
		}//for end
		
		System.out.println();//line skip
		//�迭�̸�.length ���
		
		System.out.println("�迭��� ����:"+n.length);
		
		for(int i=0;i<n.length; i++){
			System.out.println("n["+i+"]"+n[i]);
		}//for end
		
		System.out.println("����:"+27);
	}//main end

}//class end
