package ch04_control;
import java.util.*;

public class Test06_switch {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���>>>");

		int month=sc.nextInt();//int �� �Է�
		int days=0;

		if(month>=1 && month<=12){
			switch(month){
			case 1: case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 2:
				days=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
			}//switch end

			System.out.println(month+"����(��)"+days+"���� �ִ� ���Դϴ�");
		}else{
			System.out.println("�Է¿���.....1~12������ �Է��Ͻÿ�");
		}//if end
	}//main end

}//class end
