package ch05_array;

public class Test06_arr {
  public static void main(String args[]){
	  //���ڿ��� �� ���� �迭��ҷ� �����ϱ� 
	  String str="Good-Afternoon-kil-dong";
	  //          012345678901234567890123
	  
	  System.out.println("���ڼ�:"+str.length());
	  
	  char ch[]=new char[str.length()];//Ŭ������ ������ �޼ҵ�� ����ؾ� �Ѵ�.
	  //str�� 4�ε������� 11���ؽ��������������͸� 
	  //ch �迭�� 1 index���� �����Ͻÿ�
	  ch[0]='A';
	  str.getChars(4, 11, ch, 1); 
	  //4���� 11�������� �����͸� ch�迭 1��°���� ����
	 
	  System.out.println(str);
	  
	  for(int i=0;i<ch.length;i++){
		  System.out.print(ch[i]);
	  }
	     }//main end
}//class end
