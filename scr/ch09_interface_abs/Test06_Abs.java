package ch09_interface_abs;
//�߻�Ŭ������ �����ִ� �޼���� �߻�޼��尡 ȥ�յ� ����̴� 

abstract class Abs{
	String name;//���� ����
	//������
	public Abs(String name){
		this.name=name;
	}
	//�Ϲݸ޼���
	public void kk(){
		System.out.println("�߻�Ŭ�����ȿ� �ִ� �Ϲ� �޼���");
	}
	
	//�߻�޼���
	abstract void disp();
	
}//abstract class end

public class Test06_Abs extends Abs {
	
	//������
	public Test06_Abs(String name){
		super(name);//���� Ŭ���������� ȣ��
		
	}
	
	//�������̵�
	public void disp(){
		System.out.println("�߻�޼��� �������̵�");
		System.out.println("name:"+name);
	}
  public static void main(String args[]){
	  Abs abs=new Test06_Abs("������");
	  
	  abs.kk();
	  abs.disp();
  }//main end
}//class end
