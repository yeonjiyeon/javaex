package ch07_cons;
/*
�����ڸ� ���������� ����Ʈ�����ڰ� �ڵ����� ���������

�����ִ� �����ڸ� ������ ����Ʈ�����ڴ� ����������ʴ´�.
*/

public class Test02_cons {	
	String id;
	String name;
	
	//����Ʈ ������
	public Test02_cons(){
		System.out.println("����Ʈ ������");
	}
	//�����ִ� ������
	public Test02_cons(String id, String name){
		System.out.println("�����ִ� ������");
		this.id=id;
		this.name=name;
	}//cons2------------
	
	//��������� �޼��� 
	public void disp(){
		System.out.println("id:"+id);
		System.out.println("�̸�:"+name);
	}//disp() end-----
	public static void main(String args[]){
		new Test02_cons();//��ü������, ������ ȣ��ȴ�.
		Test02_cons tt=new Test02_cons("park","�ڰǿ�");
		tt.disp();
	}//main end
}//class end
