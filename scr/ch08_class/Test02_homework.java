package ch08_class;

public class Test02_homework {
	public static void main(String args[]){
	//����:args[0]�� �ֹι�ȣ�� �Է��Ͽ� 
	//�������� �������� �����Ͽ� ����Ͻÿ�	
		//000000-1~
		//000000-2~
		//000000-3~
		//000000-4~
		String jumin=args[0];
		//System.out.println(ju);
		//1. ���
		String j=jumin.substring(7,8);
		if(j.equals("1")||j.equals("3")){
			System.out.println(jumin+"�� ����");
		}else if(j.equals("2")||j.equals("4")){
			System.out.println(jumin+"�� ����");
		}//else if
		//System.out.println("j:"+j);
		
		//2.���
		int i=Integer.parseInt(j);//���ڿ��� ������ ��ȯ		
		if(i==1 || i==3){
			System.out.println(jumin+"�� ����");
		}else if(i==2 || i==4){
			System.out.println(jumin+"�� ����");
		}//else if...

		//3.���
		switch(i){
		case 1:
		case 3:
			System.out.println(jumin+"�� ����");
			break;
		case 2:
		case 4:
			System.out.println(jumin+"�� ����");
		}//switch end
		
		//4.���
		char ch=jumin.charAt(7);
		//System.out.println("ch:"+ch);
		if(ch=='1'||ch=='3'){
			System.out.println(jumin+"�� ����");
		}else if(ch=='2'||ch=='4'){
			System.out.println(jumin+"�� ����");
		}//else if
		
		//5.���
		switch(ch){
		case '1':
		case '3':
			System.out.println(jumin+"�� ����");
			break;
		case '2':
		case '4':
			System.out.println(jumin+"�� ����");			
		}//switch end
		
		
		
		
	}//main end

}//class end
