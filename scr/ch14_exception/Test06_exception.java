package ch14_exception;
//메서드는 static에 들어간다
public class Test06_exception {
	public static void main(String args[]){
		try{
			System.out.println("aa()호출전");
			aa();//aa()호출
			System.out.println("aa()호출후");
		}catch(Exception e1){
			//System.out.println("main() 처리중 예외발생:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("main() finally절");
		}//finally end
	}//main end

	//aa()
	public static void aa(){
		try{
			System.out.println("bb()호출전");
			bb();//bb()호출
			System.out.println("bb()호출후");
		}catch(Exception e1){
			//System.out.println("aa() 처리중 예외발생:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("aa() finally절");
		}//finally end
	}//aa() end
		
	
	//bb()
	public static void bb(){
		try{
			System.out.println("cc()호출전");
			cc();//cc()호출
			System.out.println("cc()호출후");
		}catch(Exception e1){
			//system.out.println("bb() 처리중 예외발생:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("bb() finally절");
		}//finally end
	}//bb() end
	
	//cc()
	public static void cc(){
		try{
			System.out.println("dd()호출전");
			dd();//dd()호출
			System.out.println("dd()호출후");
		}catch(Exception e1){
			//System.out.println("cc() 처리중 예외발생:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("cc() finally절");
		}//finally end
	}//cc() end
	
	//dd()
	public static void dd(){
		try{
			System.out.println("dd()메서드 나누기 전");
			int x=3,y=0;
			System.out.println(x/y);//예외
			
		}catch(Exception e1){
			//System.out.println("dd()처리중 예외발생:"+e1);
			e1.printStackTrace();
		}finally{
			System.out.println("dd() finally 절");
		}//finally end
	}//dd()end
}//class end
