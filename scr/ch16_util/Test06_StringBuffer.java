package ch16_util;
//StringBuffer�� String���� ó�� �ӵ��� ������ 
//StringBuffer�� �������ڿ� ó���� ��� 

//import java.util.*;
public class Test06_StringBuffer {
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer();// ��ü����
		
		sb.append("Hellow");
		sb.append("Good");
		
		System.out.println(sb.toString());
		
		//sb.reverse();//�������� ���
		//System.out.println(sb.toString());
		
		//sb.delete(0, 5); //HellowGood
		//                   012345678  end�������� ���
		//System.out.println(sb.toString());
		
		System.out.println("���� �����ͱ���"+sb.length());//9
		System.out.println("����ũ��"+sb.capacity());//16
		
		//---------------------------------------------------
		StringBuffer sb2=new StringBuffer("java");//��ü ����
		StringBuffer sb3=new StringBuffer(10);//
		StringBuffer sb4=new StringBuffer();//��ü ����
		StringBuffer sb5=new StringBuffer();//��ü ����
		
		sb5.append("aaaaabbbbbcccccdd");//17*2
		sb5.append("aaaaabbbbbcccccdd");
		System.out.println("����ũ��"+sb2.capacity());//16+4
		System.out.println("����ũ��"+sb3.capacity());//10
		System.out.println("����ũ��"+sb4.capacity());//16
		System.out.println("����ũ��"+sb5.capacity());//34
	}//main end
}//class end
