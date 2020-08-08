package ch01;

//제귀호출 : 자신의 함수를 호출하는 것(무한 반복한다)
public class Test09{
    public void aa(){
      System.out.println("재귀호출 ");
      aa();//자신을 호출= 재귀 호출
    }//aa end

  public static void main(String []args){
    Test09 t9=new Test09();//객체생성 
    t9.aa();//aa()메서드 호출
  }//main end

}//class end