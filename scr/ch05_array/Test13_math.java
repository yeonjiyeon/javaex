package ch05_array;

public class Test13_math {
public static void main(String args[]){
	double d=3.1;
	System.out.println(Math.ceil(d));//올림값
	
	d=5.7;
	System.out.println(Math.floor(d));//내림값
	
	System.out.println(Math.round(d));//사사오입
	
	d=5.4;
	System.out.println(Math.round(d));
	
	d=5.5;
	System.out.println(Math.round(d));
	
	System.out.println(Math.PI);
	
	//게시판의 페이지수계산
	//글갯수 37개, 한페이지에 10개씩 출력하시오 
	int pageCount=(int)(Math.ceil((double)37/10));
	System.out.println("pageCount :"+pageCount);
}
}//class end
