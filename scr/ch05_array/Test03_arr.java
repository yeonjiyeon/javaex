package ch05_array;

public class Test03_arr {
	public static void main(String args[]){
		//배역은 지역 일지라도 자동으로 초기화된다
		//double형
		double d[]=new double[3];
		for(int i=0;i<d.length; i++){
			System.out.println(d[i]);
		}//for end 
		
		
		//char
		char ch[]=new char[3];
		for(int i=0;i<ch.length; i++){
			System.out.println(ch[i]);
		}//for end
		
		//String 
		//String name=""; 
		String str[]=new String[3];
		for(int i=0; i<str.length; i++){
			System.out.println(str[i]);
		}//for end
	}//main end

}//class end
