package ch04_while;
//break��: �ݺ��� ���� Ż��
public class Test04_break {
	public static void main(String args[]){
		//for
		for(int a=1; a<=10000; a++){
			System.out.println(a+"������");
			if(a==10) break;
		}//for
		System.out.println();
		
		//while
		int a=1; 
		while(a<=10000){
			System.out.println(a+"����~");
			if(a==10) break;//while ��Ż��
			a++;
		}//while end
		
		
		
		
	}//main end

}//class end
