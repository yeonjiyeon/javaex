package ch16_util;
//String 
public class Test16_String {
	public static void main(String args[]){
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);//true
		//문자열이 똑같은 경우는 같은 주소를 참조한다

		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s3==s4);//false 
		//객체생성으로 하면 다른 주소를 참조한다
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s3.toString().equals(s4.toString()));
	}//main end
}//class end
