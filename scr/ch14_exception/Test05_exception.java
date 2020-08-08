package ch14_exception;

public class Test05_exception {
	public static void main(String args[]){
		int jum[]={70,80,90,98,100};
		try{
			double d=Jumsu.calcAvg(jum);//calcAvg()메서드호출,calcAvg()메서드를 실행하는 동안 예외가 발생하면
                                        //이 시점으로 돌아오면 , catch에서 예외를 처리한다  
			System.out.println("평균:"+d);
		}catch(JumsuException ex){
			System.out.println(ex);
		}
	}//main end
}//class end

//----------------------------------------------
class Jumsu{
	public static double calcAvg(int score[]) throws JumsuException{
		if(score.length !=5){//예외발생조건
			throw new JumsuException("배열 예외가 발생하였습니다");
		}//if end
		
		//정상처리: 예외가 발생하지 않았을 때
		int sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		double a=(double)sum/score.length;
		
		return a;
	}//method end
}//class end

class JumsuException extends Exception{
	public JumsuException(String msg){
		super(msg);
	}//cons end
}//class end