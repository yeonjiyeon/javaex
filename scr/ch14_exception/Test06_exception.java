package ch14_exception;
//�޼���� static�� ����
public class Test06_exception {
	public static void main(String args[]){
		try{
			System.out.println("aa()ȣ����");
			aa();//aa()ȣ��
			System.out.println("aa()ȣ����");
		}catch(Exception e1){
			//System.out.println("main() ó���� ���ܹ߻�:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("main() finally��");
		}//finally end
	}//main end

	//aa()
	public static void aa(){
		try{
			System.out.println("bb()ȣ����");
			bb();//bb()ȣ��
			System.out.println("bb()ȣ����");
		}catch(Exception e1){
			//System.out.println("aa() ó���� ���ܹ߻�:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("aa() finally��");
		}//finally end
	}//aa() end
		
	
	//bb()
	public static void bb(){
		try{
			System.out.println("cc()ȣ����");
			cc();//cc()ȣ��
			System.out.println("cc()ȣ����");
		}catch(Exception e1){
			//system.out.println("bb() ó���� ���ܹ߻�:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("bb() finally��");
		}//finally end
	}//bb() end
	
	//cc()
	public static void cc(){
		try{
			System.out.println("dd()ȣ����");
			dd();//dd()ȣ��
			System.out.println("dd()ȣ����");
		}catch(Exception e1){
			//System.out.println("cc() ó���� ���ܹ߻�:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("cc() finally��");
		}//finally end
	}//cc() end
	
	//dd()
	public static void dd(){
		try{
			System.out.println("dd()�޼��� ������ ��");
			int x=3,y=0;
			System.out.println(x/y);//����
			
		}catch(Exception e1){
			//System.out.println("dd()ó���� ���ܹ߻�:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("dd() finally ��");
		}//finally end
	}//dd()end
}//class end
