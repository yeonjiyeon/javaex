package ch04_for;

public class Test05 {
	public static void main(String args[]){
		//* * * *
		//* * * *
		//* * * *
		//* * * *
		//���� ���� ���� ����Ͻÿ�
		for(int i=1; i<=4;i++){//row
			for(int j=1; j<=4;j++){//column
				System.out.print("*");
			}//inner for
			System.out.println();//�ٹٲ�
		}//out for
		
		
		//*
		//**
		//***
		//****
		//���� ���� ���� ����Ͻÿ�
		for(int i=1; i<=4;i++){
			for(int j=1; j<=i;j++){	
				System.out.print("*");
			}//inner for
			System.out.println();
		}//out for
		
		//1
		//12
		//123
		//1234
		//���� ���� ���� ����Ͻÿ�
		for(int i=1; i<=4;i++){
			for(int j=1; j<=i;j++){
				System.out.print(j);
			}//inner for
			System.out.println();
		}//out for
		
		//A
		//AB
		//ABC
		//ABCD
		//���� ���� ���� ����Ͻÿ�
		for(int i=1; i<=4;i++){
			char ch='A';
			for(int j=1; j<=i;j++){
				System.out.print(ch);
				ch++;
			}//inner for
			System.out.println();
		}//out for
		
		
		//A
		//BC
		//DEF
		//GHIJ
		//���� ���� ���� ����Ͻÿ�
		char ch='A';
		for(int i=1; i<=4;i++){
			for(int j=1; j<=i;j++){
				System.out.print(ch);
				ch++;
			}//inner for
			System.out.println();
		}//out for
	
		
	}//main end
   
}//class end
