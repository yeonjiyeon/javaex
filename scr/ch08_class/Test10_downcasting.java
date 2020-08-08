package ch08_class;
//클래스
class PanMae3{
	//변수
	protected String pum;//품명
	protected int su;//수량
	protected int dan;//단가	

	//디폴트 생성자
	public PanMae3(){}
	
	//인자있는 생성자
	public PanMae3(String pum,int su,int dan){
		this.pum=pum;//인수값을 전역변수에 할당
		this.su=su;
		this.dan=dan;
	}//cons end
	
	
	//사용자 정의 메소드
	public void disp(){
		System.out.println();
		System.out.println("pum:"+pum);
		System.out.println("su:"+su);
		System.out.println("dan:"+dan);
	}
}//class end---------------------------------------

//파생클래스
class PanMaeSub3 extends PanMae3{
	private double rate;//할인율
	
	//디폴트 생성자
	public PanMaeSub3(){}
	
	//인자있는 생성자
	public PanMaeSub3(String pum,int su, int dan, double rate){
		super(pum,su,dan);//상위클래스홀출
		this.rate=rate;
	}
	//오버라이딩:상속받은 메서드 내용 재정의 
	public void disp(){
		System.out.println();//line skip
		System.out.println("품명:"+pum);
		System.out.println("수량:"+su);
		System.out.println("단가:"+dan);	
	}
	//사용자 정의 메서드
	public void halInAk(){
		System.out.println("할인액:"+(dan*rate));
	}
}//class end


public class Test10_downcasting {
  public static void main(String args[]){
	  PanMae3 p[]=new PanMae3[4];//배열생성
	  
	  p[0]=new PanMae3("사과",1,1500);//객체생성(heap에 메모리할당,생성자호출)
	  p[1]=new PanMaeSub3("감",1,1000,0.2);
	  p[2]=new PanMae3("딸기",1,7000);
	  p[3]=new PanMaeSub3("배",1,2000,0.3); 
	  
	  for(int i=0;i<p.length;i++){
		  p[i].disp();
		  //p[i].halInAk();
		  if(p[i] instanceof PanMaeSub3){//만약 p[i]가 PanMaeSub3속한다면 ->
			  ((PanMaeSub3)p[i]).halInAk();//  halInAk호출
		  }//if
	  }//for
		
	  Object ob=new String("홍길동");
	  System.out.println((String)ob);
  }//main end
}//class end
