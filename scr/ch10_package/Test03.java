package ch10_package;

import hong.kil.dong.*;

public class Test03 {
	//전역변수
	CalcTest01 t1;
	CalcTest02 t2;
	
	//생성자
	public Test03(){
		t1=new CalcTest01();
		t2=new CalcTest02();
		
		t1.hab(10,7);
		t2.cha(20,5);
	}//cons  
	
	
	//메서드
    public static void main(String args[]){
    	new Test03();
    }//main end
}//class end
