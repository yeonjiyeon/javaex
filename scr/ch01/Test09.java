package ch01;

//����ȣ�� : �ڽ��� �Լ��� ȣ���ϴ� ��(���� �ݺ��Ѵ�)
public class Test09{
    public void aa(){
      System.out.println("���ȣ�� ");
      aa();//�ڽ��� ȣ��= ��� ȣ��
    }//aa end

  public static void main(String []args){
    Test09 t9=new Test09();//��ü���� 
    t9.aa();//aa()�޼��� ȣ��
  }//main end

}//class end