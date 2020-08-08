package ch01;
public class Test08{
  public static void main(String args[]){
    int a=10;//정수 10을 a에 할당
    System.out.println(a);
    System.out.println(Integer.toBinaryString(a));//10진을 2진으로 변환
    System.out.println(Integer.toOctalString(a));//10진을 8진으로 변환
    System.out.println(Integer.toHexString(a));//10진을 16진으로 변환
    //
    System.out.println(Integer.MAX_VALUE);//int 최대값
    System.out.println(Integer.MIN_VALUE);//int 최소값 
  System.out.println(Long.MAX_VALUE);//long 최대값

  }//main end
}//class end
//[JAVA] 무한대 정수 BigInteger 사용하기