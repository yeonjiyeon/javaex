package ch16_util;
//StingBuffer�� String�ӵ����� �˾ƺ���

public class Test07_SB_String {
	public static void main(String args[]){
		long start, end;//�ð��� ���� ����
		start=System.currentTimeMillis();//���� �ý��� �ð����� �и���(1/1000)
		String str="";
		for(int i=1;i<10000;i++){
			str+=i;
			str+="+";
		}//for end
		end=System.currentTimeMillis();
		System.out.println("String ���� �ð� :"+(end-start));
		//----------------------------------------------------
		//StringBuffer
		start=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<100000;i++){
			sb.append(i);
			sb.append("+");
		}//for end	
		end=System.currentTimeMillis();
		System.out.println("StringBuffer ���� �ð� :"+(end-start));
		
	}//main end
}//class end
