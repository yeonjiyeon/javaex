package ch08_class;

class GeneralSuper02{
	protected int roomNo;//전역변수 , 방번호
	protected int capacity;//전역변수, 정원 
}//class end
//------------------------------------------------------
//파생클래스
class GeneralSub02 extends GeneralSuper02{
	String owner;//집주인
	//사용자가 만든 메서드
	public void disp(){
		System.out.println("방번호:"+roomNo);//전역변수는 자동초기하된다
		System.out.println("정원:"+capacity);
		System.out.println("집주인:"+owner);
		System.out.println();
	}//disp()end
}//class end

public class Test05_extends {
	public static void main(String args[]){
		GeneralSub02 sub=new GeneralSub02();//객체생성,생성자호출
		sub.disp();
		
		sub.roomNo=5;
		sub.capacity=100;
		sub.owner="이효리";
		
		sub.disp();
		
	}//main end

}//class end
