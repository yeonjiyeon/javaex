package ch01;
public class Test07{
  public static void main(String args[]){
    int a=Integer.parseInt(args[0]);//문자열을 정수로 변환
    int b=Integer.parseInt(args[1]);

    int c=a+b;
    System.out.println("a+b="+c);

  }//main end
}//class end


//C:\java_work\ch01>javac Test07.java 컴파일

//C:\java_work\ch01>java Test07 10 20 실행
//a+b=30


