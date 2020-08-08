package ch16_util;
//��ü ����
public class Test15_Clone implements Cloneable{
	//����
	String myName;
	//������
	public Test15_Clone(String myName){
		this.myName=myName;
	}//cons end
	//�޼���,�������̵�
	public String toString(){
		return myName+"�Դϴ�";
	}
	
	public static void main(String args[]) throws Exception{
		Test15_Clone ob1=new Test15_Clone("ù��°");//��ü����,������ȣ��
		System.out.println("ob1 :"+ob1);
		System.out.println("ob1.toString() :"+ob1.toString());
		//
		Double D=new Double(22.2);//��ü ����
		System.out.println("D:"+D);
		System.out.println("D.toString():"+D.toString());
		//��ü ���� 
		Test15_Clone ob2=(Test15_Clone)ob1.clone();
		System.out.println("ob2 :"+ob2);
		System.out.println("ob2.toString() :"+ob2.toString());
		
		System.out.println(ob1.equals(ob2));//false
		System.out.println(ob1==ob2);
		
		System.out.println(ob1.toString().equals(ob2.toString()));
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}//main end
}//class end
