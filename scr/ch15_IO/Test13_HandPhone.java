package ch15_IO;
import java.io.*;

public class Test13_HandPhone implements Serializable{
	//변수
	String hpName;//핸드폰 이름
	//int hpPrice;//핸드폰 가격
	transient int hpPrice;//객체직렬화에서 제외시킨다
	
	
	//생성자
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
