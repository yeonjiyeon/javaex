package ch02_datatype;

public class Test04_static_final {
	 static final int MAX=100;
	 
  public static void main(String args[]){
    System.out.println("MAX:"+MAX);
    //MAX=1000;//값변경못함,The final field Test04_static_final.MAX cannot be assigned
  }//main end
}//class end 
