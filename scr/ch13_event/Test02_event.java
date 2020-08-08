package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test02_event extends Frame implements ActionListener{
	//����
	Button bFileOpen,bFileSave,bPrint,bExit;
	Panel pNorth,pSouth;
	
	//������
	public Test02_event(){
		super("��ư����");//ù�ٿ� �����ؾ� �Ѵ�, ���� Ŭ���� ������ ȣ��
		
		bFileOpen=new Button("���Ͽ���");
		bFileSave=new Button("��������");
		bPrint=new Button("�μ�");
		bExit=new Button("����");
		
		pNorth=new Panel();
		pSouth=new Panel();
		
		//��ü������, ��ü.�޼���()
		pNorth.setBackground(Color.blue);
		pSouth.setBackground(Color.gray);
		//bFileOpen.setBackground(Color.pink);
		
		//Panel �����̳ʿ� ��ư ���̱� 
		pNorth.add(bFileOpen);
		pNorth.add(bFileSave);
		pNorth.add(bPrint);
		
		pSouth.add(bExit);
		
		//frame�� panel ���̱�
		add(pNorth,"North");
		add(pSouth,"South");
		
		//�̺�Ʈ���
		addWindowListener(new Mywin());
		
		bFileOpen.addActionListener(this);
		bFileSave.addActionListener(this);
		bPrint.addActionListener(this);
		bExit.addActionListener(this);
		
		setSize(500,500);
		setVisible(true);
	}//cons end
	//inner class
	class Mywin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//�޼���: �������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bFileOpen){
			FileDialog fd=new FileDialog(this,"���Ͽ���",FileDialog.LOAD);
			//this: FileDialog �Ҽӵ� �θ� ��ü         ������       Mode
			fd.setVisible(true);
		}else if(e.getSource()==bFileSave){
			FileDialog fd=new FileDialog(this,"��������",FileDialog.SAVE);
		}else if(e.getSource()==bPrint){
			PrintJob pj=getToolkit().getPrintJob(this,"�μ�",null);
		}else if(e.getSource()==bExit){
			System.exit(0);
		}//if end
		
	}//actionPerformed() end
	//main
	public static void main(String args[]){
		new Test02_event();
	}
}//class end
