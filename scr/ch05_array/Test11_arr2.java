package ch05_array;
//����=�������� �߻���Ű�� Math.random()=>0.0~0.9999999999
//                  Ŭ����.�޼���() => 0.0<x<1.0
//�ֻ���1~6�߻��Ѵ�
//int a=(int)(Math.random()*���� �� �ִ� ������+���� �� �ִ� ���� ���� �� );
//int a=(int)(Math.random()*6+1)

//10~100������ ������ ���ϱ�(������=ū��-������+1)
//                          100-10+1
//125~233 ������ ������ �߻��Ͻÿ�
//int a=(int)(Math.random()*(233-125+1)+125);
import java.util.*;

public class Test11_arr2 {
  public static void main(String args[]){
	//�ֻ���
	  for(int i=1;i<=10;i++){
		  int a=(int)(Math.random()*6+1);
		  System.out.print(a+" ");
	  }//for
	  System.out.println();//line skip
	  //------------------------------------------------------
	  for(int i=1;i<=10;i++){
		  int a=(int)(Math.random()*(100-10+1)+10);
		  System.out.print(a+" ");
	  }//for
	  System.out.println();
	  //----------------------------------------------------
	  for(int i=1;i<=10;i++){
		  int a=(int)(Math.random()*(233-125+1)+125);
		  System.out.print(a+" ");
	  }//for
	  System.out.println();
	  
	  
  }//main end
  
}//class end
