package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test02_event extends Frame implements ActionListener{
	//변수
	Button bFileOpen,bFileSave,bPrint,bExit;
	Panel pNorth,pSouth;
	
	//생성자
	public Test02_event(){
		super("버튼에게");//첫줄에 기재해야 한다, 상위 클래스 생성자 호출
		
		bFileOpen=new Button("파일열기");
		bFileSave=new Button("파일저장");
		bPrint=new Button("인쇄");
		bExit=new Button("종료");
		
		pNorth=new Panel();
		pSouth=new Panel();
		
		//객체생성후, 객체.메서드()
		pNorth.setBackground(Color.blue);
		pSouth.setBackground(Color.gray);
		//bFileOpen.setBackground(Color.pink);
		
		//Panel 컨테이너에 버튼 붙이기 
		pNorth.add(bFileOpen);
		pNorth.add(bFileSave);
		pNorth.add(bPrint);
		
		pSouth.add(bExit);
		
		//frame에 panel 붙이기
		add(pNorth,"North");
		add(pSouth,"South");
		
		//이벤트등록
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
		//오버라이딩
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//메서드: 오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bFileOpen){
			FileDialog fd=new FileDialog(this,"파일열기",FileDialog.LOAD);
			//this: FileDialog 소속될 부모 객체         방제목       Mode
			fd.setVisible(true);
		}else if(e.getSource()==bFileSave){
			FileDialog fd=new FileDialog(this,"파일저장",FileDialog.SAVE);
		}else if(e.getSource()==bPrint){
			PrintJob pj=getToolkit().getPrintJob(this,"인쇄",null);
		}else if(e.getSource()==bExit){
			System.exit(0);
		}//if end
		
	}//actionPerformed() end
	//main
	public static void main(String args[]){
		new Test02_event();
	}
}//class end
