package ch15_IO;
import java.io.*;
//PrintWriter(OutputStream os) ������
//PrintWriter(OutputStream os, boolean flushOnNewLine) ������
//boolean flushOnNewLine�� �ٹٲ�(true/false)
//PrintWriter(Writer w) ������
//PrintWriter(Writer w,boolean flushOnNewLine) ������

//java�� PrintWriter ��ü�� Object�� ����� ��� ���Ŀ� ���ؼ� print(),println()�޼��带 �����Ѵ�
public class Test06_printw {
	public static void main(String args[]){
		
		PrintWriter pp=new PrintWriter(System.out);
		
		pp.println(100);
		pp.println('A');
		pp.println(12.5f);
		pp.println(22.55d);
		pp.println(true);
		pp.println("ȫ�浿");
		pp.println(new java.util.Date());//��ü
		
		pp.close();
		
	}//main end
}//class end
