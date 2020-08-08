package ch08_class;

class Person{
	protected String name;
	
	//디폴트 생성자
	public Person(){}
		//인자있는 생성자
	public Person(String name){
			this.name=name;
		}//cons end
		
		//사용자정의 메서드
	public void disp(){
			System.out.println("이름:"+name);
		}
}//class end
//
//파생클래스1
class PersonSub extends Person{
	private double right_eye;
	private double left_eye;
	
	//디폴트 생성자
	public PersonSub(){}
	
	//인자있는 생성자 
	public PersonSub(String name, double right_eye,double left_eye){
		super(name);//수퍼클래스생성자 호출
		this.right_eye=right_eye;
		this.left_eye=left_eye;
	}//cons end
	
	//오버라이딩: 상속받은 메서드 내용 재정의
	public void disp(){
		System.out.println();
		System.out.println("이름:"+name);
		System.out.println("오른쪽 시력:"+right_eye);
		System.out.println("왼쪽 시력:"+left_eye);
	}//disp() end
}//class end
//
//파생클래스2
class PersonSinsang extends Person{
	private String addr;
	private String tel;
	
	//디폴트 생성자
	public PersonSinsang(){}
	
	//인자 있는 생성자
	public PersonSinsang(String name,String addr,String tel){
		super(name);//수퍼클래스생성자 호출
		this.addr=addr;
		this.tel=tel;
	}//cons end
	
	//오버라이딩: 상속받은 메서드 내용 재정의
	public void disp(){
		System.out.println();
		System.out.println("이름:"+name);
		System.out.println("주소:"+addr);
		System.out.println("전화:"+tel);
	}
}//class end

//관련없는 클래스에서 객체생성할 수 있음
public class Test07_extends {
  public static void main(String args[]){
	  
	  //상위클래스변수로 하위객체처리
	  Person p=new PersonSub("홍길동",1.5,1.3);//upcasting
	  p.disp();
	  //
	  p=new PersonSinsang("이순신","서울 노량진","010-2233-5566");
	  p.disp();
	  
	  
  }//main end
}//class end
