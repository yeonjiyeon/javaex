package ch09_interface_abs;

public class BoardImpl implements Board{
	
	public void insertDB(){
		System.out.println("�Խ��Ǳ۾���");
	}
	public void updateDB(){
		System.out.println("�Խ��Ǳۼ���");
	}
	public void deleteDB(){
		System.out.println("�Խ��Ǳۻ���");
	}
	public void contentDB(){
		System.out.println("�� ���� ����");
	}
	public void listDB(){
		System.out.println("�� ��Ϻ���");
	}

}//class end
