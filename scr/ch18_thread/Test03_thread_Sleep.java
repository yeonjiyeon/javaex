package ch18_thread;

public class Test03_thread_Sleep {
	public static void main(String args[]){
		MyThread2 my=new MyThread2();
		my.start();//run()�޼��� ȣ��
	}//main end
}//class end
//------------------------------
class MyThread2 extends Thread{
	int i=0;//����
	//�������̵�
	public void run(){
		try{
			while(i<5){
				i++;
				Thread.sleep(2000); //2�ʵ��� ���
				System.out.println("�ȳ�!!!");
			}//while
		}catch(InterruptedException ex){
			System.out.println(ex);
		}//catch end
	}//run end
}//class end