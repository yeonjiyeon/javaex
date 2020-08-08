package ch18_thread;

public class Test03_thread_Sleep {
	public static void main(String args[]){
		MyThread2 my=new MyThread2();
		my.start();//run()메서드 호출
	}//main end
}//class end
//------------------------------
class MyThread2 extends Thread{
	int i=0;//변수
	//오버라이딩
	public void run(){
		try{
			while(i<5){
				i++;
				Thread.sleep(2000); //2초동안 대기
				System.out.println("안녕!!!");
			}//while
		}catch(InterruptedException ex){
			System.out.println(ex);
		}//catch end
	}//run end
}//class end