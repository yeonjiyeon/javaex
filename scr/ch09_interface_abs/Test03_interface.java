package ch09_interface_abs;
//�������̽��� ���߻�ӵȴ�
interface AA3{
	int aa();
}//interface end

interface BB3{
	char bb();
}//interface end

interface CC3{
	String cc();
}//interface end 

class DD3 implements AA3,BB3,CC3{

	@Override
	public String cc() {
		return "��Ʋ��";
	}

	
	public char bb() {
		return 'A';
	}

	
	public int aa() {
		return 100;
	}
	
}//class end

public class Test03_interface {
  public static void main(String args[]){
	  DD3 d=new DD3();//��ü ����
	  String name=d.cc();
	  char ch=d.bb();
	  int a=d.aa();
	  
	  System.out.println("name:"+name);
	  System.out.println("ch:"+ch);
	  System.out.println("a:"+a);
  }//main end
}//class end
