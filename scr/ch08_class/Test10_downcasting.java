package ch08_class;
//Ŭ����
class PanMae3{
	//����
	protected String pum;//ǰ��
	protected int su;//����
	protected int dan;//�ܰ�	

	//����Ʈ ������
	public PanMae3(){}
	
	//�����ִ� ������
	public PanMae3(String pum,int su,int dan){
		this.pum=pum;//�μ����� ���������� �Ҵ�
		this.su=su;
		this.dan=dan;
	}//cons end
	
	
	//����� ���� �޼ҵ�
	public void disp(){
		System.out.println();
		System.out.println("pum:"+pum);
		System.out.println("su:"+su);
		System.out.println("dan:"+dan);
	}
}//class end---------------------------------------

//�Ļ�Ŭ����
class PanMaeSub3 extends PanMae3{
	private double rate;//������
	
	//����Ʈ ������
	public PanMaeSub3(){}
	
	//�����ִ� ������
	public PanMaeSub3(String pum,int su, int dan, double rate){
		super(pum,su,dan);//����Ŭ����Ȧ��
		this.rate=rate;
	}
	//�������̵�:��ӹ��� �޼��� ���� ������ 
	public void disp(){
		System.out.println();//line skip
		System.out.println("ǰ��:"+pum);
		System.out.println("����:"+su);
		System.out.println("�ܰ�:"+dan);	
	}
	//����� ���� �޼���
	public void halInAk(){
		System.out.println("���ξ�:"+(dan*rate));
	}
}//class end


public class Test10_downcasting {
  public static void main(String args[]){
	  PanMae3 p[]=new PanMae3[4];//�迭����
	  
	  p[0]=new PanMae3("���",1,1500);//��ü����(heap�� �޸��Ҵ�,������ȣ��)
	  p[1]=new PanMaeSub3("��",1,1000,0.2);
	  p[2]=new PanMae3("����",1,7000);
	  p[3]=new PanMaeSub3("��",1,2000,0.3); 
	  
	  for(int i=0;i<p.length;i++){
		  p[i].disp();
		  //p[i].halInAk();
		  if(p[i] instanceof PanMaeSub3){//���� p[i]�� PanMaeSub3���Ѵٸ� ->
			  ((PanMaeSub3)p[i]).halInAk();//  halInAkȣ��
		  }//if
	  }//for
		
	  Object ob=new String("ȫ�浿");
	  System.out.println((String)ob);
  }//main end
}//class end
