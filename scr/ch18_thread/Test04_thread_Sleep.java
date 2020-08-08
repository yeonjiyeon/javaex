package ch18_thread;

public class Test04_thread_Sleep {
	public static void main(String args[]){
		MyThread3 A=new MyThread3("AAA",1000);
		MyThread3 B=new MyThread3("BBB",2000);
		MyThread3 C=new MyThread3("CCC",3000);
		A.start();
		B.start();
		C.start();
	}//main end	
}//class end
//-----------------------------------------
class MyThread3 extends Thread{
	String msg;
	long msec;//�и���
	//������
	public MyThread3(String msg,long msec){
		this.msg=msg;
		this.msec=msec;
	}
	
	//�������̵�
	public void run(){
		try{
			while(true){
				Thread.sleep(msec);//msec���� ���
				System.out.println(msg);
			}//while end
		}catch(InterruptedException ex){
			System.out.println(ex);
		}
	}
}//class end