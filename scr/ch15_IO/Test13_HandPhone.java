package ch15_IO;
import java.io.*;

public class Test13_HandPhone implements Serializable{
	//����
	String hpName;//�ڵ��� �̸�
	//int hpPrice;//�ڵ��� ����
	transient int hpPrice;//��ü����ȭ���� ���ܽ�Ų��
	
	
	//������
	public Test13_HandPhone(String n,int p){
		this.hpName=n;
		this.hpPrice=p;
	}
	//getter method
	public String getHpName(){
		return hpName;
	}
	public int getHpPrice(){
		return hpPrice;
	}	
	
}//class end
