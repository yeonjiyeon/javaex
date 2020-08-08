package ch07_cons;
//생성자, this,this()
class PanMae{
	//디폴트 생성자
	public PanMae(){
		System.out.println("디폴트 생성자");
	}
	//1.인자있는 생성자
	public PanMae(String p){
		this(p,10);//자신의 클래스 안의 인수타입이 맞는 생성자를 호출, 첫줄에 기재
		System.out.println("홍길동");
	}
	//2.인자있는 생성자
	public PanMae(String p, int s){
		//System.out.println("홍길동");
		this(p,s,5000);//첫줄에 기재
	}
	//3.인자있는 생성자
	public PanMae(String p, int s, int d){
		System.out.println(p+" "+s+" "+d);
	}//class end
}
public class Test05_cons_this {
	public static void main(String args[]){
	 new PanMae("복숭아");// 1번 생성자 호출
	 new PanMae("수박",2);// 2번 생성자 호출
	 new PanMae("딸기",3,7000);// 3번 생성자 호출
 }//main end 
}//class end
