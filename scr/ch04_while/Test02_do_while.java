package ch04_while;

//do~while��
public class Test02_do_while {
	public static void main(String args[]){
		//--------------------------
		//good-Afternoon 5�� ����Ͻÿ�
		//--------------------------
		int i=1;
		do{
			System.out.println("good-Afternoon");
			i++;
		}while(i<=5);

		//--------------------------
		//1~10 ����Ͻÿ�
		//--------------------------
		i=1;
		do{
			System.out.print(i+" ");
			i++;
			
		}while(i<=10);
		
		System.out.println();
		
		//--------------------------
		//1~50���� 8�� ����� ����Ͻÿ�
		//if,while ���
		//--------------------------

		i=1;
		do{
			if(i%8==0){
				System.out.print(i+" ");
				
			}//if end
			i++;
		}while(i<=50);
		System.out.println();
		
		
	}//main end

}//class end


