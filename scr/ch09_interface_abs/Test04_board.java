package ch09_interface_abs;

public class Test04_board {
  public static void main(String args[]){
	  Board board=new BoardImpl();//��ü����
	  board.insertDB();
	  board.updateDB();
	  board.deleteDB();
	  board.contentDB();
	  board.listDB();
	  
  }//main end
}//class end
