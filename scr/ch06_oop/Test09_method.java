package ch06_oop;

public class Test09_method {
	String pum;//품명 전역변수
	int su;//수량
	int dan;//단가
	
	//전역변수에 값을 설정하는 메서드
	public void setDate(String pum,int su,int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//setDate() end
	
	//값을 출력하는 메서드
	public void disp(){
		System.out.println("품명:"+pum);
		System.out.println("수량:"+su);
		System.out.println("단가:"+dan);
		System.out.println("금액:"+(su*dan)+'\n');
		
	}//disp() end
  public static void main(String args[]){
	  Test09_method t=new Test09_method();//객체 생성
	  t.setDate("도련님고기고기",17,5500);
	  t.disp();
	  
	  t.setDate("구내 식당밥",2,4500);
	  t.disp();
  }//main end
}//class end
