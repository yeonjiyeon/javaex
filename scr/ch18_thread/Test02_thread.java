package ch18_thread;
//�켱��������� ����
public class Test02_thread {
	public static void main(String args[]){
		MyThread my=new MyThread();
		YouThread you=new YouThread();
		
		//�켱����
		my.setPriority(1);//������
		you.setPriority(9); //�ֿ켱 �����̰� �� ���� �켱
		
		my.start(); //�޼��� ȣ��
		you.start(); //�޼��� ȣ��
	}//main end
}//class end
//---------------------------
class MyThread extends Thread{
	//�������̵�
	public void run(){
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
		}//for end
	}//run end
}//class end 

//------------------------------
class YouThread extends Thread{
	//�������̵�
	public void run(){
		for(char ch='a';ch<='z';ch++){
			System.out.print(ch);
		}//for end
	}//run end
}//class end 