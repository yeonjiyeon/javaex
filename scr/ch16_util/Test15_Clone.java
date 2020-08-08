package ch16_util;
//객체 복사
public class Test15_Clone implements Cloneable{
	//변수
	String myName;
	//생성자
	public Test15_Clone(String myName){
		this.myName=myName;
	}//cons end
	//메서드,오버라이딩
	public String toString(){
		return myName+"입니다";
	}
	
	public static void main(String args[]) throws Exception{
		Test15_Clone ob1=new Test15_Clone("첫번째");//객체생성,생성자호출
		System.out.println("ob1 :"+ob1);
		System.out.println("ob1.toString() :"+ob1.toString());
		//
		Double D=new Double(22.2);//객체 생성
		System.out.println("D:"+D);
		System.out.println("D.toString():"+D.toString());
		//객체 복사 
		Test15_Clone ob2=(Test15_Clone)ob1.clone();
		System.out.println("ob2 :"+ob2);
		System.out.println("ob2.toString() :"+ob2.toString());
		
		System.out.println(ob1.equals(ob2));//false
		System.out.println(ob1==ob2);
		
		System.out.println(ob1.toString().equals(ob2.toString()));
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}//main end
}//class end
