package ch06_oop;

//�Ű�����,���ϰ� ����
public class Test05_method {
	public int sum(int a, int b){
		int s=a+b;
		return s;
		
	}//sum() end
	
	public double sum(double a,double b){
		double s=a+b;
		return s;
	}//sum() end
	
	public float sum(float a,float b){
		System.out.println("sum(float a,float b)");//�Ű�����
		float s=a+b;
		return s;
	}//sum() end
	
	
	//main()������ JVM�� ���ؼ� ȣ��Ǿ�����
	public static void main(String args[]){
		Test05_method t=new Test05_method();//��ü����
		
		float f=t.sum(1.2f, 2.3f);
		System.out.println("f:"+f);
		
		double d=t.sum(2.2d, 3.3d); 
		System.out.println("d:"+d);
		
		int a=t.sum(1, 2);
		System.out.println("a:"+a);
	}//main end

}//class end
