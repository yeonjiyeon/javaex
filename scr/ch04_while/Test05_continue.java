package ch04_while;
//continue문 : 다시 반복하러 간다
//continue문: 반복문의 끝을 만난것과 같다
public class Test05_continue {
	public static void main(String args[]){
		//for
		for(int i=1;i<=10;i++){
			if(i%2 !=0) continue;
			System.out.print(i+" ");//짝수만 출력
		}//for
		
		//------------------------------
		try{
			//처리문;
		}catch(Exception ex){                //예외잡기
			//에러 메시지 출력
			//continue
		}
	  //----------------------------------------------------	
		System.out.println();
		
		
		int a=0;
		while(a<10){
			a++;
			if(a%2==0) continue;
			System.out.print(a+" ");
			
		}//while end
	}//main end
}//class end
