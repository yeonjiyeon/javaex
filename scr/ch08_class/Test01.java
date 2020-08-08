package ch08_class;

public class Test01 {
  //변수
	public static void main(String args[]){
		String str="GoodAfternoon";
		String s=str.substring(4);//Afternoon
		System.out.println(s);
		
		String jumin="881219-1055910";//start부터 end직전까지 발췌
		String ju=jumin.substring(7,8);//1
		System.out.println("ju:"+ju);
		
		String str3="banana";
		int i=str3.indexOf('a');// 첫번째로 발견된 'a'문자위치를 반환한다
		                        //1을 반환
		System.out.println("i:"+i);
		
		String str5="총 비용은 $45.67"; //공백도 글자수 포함
		int i3=str5.indexOf("$45.67");
		String str7=str5.substring(i3);//i3번째부터끝까지 발췌
		System.out.println("i3:"+i3);
		System.out.println("str7:"+str7);

	}//main end
  //메서드
}//class end
