package ch06_oop;
//static ������ ��� ��ü�� �����Ѵ�
//static ������ �߸������ ��
public class Test12_method_static {
	String pum;//ǰ��
	  int su;//����
	  static int don;//�ܰ�
	  
	  //������ �޼ҵ�
	  public void setData(String p,int s,int d){
		  pum=p;
		  su=s;
		  don=d;
	  }//setData() end
	  
	  //����ϴ� �޼���
	  public void disp(){
		  System.out.println("ǰ��:"+pum);
		  System.out.println("����:"+su);
		  System.out.println("�ܰ�:"+don+'\n');
	  }//disp() end
	  
  public static void main(String args[]){
	  Test12_method_static apple=new Test12_method_static();//��ü����
	  Test12_method_static banana=new Test12_method_static();//��ü����
	  Test12_method_static orange=new Test12_method_static();//��ü����
	  apple.setData("���",5,800);
	  banana.setData("�ٳ���", 1, 3500);
	  orange.setData("������", 1, 500);
	  apple.disp();
	  banana.disp();
	  orange.disp();
  }//main end 
}//class end
