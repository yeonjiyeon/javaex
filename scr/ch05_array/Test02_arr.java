package ch05_array;
//���������� �ڵ����� �ʱ�ȭ�� �ȴ�
//���������� �ڵ����� �ʱ�ȭ �ȵȴ�->�ݵ�� �ʱ�ȭ�����־�� �Ѵ�
//�迭�� ���������� �ڵ����� �ʱ�ȭ�ȴ�

public class Test02_arr {
	//������������(�޼ҵ�ۿ��� ����)
	static int max;//0���� �ʱ�ȭ�ȴ�
	public static void main(String args[]){
		//������������(�޼ҵ�ȿ��� ����)
		int max2;
		System.out.println("�������� max:"+max);
		//System.out.println("�������� max2:"+max2);//���������� �ڵ����� �ʱ�ȭ �ȵȴ�->�ݵ�� �ʱ�ȭ�����־�� �Ѵ�
		
		//�迭����
		int a[]=new int[3];//�迭����
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
	}//main end

}//class end
