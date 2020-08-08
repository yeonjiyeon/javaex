package ch14_exception;

public class Test05_exception {
	public static void main(String args[]){
		int jum[]={70,80,90,98,100};
		try{
			double d=Jumsu.calcAvg(jum);//calcAvg()�޼���ȣ��,calcAvg()�޼��带 �����ϴ� ���� ���ܰ� �߻��ϸ�
                                        //�� �������� ���ƿ��� , catch���� ���ܸ� ó���Ѵ�  
			System.out.println("���:"+d);
		}catch(JumsuException ex){
			System.out.println(ex);
		}
	}//main end
}//class end

//----------------------------------------------
class Jumsu{
	public static double calcAvg(int score[]) throws JumsuException{
		if(score.length !=5){//���ܹ߻�����
			throw new JumsuException("�迭 ���ܰ� �߻��Ͽ����ϴ�");
		}//if end
		
		//����ó��: ���ܰ� �߻����� �ʾ��� ��
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