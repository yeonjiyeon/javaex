package ch18_thread;
class Go extends Thread{
	public void run(){
		int i=1;
		while(i<=30){
			System.out.print("Go ");
			i++;
		}//while end
	}//run end
}//class end

//----------------------------------------------------
class Come extends Thread{
	public void run(){//�������̵�
		int i=1;
		while(i<=30){
			System.out.print("Come ");
			i++;
		}//while
	}//run
}//class 


public class Test01_thread {
	public static void main(String args[]){
		Go go=new Go();
		Come come=new Come(); 
		
		go.start();//run() methodȣ��
		
		come.start();//run() methodȣ��
	}//main end
}//class end
