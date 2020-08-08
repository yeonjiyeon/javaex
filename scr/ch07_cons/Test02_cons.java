package ch07_cons;
/*
생성자를 넣지않으면 디폴트생성자가 자동으로 만들어진다

인자있는 생성자를 넣으면 디폴트생성자는 만들어지지않는다.
*/

public class Test02_cons {	
	String id;
	String name;
	
	//디폴트 생성자
	public Test02_cons(){
		System.out.println("디폴트 생성자");
	}
	//인자있는 생성자
	public Test02_cons(String id, String name){
		System.out.println("인자있는 생성자");
		this.id=id;
		this.name=name;
	}//cons2------------
	
	//사용자정의 메서드 
	public void disp(){
		System.out.println("id:"+id);
		System.out.println("이름:"+name);
	}//disp() end-----
	public static void main(String args[]){
		new Test02_cons();//객체생성시, 생성자 호출된다.
		Test02_cons tt=new Test02_cons("park","박건우");
		tt.disp();
	}//main end
}//class end
