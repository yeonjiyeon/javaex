package ch24_network;
import java.util.*;
public class Room {
	
	//변수
	Vector userVec=new Vector();//방사람들 저장공간
	String title,zzang;//방제목,방장이름
	int inwon;//인원
	
	//디폴트생성자: 대기실
	public Room(){}
	
	//인자있는 생성자: 채팅방에 들어왔을때
	public Room(String t, String z, int i){
		title=t;
		zzang=z;
		inwon=i;
	}//cons end
	
}//class end
//컴파일만, 저장