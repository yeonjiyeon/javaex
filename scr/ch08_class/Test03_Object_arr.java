package ch08_class;
class Sung{
  private String name;//�����ʵ�, ��������
  private int kor;
  private int eng;
  
  //����Ʈ ������
  public Sung(){}
  
  //���� �ִ� ������
  public Sung(String name,int kor,int eng){
	  this.name=name;
	  this.kor=kor;
	  this.eng=eng;	  
  }//cons end
  
  //����� ���� �޼���
  public void disp(){
	  System.out.println(name+" "+kor+" "+eng);
  }
}//class sung end------------------------------------

public class Test03_Object_arr {
	public static void main(String args[]){
		//��ü ���
		Sung kim=new Sung("kim",88,99);
		Sung lee=new Sung("lee",89,77);
		Sung park=new Sung("park",100,99);
		kim.disp();
		lee.disp();
		park.disp();
		System.out.println();
		//---------------------------------------
		//��ü �迭
		//int a[]=new int[3];
		//a[0]=10;
		Sung s[]=new Sung[3];//�迭 ����
		s[0]=new Sung("aaa",55,66);//��ü ����
		s[1]=new Sung("bbb",77,88);
		s[2]=new Sung("ccc",99,88);
		//for������ ����Ͻÿ�. 
		
		for (int i=0;i<s.length;i++){
			s[i].disp();
		}//for end
		System.out.println();
		//-------------------------------------
		//int a[]=[10,20,30];
		Sung n[]={
				new Sung("���",88,77),
				new Sung("����",99,66),
				new Sung("�ڹ�",100,88)
		};
		
		for (int i=0;i<n.length;i++){
			n[i].disp();
		}
	}//main end

}//class end
