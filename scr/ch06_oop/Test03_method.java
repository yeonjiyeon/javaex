package ch06_oop;
//�޼��� ����
//���ϰ� �����ֱ� 
public class Test03_method {
  public void aa(){
	  System.out.println("void aa()...");
  }//aa() end
  //
  public int bb(){
	  System.out.println("int bb()...");
	  return 100;
  }//bb() end
  
  public double cc(){
	  System.out.println("double cc()...ȣ��");
	  return 177.7;
  }//cc() end 
	
  public static void main(String args[]){
	  Test03_method t3=new Test03_method();//��ü(=�ν��Ͻ�)����
	  
	  t3.aa();
	  int b=t3.bb();
	  double d=t3.cc();
	  
	  System.out.println("b:"+b);
	  System.out.println("d:"+d);
  }//main end

}//class end
