package ch03_oper;

public class Test11_equals_instanceof {
	public static void main(String args[]){
		/*
		 ==연산자: 기본 데이터형에 적용할 경우사용(대소문자 구분)
equls()메서드: 문자열을 비교할 때 사용
equalsIgnoreCase():문자열을 대소문자구분않고 비교한다. 
YES, Yes, yes

     */
		String str="hello";
		System.out.println(str.equals("hello"));//t
		System.out.println(str.equals("Hello"));
		System.out.println(str.equalsIgnoreCase("Hello"));
		
		/*instatnceof : 객체비교(예: 객체 instanceof 클래스)
              왼쪽을 객체, 오른쪽은 클래스를 써야한다. 
              왼쪽 객체변수가 오른쪽 클래스의 오브젝트(인스턴스)인가 */
		
		Object ob=new Object();
		String str1=new String("kim");
		System.out.println(str1 instanceof String);//true
		System.out.println(str1 instanceof Object);//true
		System.out.println(ob instanceof String);//false
	}

}//class end
