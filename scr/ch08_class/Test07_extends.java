package ch08_class;

class Person{
	protected String name;
	
	//����Ʈ ������
	public Person(){}
		//�����ִ� ������
	public Person(String name){
			this.name=name;
		}//cons end
		
		//��������� �޼���
	public void disp(){
			System.out.println("�̸�:"+name);
		}
}//class end
//
//�Ļ�Ŭ����1
class PersonSub extends Person{
	private double right_eye;
	private double left_eye;
	
	//����Ʈ ������
	public PersonSub(){}
	
	//�����ִ� ������ 
	public PersonSub(String name, double right_eye,double left_eye){
		super(name);//����Ŭ���������� ȣ��
		this.right_eye=right_eye;
		this.left_eye=left_eye;
	}//cons end
	
	//�������̵�: ��ӹ��� �޼��� ���� ������
	public void disp(){
		System.out.println();
		System.out.println("�̸�:"+name);
		System.out.println("������ �÷�:"+right_eye);
		System.out.println("���� �÷�:"+left_eye);
	}//disp() end
}//class end
//
//�Ļ�Ŭ����2
class PersonSinsang extends Person{
	private String addr;
	private String tel;
	
	//����Ʈ ������
	public PersonSinsang(){}
	
	//���� �ִ� ������
	public PersonSinsang(String name,String addr,String tel){
		super(name);//����Ŭ���������� ȣ��
		this.addr=addr;
		this.tel=tel;
	}//cons end
	
	//�������̵�: ��ӹ��� �޼��� ���� ������
	public void disp(){
		System.out.println();
		System.out.println("�̸�:"+name);
		System.out.println("�ּ�:"+addr);
		System.out.println("��ȭ:"+tel);
	}
}//class end

//���þ��� Ŭ�������� ��ü������ �� ����
public class Test07_extends {
  public static void main(String args[]){
	  
	  //����Ŭ���������� ������üó��
	  Person p=new PersonSub("ȫ�浿",1.5,1.3);//upcasting
	  p.disp();
	  //
	  p=new PersonSinsang("�̼���","���� �뷮��","010-2233-5566");
	  p.disp();
	  
	  
  }//main end
}//class end
