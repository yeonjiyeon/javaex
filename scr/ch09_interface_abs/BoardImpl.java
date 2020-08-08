package ch09_interface_abs;

public class BoardImpl implements Board{
	
	public void insertDB(){
		System.out.println("게시판글쓰기");
	}
	public void updateDB(){
		System.out.println("게시판글수정");
	}
	public void deleteDB(){
		System.out.println("게시판글삭제");
	}
	public void contentDB(){
		System.out.println("글 내용 보기");
	}
	public void listDB(){
		System.out.println("글 목록보기");
	}

}//class end
