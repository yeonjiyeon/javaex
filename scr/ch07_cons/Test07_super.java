package ch07_cons;
//super: ���� Ŭ���� ��ü
//super():���� Ŭ���� ������ ȣ��
//����Ŭ����
class ConSuper{
	String title;//��������,�ʵ�
	int num;
	
	//����Ʈ ������
	public ConSuper(){}
	
	//�����ִ� ������
	public ConSuper(String title,int num){
		this.title=title;//�Ű��������� ���������� �Ҵ�
		this.num=num;
	}
		
	//��������� �޼���:���Ƿ� ���� �޼���
	public void disp(){
		System.out.println(title+" "+num);
	}
	}//super class end

//�Ļ�Ŭ����=���� Ŭ����
class ConSub extends ConSuper{
	//������
	public ConSub(){
		super("abc",123);//���� Ŭ���� ������ȣ��  display�� ������ ��ӹ޴´�
	}
}//sub class end

public class Test07_super {
  public static void main(String args[]){
	  //�Ļ�Ŭ���� ���
	  ConSub sub=new ConSub();//��ü ����
	  sub.disp();
	  
	  //Ŭ���� ���
	  ConSuper ss=new ConSuper("AAA",1000);
	  ss.disp();
  }//main end
}//class end
