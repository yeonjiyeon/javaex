package ch04_for;

public class Test06_for {
	public static void main(String args[]){
		//* * * *
		//* * * *
		//* * * *
		//* * * *
		//위쪽 예와 같이 출력하시오
		for(int i=1; i<=4;i++){//row
			for(int j=1; j<=4;j++){//column
				System.out.print("*");
			}//inner for
			System.out.println();//줄바꿈
				}//out for
		
		
		
		//=============================================================================
		//      *
		//    * *
		//  * * *
		//* * * *
		for(int i=1; i<=4; i++){
			for(int j=1; j<=(5-i); j++){//공백추가
				System.out.print(" ");
			}//inner for
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}//out for
		
		//====================================
				//    *
				//   ***
				//  *****
				// *******
		for(int i=1; i<=4; i++){
			for(int j=1; j<=(5-i); j++){//공백추가
				System.out.print(" ");			
			}//inner for
			for(int k=1; k<=(i*2-1); k++){
				System.out.print("*");
			}//inner for
			System.out.println();
		}//out for
		
	}//main end

}//class end
