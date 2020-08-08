package ch15_IO;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//MenuBar:메뉴바
//Menu:주메뉴
//MenuItem:항목메뉴
public class Test12_Memo extends Frame implements ActionListener{
	//변수
	TextArea ta;
	
	//생성자
	public Test12_Memo(){
		setTitle("메모장");
		
		MenuBar nb=new MenuBar();
		
		Menu fileMenu=new Menu("파일");
		Menu fntMenu=new Menu("서식");
		Menu printMenu=new Menu("인쇄");
		
		nb.add(fileMenu);//메뉴바에 메뉴 붙이기
		nb.add(fntMenu);
		nb.add(printMenu);
		
		//새글
		MenuItem newItem=new MenuItem("새글",new MenuShortcut('N'));
		fileMenu.add(newItem);//메뉴/항목메뉴
		newItem.addActionListener(this);//이벤트 등록
		newItem.setActionCommand("new");
		
		
		//파일 열기
		MenuItem openItem=new MenuItem("열기",new MenuShortcut('O'));
		fileMenu.add(openItem);
		openItem.addActionListener(this);//이벤트 등록
		openItem.setActionCommand("open");
		
		//파일 저장
		MenuItem saveItem=new MenuItem("저장",new MenuShortcut('S'));
		fileMenu.add(saveItem);
		saveItem.addActionListener(this);//이벤트 등록
		saveItem.setActionCommand("save");
		
		
		//구분선, 분리선
		fileMenu.addSeparator();
		
		//종료
		MenuItem exitItem=new MenuItem("종료",new MenuShortcut('X'));
		fileMenu.add(exitItem);
		exitItem.addActionListener(this);
		exitItem.setActionCommand("exit");
		
		//서식//글꼴크기
		MenuItem fntItem12=new MenuItem("글꼴12");
		fntMenu.add(fntItem12);//메뉴/항목메뉴
		fntItem12.addActionListener(this);//이벤트 등록
		fntItem12.setActionCommand("fnt12");
		
		//서식//글꼴크기
		MenuItem fntItem14=new MenuItem("글꼴14");
		fntMenu.add(fntItem14);//메뉴/항목메뉴
		fntItem14.addActionListener(this);//이벤트 등록
		fntItem14.setActionCommand("fnt14");
		
		//서식//글꼴크기
		MenuItem fntItem16=new MenuItem("글꼴16");
		fntMenu.add(fntItem16);//메뉴/항목메뉴
		fntItem16.addActionListener(this);//이벤트 등록
		fntItem16.setActionCommand("fnt16");
		
		//인쇄메뉴
		MenuItem printItem=new MenuItem("인쇄",new MenuShortcut('P'));
		printMenu.add(printItem);
		printItem.addActionListener(this);//메뉴/항목메뉴
		printItem.setActionCommand("print");//이벤트 등록


		
		ta=new TextArea();
		add(ta,"Center");
		setMenuBar(nb);//Frame 메뉴바붙이기
		
		//이벤트 등록
		addWindowListener(new Mywin());
		
		setBounds(100,100,350,350);//x,y,w,h
		setVisible(true);//창표시
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	
	//method:override
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		
		String str=e.getActionCommand();//new,open,save
		if(str.equals("new")){
			ta.setText(" ");
			setTitle("메모장");
			
		}else if(str.equals("open")){
			ta.setText("");
			setTitle("메모장");
			
			fd=new FileDialog(this,"파일열기",FileDialog.LOAD);
			fd.setVisible(true);//다이알로그 표시
			String fn=fd.getDirectory()+fd.getFile();
			if(fn !=null){
				fileLoad(fn);
			}//if
		}else if(str.equals("save")){
			fd=new FileDialog(this,"파일저장",FileDialog.SAVE);
			fd.setVisible(true);
			String fn=fd.getDirectory()+fd.getFile();
			if(fn !=null){
				fileSave(fn);
			}//if
		}else if(str.equals("fnt12")){
			ta.setFont(new Font("Dialog",Font.BOLD,12));
		}else if(str.equals("fnt14")){
			ta.setFont(new Font("Dialog",Font.BOLD,14));
		}else if(str.equals("fnt16")){
			ta.setFont(new Font("Dialog",Font.BOLD,16));
		}else if(str.equals("print")){
			PrintJob pj=getToolkit().getPrintJob(this,"인쇄",null);
		}else if(str.equals("exit")){
			System.exit(0);
		}
	}//actionPerformed() end
	
	//사용자정의 메서드(파일열기)
	public void fileLoad(String fn){
		BufferedReader in=null;
		ta.selectAll();
		ta.setText(" ");//메모장지우기
		try{
			in=new BufferedReader(new FileReader(fn),1024);//1024는 버퍼크기
			String str="";//변수
			while((str=in.readLine()) != null){//파일끝이 아닌동안 반복시행
				ta.append(str+'\n');
			}//while end
			
			setTitle("파일이름:"+fn);//창제목
		}catch(Exception e1){
			System.out.println("fileLoad() 예외:"+e1);
		}finally{
			try{
				in.close();
			}catch(Exception e2){}
		}//finally end
		
	}//fileLoad() end
	
	//사용자정의 메서드(파일저장)
	public void fileSave(String fn){
		PrintWriter out=null;
		try{
			out=new PrintWriter(new BufferedWriter(new FileWriter(fn)));
			String str=ta.getText();
			out.println(str);
			setTitle("파일이름:"+fn);
		}catch(Exception e1){
			System.out.println("fileSave() 예외:"+e1);
		}finally{
			try{
				out.close();
			}catch(Exception e2){}
		}
	}//fileSave() end

	//main 
	public static void main(String args[]){
		new Test12_Memo();
	}//main end
}//class end
