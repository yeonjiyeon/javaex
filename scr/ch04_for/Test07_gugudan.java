package ch04_for;

public class Test07_gugudan {
	public static void main(String args[]){
		//구구단
		//2*1=2  3*1=3...9*1=9
		//2*2=4  3*2=6...9*2=18
		//
		//2*9=19 3*9=27...9*9=81
		
		for(int i=1;i<=9;i++){//행=row
			for(int j=2;j<=9;j++){
				System.out.print(j+"*"+i+"="+(j*i)+" \t");	
			}//inner for
			System.out.println();
		}//out for

		}//main end 
	}//class end
		