package ch06_oop;
//static�޼���� static����� �����޼��常 ��밡���ϴ� 
//static�޼���� ��ü���� ���� ȣ�Ⱑ���ϴ�
//��:Ŭ�����̸�.�޼���()
//��:Math.ceil(3.2);

//static ������ ��� ��ü�� �����Ѵ� 
//static ������ �ùٸ��� ����� ���� 
public class Test11_method_static {
	String name;//��������
	int nai;
	static int sungin=18;
	
	//���� �����ϴ� �޼��� 
	public void setData(String name,int nai){
		this.name=name;
		this.nai=nai;
	}//setData() end 
	
	//����ϴ� �޼���
	public void disp(){
		String in="";//��������
		if(nai<sungin){
			in="�̼�����";
		}else{
			in="����";
		}//else...
		System.out.println(name+"���� ���̴�"+nai+"���̰�"+in+"�Դϴ�");
	}//disp() end
  public static void main(String args[]){
	  Test11_method_static kim=new Test11_method_static();//��ü ����
	  Test11_method_static lee=new Test11_method_static();//��ü ����
	  Test11_method_static park=new Test11_method_static();//��ü ����
	  
	  kim.setData("�迬��", 27);
	  kim.disp();
	  
	  lee.setData("�̼���", 41);
	  lee.disp();
	  
	  park.setData("�ڰǿ�", 3);
	  park.disp();
	  

	  /*
	   * kim.disp(); 
	     lee.disp();
	     park.disp(); -> �ѹ��� �ᵵ �������
	  */
	     
  }//main end
}//class end
