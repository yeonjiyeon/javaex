package ch08_class;
class Sung{
  private String name;//은폐필드, 전역변수
  private int kor;
  private int eng;
  
  //디폴트 생성자
  public Sung(){}
  
  //인자 있는 생성자
  public Sung(String name,int kor,int eng){
	  this.name=name;
	  this.kor=kor;
	  this.eng=eng;	  
  }//cons end
  
  //사용자 정의 메서드
  public void disp(){
	  System.out.println(name+" "+kor+" "+eng);
  }
}//class sung end------------------------------------

public class Test03_Object_arr {
	public static void main(String args[]){
		//객체 사용
		Sung kim=new Sung("kim",88,99);
		Sung lee=new Sung("lee",89,77);
		Sung park=new Sung("park",100,99);
		kim.disp();
		lee.disp();
		park.disp();
		System.out.println();
		//---------------------------------------
		//객체 배열
		//int a[]=new int[3];
		//a[0]=10;
		Sung s[]=new Sung[3];//배열 생성
		s[0]=new Sung("aaa",55,66);//객체 생성
		s[1]=new Sung("bbb",77,88);
		s[2]=new Sung("ccc",99,88);
		//for문으로 출력하시오. 
		
		for (int i=0;i<s.length;i++){
			s[i].disp();
		}//for end
		System.out.println();
		//-------------------------------------
		//int a[]=[10,20,30];
		Sung n[]={
				new Sung("김김",88,77),
				new Sung("이이",99,66),
				new Sung("박박",100,88)
		};
		
		for (int i=0;i<n.length;i++){
			n[i].disp();
		}
	}//main end

}//class end
