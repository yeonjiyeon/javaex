package ch07_cons;

public class Test04_cons_this {
	String title;
	int num;
	//
	//1.디폹트 생성자
	public Test04_cons_this(){}
	
	//2.인자있는 생성자
	public Test04_cons_this(String title, int num){
		this.title=title;
		this.num=num;
	
		System.out.println("String, int 생성자");
	}//cons2
	
	//3.인자있는 생성자
	public Test04_cons_this(String title){
		this(title,200);//생성자 호출
		System.out.println("String 생성자");
	}
	//사용자 정의 메서드
	public void disp(){
		System.out.println("title:"+title);
		System.out.println("num:"+num+'\n');
	}//disp()
	public static void main(String args[]){
		Test04_cons_this t1=new Test04_cons_this("연습1");//3번 생성자 호출
		t1.disp();
		
		Test04_cons_this t2=new Test04_cons_this("연습",300);//2번 생성자 호출
		t2.disp();
  }//main end
}//class end
