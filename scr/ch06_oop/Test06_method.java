package ch06_oop;
//�Ű�����, ���ϰ� ����
public class Test06_method {
	
  public int sum(int start, int end){
	  //start���� end���� �ձ��ϱ�
	  int s=0;//���� ������ ����
	  for(int i=start;i<=end;i++){//�Ű�����,���ڰ�,�μ���
		  s+=i;//s=s+i
	  }//for end
	  
	  return s;
  }//sum() end
	
	//main()�޼���� JVM���� ���� ���� ȣ���Ѵ�
	public static void main(String args[]){
		Test06_method t=new Test06_method();//��ü ����
		int s1=t.sum(1, 10);
		System.out.println("s1:"+s1);
		
		int s2=t.sum(1, 100);
		System.out.println("s2:"+s2);
		//�޼��� ȣ�� 10,20 ���� �����ؼ� return���� ����Ͻÿ�
		
		int s3=t.sum(10, 20);
		System.out.println("s3:"+s3);
	}//main end
}//class end
