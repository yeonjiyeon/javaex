package ch08_class;

public class Test01 {
  //����
	public static void main(String args[]){
		String str="GoodAfternoon";
		String s=str.substring(4);//Afternoon
		System.out.println(s);
		
		String jumin="881219-1055910";//start���� end�������� ����
		String ju=jumin.substring(7,8);//1
		System.out.println("ju:"+ju);
		
		String str3="banana";
		int i=str3.indexOf('a');// ù��°�� �߰ߵ� 'a'������ġ�� ��ȯ�Ѵ�
		                        //1�� ��ȯ
		System.out.println("i:"+i);
		
		String str5="�� ����� $45.67"; //���鵵 ���ڼ� ����
		int i3=str5.indexOf("$45.67");
		String str7=str5.substring(i3);//i3��°���ͳ����� ����
		System.out.println("i3:"+i3);
		System.out.println("str7:"+str7);

	}//main end
  //�޼���
}//class end
