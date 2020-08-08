package ch04_while;
//while문과 do~while문비교
//while문은 조건이 false일때는 한번도 처리를 안한다
//do~while문 조건이 flase일때 1번 처리를 한다 

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
