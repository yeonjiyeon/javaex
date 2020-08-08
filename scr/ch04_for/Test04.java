package ch04_for;

public class Test04 {
	public static void main(String args[]){
		//-----------------------
		//2중 for문
		//------------------
		for(int i=1; i<=3; i++){//줄=행=row
			for(int j=1; j<=4; j++){//칸=열column
				System.out.print(j+" ");
			}//inner for 
			System.out.println();//line skip			
		}//out for
		
	}//main end

}//class end
