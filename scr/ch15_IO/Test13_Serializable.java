package ch15_IO;
import java.io.*;
public class Test13_Serializable {
	public static void main(String args[]) throws Exception{
		Test13_HandPhone hp=new Test13_HandPhone("������",2500000);
		//��ü: hp
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ob.txt"));
		oos.writeObject(hp);//���Ϸ� ����
		oos.close();
		//--------------------------------------------------------
		//�о����
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ob.txt"));
		
		Test13_HandPhone hp2=(Test13_HandPhone)ois.readObject();
		
		System.out.println("�ڵ����̸�:"+hp2.getHpName());
		System.out.println("�ڵ�������:"+hp2.getHpPrice());
		ois.close();
	}//main end
}//class end
