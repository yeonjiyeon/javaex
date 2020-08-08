package ch04_while;

//do~while문
public class Test02_do_while {
	public static void main(String args[]){
		//--------------------------
		//good-Afternoon 5번 출력하시오
		//--------------------------
		int i=1;
		do{
			System.out.println("good-Afternoon");
			i++;
		}while(i<=5);

		//--------------------------
		//1~10 출력하시오
		//--------------------------
		i=1;
		do{
			System.out.print(i+" ");
			i++;
			
		}while(i<=10);
		
		System.out.println();
		
		//--------------------------
		//1~50까지 8의 배수를 출력하시오
		//if,while 사용
		//--------------------------

		i=1;
		do{
			if(i%8==0){
				System.out.print(i+" ");
				
			}//if end
			i++;
		}while(i<=50);
		System.out.println();
		
		
	}//main end

}//class end


