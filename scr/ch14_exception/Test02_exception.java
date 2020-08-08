package ch14_exception;
//방법2:간접처리
public class Test02_exception {
	public static void main(String args[]) throws Exception{
		int su=Integer.parseInt(args[0]);
		
		//if(su%2==0){
		if(su%0==0){
			System.out.println(su+"는 짝수");
		}else{
			System.out.println(su+"는 홀수");			
		}//else end
	}//main end
}//class end
//1.배열값을 입력않고 실행
//2.a라고 입력하고 실행
//3.숫자를 입력하고 실행(정상)
//4.su&0 수정,숫자를 입력하고 실행