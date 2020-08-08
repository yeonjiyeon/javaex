package ch08_class;

public class Test02_homework {
	public static void main(String args[]){
	//문제:args[0]에 주민번호를 입력하여 
	//남자인지 여자인지 판정하여 출력하시오	
		//000000-1~
		//000000-2~
		//000000-3~
		//000000-4~
		String jumin=args[0];
		//System.out.println(ju);
		//1. 방법
		String j=jumin.substring(7,8);
		if(j.equals("1")||j.equals("3")){
			System.out.println(jumin+"는 남자");
		}else if(j.equals("2")||j.equals("4")){
			System.out.println(jumin+"는 여자");
		}//else if
		//System.out.println("j:"+j);
		
		//2.방법
		int i=Integer.parseInt(j);//문자열을 정수로 변환		
		if(i==1 || i==3){
			System.out.println(jumin+"는 남자");
		}else if(i==2 || i==4){
			System.out.println(jumin+"는 여자");
		}//else if...

		//3.방법
		switch(i){
		case 1:
		case 3:
			System.out.println(jumin+"는 남자");
			break;
		case 2:
		case 4:
			System.out.println(jumin+"는 여자");
		}//switch end
		
		//4.방법
		char ch=jumin.charAt(7);
		//System.out.println("ch:"+ch);
		if(ch=='1'||ch=='3'){
			System.out.println(jumin+"는 남자");
		}else if(ch=='2'||ch=='4'){
			System.out.println(jumin+"는 여자");
		}//else if
		
		//5.방법
		switch(ch){
		case '1':
		case '3':
			System.out.println(jumin+"는 남자");
			break;
		case '2':
		case '4':
			System.out.println(jumin+"는 여자");			
		}//switch end
		
		
		
		
	}//main end

}//class end
