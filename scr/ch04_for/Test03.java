package ch04_for;

public class Test03 {
	public static void main(String args[]){
		//1~10까지 합구하기 
		int sum=0;//초기화, 방을 클리어
		for(int i=1; i<=10; i++){
			sum+=i;//sum=sum+i 
		}//for
		System.out.println("1~10까지 합:"+sum);
		//
		//1~100까지 합구하기 
		sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;//sum=sum+i
		}//for
		System.out.println("1~100까지 합:"+sum);
		//
		//1~10까지 짝수의 합을 구하시오
		sum=0;
		for(int i=1; i<=10; i++){
			if(i%2==0){//짝수일때만 합을 구한다
				sum+=i;//sum=sum+i
				System.out.print("i"+i+'\t');
			}//if
			
		}//for
		System.out.println(" ");
		
		System.out.println("\n1~10까지 짝수의 합"+sum);
		
		sum=0;
		for(int i=1; i<=50; i++){
			if(i%7==0){
				sum+=i;
			}//if
		}//for
		System.out.println("1~50까지 7의 배수의 합"+sum);
	}//main end

}//class end
