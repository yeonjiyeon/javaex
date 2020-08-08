package ch03_oper;

public class Test08 {
	public static void main(String args[]){
		//shift ¿¬»êÀÚ
		short a=10;// 00000000 00001010
		int b=a<<2;// 00000000 00101000
		int c=a>>2;// 00000000 00000010
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
	}//main end
}//class end
