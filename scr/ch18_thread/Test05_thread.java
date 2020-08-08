package ch18_thread;
import java.util.*;
public class Test05_thread {
	public static void main(String args[]){
		House house=new House();//â��
		Producer p=new Producer(house);//����
		Consumer c=new Consumer(house);//�Һ�
		
		p.start();
		c.start();
	}//main end

}//class end
//--------------------
class House{
	Vector vec;//����,â��
	public House(){//������
		vec=new Vector();
	}
	//put()Vector�� �ֱ� �۾� 
	synchronized void put(char ch){
		while(vec.size()==3){
			try{
				wait();//����϶�
			}catch(InterruptedException ex){}
		}//while end
		//ó������
		vec.add(new Character(ch));//â�� ����ֱ�
		System.out.println("â�� ��ǰ"+ch+"������");
		System.out.println("������:"+vec.size());
		notifyAll();//�۾��� ����Ǿ����� ��ο��� �˸���
		
	}//put end
	
	//get():vector���� ������
	synchronized char get(){
		while(vec.size()==0){
			try{
				wait();//�۾��� �� �� ���� ���� ����϶�
			}catch(InterruptedException ex){}
		}//while end
		//ó������
		Character ch=(Character)vec.remove(0); //Vector���� ������, ����
		System.out.println("â���� ��ǰ"+ch+" �� ������ ");
		System.out.println("������:"+vec.size());
		notifyAll();
		//return ch.charValue();//Character�� char�� �ٲ۴�
		return ch;
		
	}//get end
}//class 
//------------------------------
//���� House�� put()ȣ��
class Producer extends Thread{
	//����
	private House house;
	
	//������
	public Producer(House house){
		this.house=house;
	}
	//�������̵�
	public void run(){
		for(char ch='A';ch<='J';ch++){
			System.out.println("�����ڰ� ��ǰ"+ch+"�� ������");
			house.put(ch);//�޼��� ȣ��
		}//for end
	}//run end
}//class end

//�Һ��ϴ� Ŭ���� �ۼ�, house () ȣ��
class Consumer extends Thread{
	private House house;//����
	
	//������
	public Consumer(House house){
		this.house=house;
	}
	//�������̵�
	public void run(){
		char ch;//����
		
		for(int i=1;i<=10;i++){
			ch=house.get();
			System.out.println("�Һ��ڰ� ��ǰ"+ch+"�� �Һ�����");
		}//for end
	}//run end
}//class end



