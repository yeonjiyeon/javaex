package ch14_exception;
import java.util.Scanner;
//방법1:직접처리
public class Test01_exception {
	public static void main(String args[]){
		try{
			System.out.print("숫자를 입력하시오>>");
			Scanner scanner=new Scanner(System.in);
			int su=Integer.parseInt(args[0]);//정수받기

			//if(su%2==0){
			if(su%0==0){
				System.out.println(su+"는 짝수");
			}else{
				System.out.println(su+"는 홀수");
				}//else end
			}catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("배열예외:"+e1);
			}catch(NumberFormatException e2){
				System.out.println("숫자가 아닙니다:"+e2);
			}catch(ArithmeticException e3){
				System.out.println("0으로 나눌 수 없음:"+e3);
			}finally{
				System.out.println("finally절은 예외발생과 상관없이 실행합니다");
			}//finally end
			
		
	}//main end
}//class end
//1.배열값을 입력않고 실행
//2.a라고 입력하고 실행
//3.숫자를 입력하고 실행(정상)
//4.su&0 수정,숫자를 입력하고 실행