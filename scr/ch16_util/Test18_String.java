package ch16_util;
//String 
public class Test18_String {
	public static void main(String args[]){
		String s1="Hello";
		String s2="Good";
		System.out.println("���ڿ� ���� �Ǵ� ���ڿ�����:"+s1.length());
		System.out.println(s1.concat(s2));//���ڿ� ��ħ
		
		System.out.println(s1.replace('e', 'a'));
		
		String s3="������ ȭ���� ȫ�浿 ��";
		System.out.println(s3.replace("ȫ�浿", "������"));
		//replace("\n","<br>")
		
		String s4="GoodMoring";
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
	}//main end
}//class end
