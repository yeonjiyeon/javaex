package ch04_control;

public class Test03_switch {
	public static void main(String args[]){
		int su=88;
		
		//� ���� ¦������ Ȧ���� �����Ͻÿ�. 
		switch(su%2){
		case 0:
			System.out.println(su+"�� ¦��");
			break;
		case 1: 
			System.out.println(su+"�� Ȧ��");
		}//switch end
	}//main end

}//class end
