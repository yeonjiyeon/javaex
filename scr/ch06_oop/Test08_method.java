package ch06_oop;
//���������� �޼��� �ۿ��� �����ϴ� ��
//���������� �ڵ����� �ʱ�ȭ�� �ȴ�

//���������� �޼��� �ȿ��� ������ ���� ���Ѵ� 
//���������� �ڵ����� �ʱ�ȭ�ȵȴ�

//�迭�� ���������� �ڵ����� �ʱ�ȭ�ȴ�. 
public class Test08_method {
  String name;//��������
  int age;
  double ki;
  //���� ���������� �����ϴ� �޼��� 
  public void setData(String name,int age, double ki){
	 this.name=name;//this.��������=�Ű�����  =>�ٸ� �޼ҵ忡���� Ȱ���� �� �ְ� �ϱ����� ���������� ���� �־���´�         this:�� Ŭ������ �ڱ��ڽ� 
	 this.age=age;
	 this.ki=ki;
  }//setData() end
  
  //�޼���, ����ϱ� ���� 
  public void disp(){
	  System.out.println("�̸�:"+name);
	  System.out.println("����:"+age);
	  System.out.println("Ű:"+ki);
  }//disp() end
  
  public static void main(String args[]){
	  Test08_method t=new Test08_method();//��ü ����
	  t.setData("ȫ�浿", 27, 177.7);
	  t.disp();
	  //
	  System.out.println();
	  t.setData("�����", 28, 184.7);
	  t.disp();
	  
  }//main end
}//class end
