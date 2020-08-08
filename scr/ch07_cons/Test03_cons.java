package ch07_cons;
//생성자 OVerLoad 
public class Test03_cons {
	String name;
	int kor;
	//디폴트 생성자
	public Test03_cons(){
		System.out.println("디폴트 생성자");
	}//cons1
	//인자있는 생성자
	public Test03_cons(String name, int kor){
		System.out.println("String name, int kor 생성자");
		this.name=name;
		this.kor=kor;
	}//cons2
	//인자있는 생성자
	public Test03_cons(int kor, String name){
		System.out.println("int kor, String name 생성자");
		this.kor=kor; 
		this.name=name;
	}//cons3
	
	//사용자정의 메서드
	public void disp(){
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+kor);
	}
	public static void main(String args[]){
		Test03_cons t1=new Test03_cons("윌리엄",100);//cons2
		Test03_cons t2=new Test03_cons(88,"벤틀리");//cons3
		
		t1.disp();
		t2.disp();
	}

		
}//class end
