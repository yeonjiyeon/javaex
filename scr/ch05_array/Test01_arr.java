package ch05_array;

public class Test01_arr {
	public static void main(String[] args) {
		//일반 변수사용
		int a=10;
		int b=20;
		int c=30;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		//배열사용
		int n[]={40,50,60};
		System.out.println("n[0]:"+n[0]);
		System.out.println("n[1]:"+n[1]);
		System.out.println("n[2]:"+n[2]);
		System.out.println();//line skip
		
		for(int i=0;i<3;i++){
			System.out.println("n["+i+"]"+n[i]);
		}//for end
		
		System.out.println();//line skip
		//배열이름.length 사용
		
		System.out.println("배열요소 갯수:"+n.length);
		
		for(int i=0;i<n.length; i++){
			System.out.println("n["+i+"]"+n[i]);
		}//for end
		
		System.out.println("나이:"+27);
	}//main end

}//class end
