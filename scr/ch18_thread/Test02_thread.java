package ch18_thread;
//우선순위사용해 보기
public class Test02_thread {
	public static void main(String args[]){
		MyThread my=new MyThread();
		YouThread you=new YouThread();
		
		//우선지정
		my.setPriority(1);//최하위
		you.setPriority(9); //최우선 메인이고 그 다음 우선
		
		my.start(); //메서드 호출
		you.start(); //메서드 호출
	}//main end
}//class end
//---------------------------
class MyThread extends Thread{
	//오버라이딩
	public void run(){
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
		}//for end
	}//run end
}//class end 

//------------------------------
class YouThread extends Thread{
	//오버라이딩
	public void run(){
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch);
		}//for end
	}//run end
}//class end 