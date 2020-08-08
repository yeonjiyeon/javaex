package ch16_util;
//StingBuffer와 String속도차이 알아보기

public class Test07_SB_String {
	public static void main(String args[]){
		long start, end;//시간을 넣을 변수
		start=System.currentTimeMillis();//현재 시스템 시간구함 밀리초(1/1000)
		String str="";
		for(int i=1;i<10000;i++){
			str+=i;
			str+="+";
		}//for end
		end=System.currentTimeMillis();
		System.out.println("String 연산 시간 :"+(end-start));
		//----------------------------------------------------
		//StringBuffer
		start=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<100000;i++){
			sb.append(i);
			sb.append("+");
		}//for end	
		end=System.currentTimeMillis();
		System.out.println("StringBuffer 연산 시간 :"+(end-start));
		
	}//main end
}//class end
