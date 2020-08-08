package ch16_util;

public class Test01_wrapper {
	public static void main(String args[]){
		boolean b=true;
		Boolean B=new Boolean(b);
		
		int a=10;
		Integer A=new Integer(a);
		
		double d=12.5;
		Double D=new Double(d);
		
		//toString()은 Object의 메서드이다
		//toString():객체자료형을 문자열로 변환
		//Object는 묵시적으로 항상 상속받아져 있다
		
		
		System.out.println("Wrapper Class:"+B.toString());		
		System.out.println("Wrapper Class:"+A.toString());		
		System.out.println("Wrapper Class:"+D.toString());
		
		java.util.Date date=new java.util.Date();
		System.out.println("date:"+date.toString());
		
	}//main end
}//class end
