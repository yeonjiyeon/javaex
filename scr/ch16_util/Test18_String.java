package ch16_util;
//String 
public class Test18_String {
	public static void main(String args[]){
		String s1="Hello";
		String s2="Good";
		System.out.println("문자열 길이 또는 문자열갯수:"+s1.length());
		System.out.println(s1.concat(s2));//문자열 합침
		
		System.out.println(s1.replace('e', 'a'));
		
		String s3="오늘은 화요일 홍길동 말";
		System.out.println(s3.replace("홍길동", "아이유"));
		//replace("\n","<br>")
		
		String s4="GoodMoring";
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
	}//main end
}//class end
