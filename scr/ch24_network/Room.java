package ch24_network;
import java.util.*;
public class Room {
	
	//����
	Vector userVec=new Vector();//������ �������
	String title,zzang;//������,�����̸�
	int inwon;//�ο�
	
	//����Ʈ������: ����
	public Room(){}
	
	//�����ִ� ������: ä�ù濡 ��������
	public Room(String t, String z, int i){
		title=t;
		zzang=z;
		inwon=i;
	}//cons end
	
}//class end
//�����ϸ�, ����