package ch07_cons;
//������, this,this()
class PanMae{
	//����Ʈ ������
	public PanMae(){
		System.out.println("����Ʈ ������");
	}
	//1.�����ִ� ������
	public PanMae(String p){
		this(p,10);//�ڽ��� Ŭ���� ���� �μ�Ÿ���� �´� �����ڸ� ȣ��, ù�ٿ� ����
		System.out.println("ȫ�浿");
	}
	//2.�����ִ� ������
	public PanMae(String p, int s){
		//System.out.println("ȫ�浿");
		this(p,s,5000);//ù�ٿ� ����
	}
	//3.�����ִ� ������
	public PanMae(String p, int s, int d){
		System.out.println(p+" "+s+" "+d);
	}//class end
}
public class Test05_cons_this {
	public static void main(String args[]){
	 new PanMae("������");// 1�� ������ ȣ��
	 new PanMae("����",2);// 2�� ������ ȣ��
	 new PanMae("����",3,7000);// 3�� ������ ȣ��
 }//main end 
}//class end
