package ch04_control;
import java.util.*;
public class Test07_switch {
	public static void main(String args[]){
		//������ ���� �Է��Ͽ�, �״��� ���� ���ϱ� 
		
		Scanner sc=new Scanner(System.in);//��ü ����
		System.out.print("�⵵�Է�>>>");
		int year=sc.nextInt();
		
		System.out.println("���� �Է�>>>");
		int month=sc.nextInt();
		
		int days=0;//�����ʱ�ȭ
		
		switch(month){
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days=31;
			break;
		case 2:
			if((year%4==0) && (year%100!=0) || (year%400==0)){
				days=29;//����
			}else{
				days=28;;//���
			}//else end
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		}//switch end
		System.out.println(year+"��"+month+"����"+days+"�� ���� �ֽ��ϴ�");
	}//main end

}//class end
