package ch01;

public class Test06{
   public static void main(String args[]){
      //args[]=>args[0] args[1] args[2]
      System.out.println("인수 갯수:"+args.length);
      System.out.println("args[0]:"+ args[0]);
      System.out.println("args[1]:"+ args[1]);
      System.out.println("args[2]:"+ args[2]);
   }//main end
}//class end

//C:\java_work\ch01>javac Test06.java  컴파일
/*
C:\java_work\ch01>java Test06 kim lee park 실행
인수 갯수:3
args[0]:kim
args[1]:lee
args[2]:park
*/
/******설명
명령줄 인수
java응용프로그램에는 main()이라는 정적메서드가 포함된다
이 메서드는 String 객체 배열인 인수 하나를 갖는다. 
이 인수의 객체들은 사용자가 명령줄에 입력할 수 있는 모든 인수를 표현할 수 있다.

명령줄인수갯수는 int형이고(식:args.length를 통해서 구한다)
인수는 args[0], args[1], args[2],....등으로 엑세스된다
******/