package ch04_while;
//continue�� : �ٽ� �ݺ��Ϸ� ����
//continue��: �ݺ����� ���� �����Ͱ� ����
public class Test05_continue {
	public static void main(String args[]){
		//for
		for(int i=1;i<=10;i++){
			if(i%2 !=0) continue;
			System.out.print(i+" ");//¦���� ���
		}//for
		
		//------------------------------
		try{
			//ó����;
		}catch(Exception ex){                //�������
			//���� �޽��� ���
			//continue
		}
	  //----------------------------------------------------	
		System.out.println();
		
		
		int a=0;
		while(a<10){
			a++;
			if(a%2==0) continue;
			System.out.print(a+" ");
			
		}//while end
	}//main end
}//class end
