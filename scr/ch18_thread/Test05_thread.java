package ch18_thread;
import java.util.*;
public class Test05_thread {
	public static void main(String args[]){
		House house=new House();//창고
		Producer p=new Producer(house);//생산
		Consumer c=new Consumer(house);//소비
		
		p.start();
		c.start();
	}//main end

}//class end
//--------------------
class House{
	Vector vec;//변수,창고
	public House(){//생성자
		vec=new Vector();
	}
	//put()Vector에 넣기 작업 
	synchronized void put(char ch){
		while(vec.size()==3){
			try{
				wait();//대기하라
			}catch(InterruptedException ex){}
		}//while end
		//처리내용
		vec.add(new Character(ch));//창고에 집어넣기
		System.out.println("창고에 제품"+ch+"들어왔음");
		System.out.println("재고수량:"+vec.size());
		notifyAll();//작업이 종료되었음을 모두에게 알린다
		
	}//put end
	
	//get():vector에서 꺼내기
	synchronized char get(){
		while(vec.size()==0){
			try{
				wait();//작업을 할 수 없는 동안 대기하라
			}catch(InterruptedException ex){}
		}//while end
		//처리내용
		Character ch=(Character)vec.remove(0); //Vector에서 꺼내고, 제거
		System.out.println("창고에서 제품"+ch+" 가 나갔음 ");
		System.out.println("재고수량:"+vec.size());
		notifyAll();
		//return ch.charValue();//Character를 char로 바꾼다
		return ch;
		
	}//get end
}//class 
//------------------------------
//생산 House의 put()호출
class Producer extends Thread{
	//변수
	private House house;
	
	//생성자
	public Producer(House house){
		this.house=house;
	}
	//오버라이딩
	public void run(){
		for(char ch='A';ch<='J';ch++){
			System.out.println("생산자가 제품"+ch+"를 생산함");
			house.put(ch);//메서드 호출
		}//for end
	}//run end
}//class end

//소비하는 클래스 작성, house () 호출
class Consumer extends Thread{
	private House house;//변수
	
	//생성자
	public Consumer(House house){
		this.house=house;
	}
	//오버라이딩
	public void run(){
		char ch;//변수
		
		for(int i=1;i<=10;i++){
			ch=house.get();
			System.out.println("소비자가 제품"+ch+"를 소비했음");
		}//for end
	}//run end
}//class end



