package ch06_oop;

public class Test09_method {
	String pum;//ǰ�� ��������
	int su;//����
	int dan;//�ܰ�
	
	//���������� ���� �����ϴ� �޼���
	public void setDate(String pum,int su,int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//setDate() end
	
	//���� ����ϴ� �޼���
	public void disp(){
		System.out.println("ǰ��:"+pum);
		System.out.println("����:"+su);
		System.out.println("�ܰ�:"+dan);
		System.out.println("�ݾ�:"+(su*dan)+'\n');
		
	}//disp() end
  public static void main(String args[]){
	  Test09_method t=new Test09_method();//��ü ����
	  t.setDate("���ô԰����",17,5500);
	  t.disp();
	  
	  t.setDate("���� �Ĵ��",2,4500);
	  t.disp();
  }//main end
}//class end
