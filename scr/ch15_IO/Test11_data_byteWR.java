package ch15_IO;
import java.io.*;
//����Ʈ��Ʈ�� ����
public class Test11_data_byteWR {
	public static void main(String args[]) throws IOException{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("a5.txt"));
		dos.writeByte(127);
		dos.writeChar('A');
		dos.writeShort(32767);
		
		dos.writeInt(2147483647);
		dos.writeFloat(12.5f);
		dos.writeDouble(22.2);
		
		dos.writeBoolean(true);
		dos.writeChars("�̼���\n");
		dos.writeUTF("ȫ�浿");////////
		
		dos.close();
		//---------------------------------------
		DataInputStream dis=new DataInputStream(new FileInputStream("a5.txt"));
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readLine());//��� �������� ������ �ȴ�
		System.out.println(dis.readUTF());//******
		
		dis.close();
		
	}//main end
}//class end
