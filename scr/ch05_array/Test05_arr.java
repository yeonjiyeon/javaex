package ch05_array;

public class Test05_arr {
	public static void main(String args[]){
		int a[]={100,200,300};
		int b[];
		b=a;
		for(int i=0;i<a.length; i++){
			System.out.println(a[i]+":"+b[i]);
		}//for end
		
	}//main end

}//class end
