package ch07_cons;

public class Test04_cons_this {
	String title;
	int num;
	//
	//1.��bƮ ������
	public Test04_cons_this(){}
	
	//2.�����ִ� ������
	public Test04_cons_this(String title, int num){
		this.title=title;
		this.num=num;
	
		System.out.println("String, int ������");
	}//cons2
	
	//3.�����ִ� ������
	public Test04_cons_this(String title){
		this(title,200);//������ ȣ��
		System.out.println("String ������");
	}
	//����� ���� �޼���
	public void disp(){
		System.out.println("title:"+title);
		System.out.println("num:"+num+'\n');
	}//disp()
	public static void main(String args[]){
		Test04_cons_this t1=new Test04_cons_this("����1");//3�� ������ ȣ��
		t1.disp();
		
		Test04_cons_this t2=new Test04_cons_this("����",300);//2�� ������ ȣ��
		t2.disp();
  }//main end
}//class end
