package ch01;
public class Test08{
  public static void main(String args[]){
    int a=10;//���� 10�� a�� �Ҵ�
    System.out.println(a);
    System.out.println(Integer.toBinaryString(a));//10���� 2������ ��ȯ
    System.out.println(Integer.toOctalString(a));//10���� 8������ ��ȯ
    System.out.println(Integer.toHexString(a));//10���� 16������ ��ȯ
    //
    System.out.println(Integer.MAX_VALUE);//int �ִ밪
    System.out.println(Integer.MIN_VALUE);//int �ּҰ� 
  System.out.println(Long.MAX_VALUE);//long �ִ밪

  }//main end
}//class end
//[JAVA] ���Ѵ� ���� BigInteger ����ϱ�