package ch01;

public class Test06{
   public static void main(String args[]){
      //args[]=>args[0] args[1] args[2]
      System.out.println("�μ� ����:"+args.length);
      System.out.println("args[0]:"+ args[0]);
      System.out.println("args[1]:"+ args[1]);
      System.out.println("args[2]:"+ args[2]);
   }//main end
}//class end

//C:\java_work\ch01>javac Test06.java  ������
/*
C:\java_work\ch01>java Test06 kim lee park ����
�μ� ����:3
args[0]:kim
args[1]:lee
args[2]:park
*/
/******����
����� �μ�
java�������α׷����� main()�̶�� �����޼��尡 ���Եȴ�
�� �޼���� String ��ü �迭�� �μ� �ϳ��� ���´�. 
�� �μ��� ��ü���� ����ڰ� ����ٿ� �Է��� �� �ִ� ��� �μ��� ǥ���� �� �ִ�.

������μ������� int���̰�(��:args.length�� ���ؼ� ���Ѵ�)
�μ��� args[0], args[1], args[2],....������ �������ȴ�
******/