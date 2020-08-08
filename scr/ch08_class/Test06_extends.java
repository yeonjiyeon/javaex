package ch08_class;

class PanMae{
	//보호 필드=전역 변수
	protected String pum;//품명
	protected int su;//수량
	protected int dan;//단가
	
	//디폴트 생성자
	public PanMae(){}
	
	//인자있는 생성자
	public PanMae(String pum,int su,int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons end
	
	//사용자정의 메서드
	public void disp(){
		System.out.println(pum+" "+su+" "+dan);
	}//disp() end
}//class end
//-------------------------------------------
//파생클래스
//--------------------------------------------
class PanMaeSub extends PanMae{
	private double rate;//할인율
	
	//디폴트 생성자
	public PanMaeSub(){}
	
	//인자있는 생성자 
	public PanMaeSub(String pum,int su,int dan, double rate){
		super(pum,su,dan);//수퍼클래스 생성자 호출
		this.rate=rate;
	}//cons end
	
	//사용자 정의 메서드
	//오버라이딩: 상속 받은 메슫 내용재정의
	public void disp(){
		System.out.println();
		System.out.println("품명:"+pum);
		System.out.println("수량:"+su);
		System.out.println("단가:"+dan);
		System.out.println("할인율:"+rate);
	}//disp() end
}//class end
public class Test06_extends {
  public static void main(String args[]){
	  PanMae p=new PanMae("백반",1,5000);
	  p.disp();
	  PanMaeSub sub=new PanMaeSub("제육밥",1,4500,0.2);
	  sub.disp();
	  //
	  //상위클래스변수로 하위객체 처리하기
	  p=new PanMaeSub("동태찌게",1,7000,0.1);
	  double d=12;//자동으로 형변환된다
	  p.disp();
	  //
  }//main end
}//class end
