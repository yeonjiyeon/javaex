package ch08_class;

class PanMae{
	//��ȣ �ʵ�=���� ����
	protected String pum;//ǰ��
	protected int su;//����
	protected int dan;//�ܰ�
	
	//����Ʈ ������
	public PanMae(){}
	
	//�����ִ� ������
	public PanMae(String pum,int su,int dan){
		this.pum=pum;
		this.su=su;
		this.dan=dan;
	}//cons end
	
	//��������� �޼���
	public void disp(){
		System.out.println(pum+" "+su+" "+dan);
	}//disp() end
}//class end
//-------------------------------------------
//�Ļ�Ŭ����
//--------------------------------------------
class PanMaeSub extends PanMae{
	private double rate;//������
	
	//����Ʈ ������
	public PanMaeSub(){}
	
	//�����ִ� ������ 
	public PanMaeSub(String pum,int su,int dan, double rate){
		super(pum,su,dan);//����Ŭ���� ������ ȣ��
		this.rate=rate;
	}//cons end
	
	//����� ���� �޼���
	//�������̵�: ��� ���� �ޚ� ����������
	public void disp(){
		System.out.println();
		System.out.println("ǰ��:"+pum);
		System.out.println("����:"+su);
		System.out.println("�ܰ�:"+dan);
		System.out.println("������:"+rate);
	}//disp() end
}//class end
public class Test06_extends {
  public static void main(String args[]){
	  PanMae p=new PanMae("���",1,5000);
	  p.disp();
	  PanMaeSub sub=new PanMaeSub("������",1,4500,0.2);
	  sub.disp();
	  //
	  //����Ŭ���������� ������ü ó���ϱ�
	  p=new PanMaeSub("�������",1,7000,0.1);
	  double d=12;//�ڵ����� ����ȯ�ȴ�
	  p.disp();
	  //
  }//main end
}//class end
