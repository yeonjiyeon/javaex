package ch15_IO;
//파일
//    새글
//    열기
//    저장
//창종류  :inner class 
//디자인
//처리기능구현

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Test14_homework extends Frame implements ActionListener{
	//변수
	TextArea ta;
	//생성자 
	public Test14_homework(){
		setTitle("메모장");
		
		MenuBar mb=new MenuBar(); 
		
		Menu filemenu=new Menu("파일");
		
		mb.add(filemenu);
		
		MenuItem newItem=new MenuItem("새글");
		filemenu.add(newItem);
		newItem.addActionListener(this);
		newItem.setActionCommand("new");
		
		MenuItem openItem=new MenuItem("열기");
		filemenu.add(openItem);
		openItem.addActionListener(this);
		openItem.setActionCommand("open");
		
		MenuItem saveItem=new MenuItem("저장");
		filemenu.add(saveItem);
		saveItem.addActionListener(this);
		saveItem.setActionCommand("save");
		
		ta=new TextArea();
		add(ta,"Center");
		setMenuBar(mb);
		
		//이벤트 등록
		addWindowListener(new Mywin());
		
		setSize(500,500);
		setVisible(true);
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class 
	
	//메서드
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		
		String str=e.getActionCommand();
		if(str.equals("new")){
			ta.setText(" ");
			
		}else if(str.equals("open")){
			ta.setText("");
			
			fd=new FileDialog(this,"파일열기",FileDialog.LOAD);
			fd.setVisible(true);
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
		}
	}//if
	
	//사용자정의 메서드(파일열기)
	public void fileLoad(String fn){
		BufferedReader in=null;
		ta.setText(" ");
		try{
			in=new BufferedReader(new FileReader(fn));
			String str="";
			while((str=in.readLine()) !=null){
				ta.append(str+'\n');
			}//while end
			setTitle("파일이름:"+fn);
		}catch(Exception e1){
			System.out.println(" "+e1);
		}finally{
			try{
				in.close();
			}catch(Exception e2){}
		}//finally end
	}

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
		new Test14_homework();
	}//main end
	
}//class end
