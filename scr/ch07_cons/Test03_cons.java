package ch07_cons;
//������ OVerLoad 
public class Test03_cons {
	String name;
	int kor;
	//����Ʈ ������
	public Test03_cons(){
		System.out.println("����Ʈ ������");
	}//cons1
	//�����ִ� ������
	public Test03_cons(String name, int kor){
		System.out.println("String name, int kor ������");
		this.name=name;
		this.kor=kor;
	}//cons2
	//�����ִ� ������
	public Test03_cons(int kor, String name){
		System.out.println("int kor, String name ������");
		this.kor=kor; 
		this.name=name;
	}//cons3
	
	//��������� �޼���
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("��������:"+kor);
	}
	public static void main(String args[]){
		Test03_cons t1=new Test03_cons("������",100);//cons2
		Test03_cons t2=new Test03_cons(88,"��Ʋ��");//cons3
		
		t1.disp();
		t2.disp();
	}

		
}//class end
