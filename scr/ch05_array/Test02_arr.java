package ch05_array;
//전역변수는 자동으로 초기화가 된다
//지역변수는 자동으로 초기화 안된다->반드시 초기화시켜주어야 한다
//배열은 지역일지라도 자동으로 초기화된다

public class Test02_arr {
	//전역병수선언(메소드밖에서 선언)
	static int max;//0으로 초기화된다
	public static void main(String args[]){
		//지역변수선언(메소드안에서 선언)
		int max2;
		System.out.println("전역변수 max:"+max);
		//System.out.println("지역변수 max2:"+max2);//지역변수는 자동으로 초기화 안된다->반드시 초기화시켜주어야 한다
		
		//배열선언
		int a[]=new int[3];//배열생성
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]:"+a[i]);
		}
	}//main end

}//class end
