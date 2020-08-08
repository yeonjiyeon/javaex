package ch15_IO;
//����
//    ����
//    ����
//    ����
//â����  :inner class 
//������
//ó����ɱ���

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Test14_homework extends Frame implements ActionListener{
	//����
	TextArea ta;
	//������ 
	public Test14_homework(){
		setTitle("�޸���");
		
		MenuBar mb=new MenuBar(); 
		
		Menu filemenu=new Menu("����");
		
		mb.add(filemenu);
		
		MenuItem newItem=new MenuItem("����");
		filemenu.add(newItem);
		newItem.addActionListener(this);
		newItem.setActionCommand("new");
		
		MenuItem openItem=new MenuItem("����");
		filemenu.add(openItem);
		openItem.addActionListener(this);
		openItem.setActionCommand("open");
		
		MenuItem saveItem=new MenuItem("����");
		filemenu.add(saveItem);
		saveItem.addActionListener(this);
		saveItem.setActionCommand("save");
		
		ta=new TextArea();
		add(ta,"Center");
		setMenuBar(mb);
		
		//�̺�Ʈ ���
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
	
	//�޼���
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		
		String str=e.getActionCommand();
		if(str.equals("new")){
			ta.setText(" ");
			
		}else if(str.equals("open")){
			ta.setText("");
			
			fd=new FileDialog(this,"���Ͽ���",FileDialog.LOAD);
			fd.setVisible(true);
			String fn=fd.getDirectory()+fd.getFile();
			if(fn !=null){
				fileLoad(fn);
			}//if
		}else if(str.equals("save")){
			fd=new FileDialog(this,"��������",FileDialog.SAVE);
			fd.setVisible(true);
			String fn=fd.getDirectory()+fd.getFile();
			if(fn !=null){
				fileSave(fn);
			}//if
		}
	}//if
	
	//��������� �޼���(���Ͽ���)
	public void fileLoad(String fn){
		BufferedReader in=null;
		ta.setText(" ");
		try{
			in=new BufferedReader(new FileReader(fn));
			String str="";
			while((str=in.readLine()) !=null){
				ta.append(str+'\n');
			}//while end
			setTitle("�����̸�:"+fn);
		}catch(Exception e1){
			System.out.println(" "+e1);
		}finally{
			try{
				in.close();
			}catch(Exception e2){}
		}//finally end
	}

	//��������� �޼���(��������)
	public void fileSave(String fn){
		PrintWriter out=null;
		try{
			out=new PrintWriter(new BufferedWriter(new FileWriter(fn)));
			String str=ta.getText();
			out.println(str);
			setTitle("�����̸�:"+fn);
		}catch(Exception e1){
			System.out.println("fileSave() ����:"+e1);
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
