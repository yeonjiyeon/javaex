package ch08_class;

class GeneralSuper02{
	protected int roomNo;//�������� , ���ȣ
	protected int capacity;//��������, ���� 
}//class end
//------------------------------------------------------
//�Ļ�Ŭ����
class GeneralSub02 extends GeneralSuper02{
	String owner;//������
	//����ڰ� ���� �޼���
	public void disp(){
		System.out.println("���ȣ:"+roomNo);//���������� �ڵ��ʱ��ϵȴ�
		System.out.println("����:"+capacity);
		System.out.println("������:"+owner);
		System.out.println();
	}//disp()end
}//class end

public class Test05_extends {
	public static void main(String args[]){
		GeneralSub02 sub=new GeneralSub02();//��ü����,������ȣ��
		sub.disp();
		
		sub.roomNo=5;
		sub.capacity=100;
		sub.owner="��ȿ��";
		
		sub.disp();
		
	}//main end

}//class end
