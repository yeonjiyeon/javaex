package ch05_array;

public class Test13_math {
public static void main(String args[]){
	double d=3.1;
	System.out.println(Math.ceil(d));//�ø���
	
	d=5.7;
	System.out.println(Math.floor(d));//������
	
	System.out.println(Math.round(d));//������
	
	d=5.4;
	System.out.println(Math.round(d));
	
	d=5.5;
	System.out.println(Math.round(d));
	
	System.out.println(Math.PI);
	
	//�Խ����� �����������
	//�۰��� 37��, ���������� 10���� ����Ͻÿ� 
	int pageCount=(int)(Math.ceil((double)37/10));
	System.out.println("pageCount :"+pageCount);
}
}//class end
