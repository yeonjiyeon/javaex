package ch15_IO;
import java.io.*;
public class Test13_Serializable {
	public static void main(String args[]) throws Exception{
		Test13_HandPhone hp=new Test13_HandPhone("폴더블",2500000);
		//객체: hp
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ob.txt"));
		oos.writeObject(hp);//파일로 저장
		oos.close();
		//--------------------------------------------------------
		//읽어오기
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ob.txt"));
		
		Test13_HandPhone hp2=(Test13_HandPhone)ois.readObject();
		
		System.out.println("핸드폰이름:"+hp2.getHpName());
		System.out.println("핸드폰가격:"+hp2.getHpPrice());
		ois.close();
	}//main end
}//class end
