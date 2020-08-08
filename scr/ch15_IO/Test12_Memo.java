package ch15_IO;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//MenuBar:�޴���
//Menu:�ָ޴�
//MenuItem:�׸�޴�
public class Test12_Memo extends Frame implements ActionListener{
	//����
	TextArea ta;
	
	//������
	public Test12_Memo(){
		setTitle("�޸���");
		
		MenuBar nb=new MenuBar();
		
		Menu fileMenu=new Menu("����");
		Menu fntMenu=new Menu("����");
		Menu printMenu=new Menu("�μ�");
		
		nb.add(fileMenu);//�޴��ٿ� �޴� ���̱�
		nb.add(fntMenu);
		nb.add(printMenu);
		
		//����
		MenuItem newItem=new MenuItem("����",new MenuShortcut('N'));
		fileMenu.add(newItem);//�޴�/�׸�޴�
		newItem.addActionListener(this);//�̺�Ʈ ���
		newItem.setActionCommand("new");
		
		
		//���� ����
		MenuItem openItem=new MenuItem("����",new MenuShortcut('O'));
		fileMenu.add(openItem);
		openItem.addActionListener(this);//�̺�Ʈ ���
		openItem.setActionCommand("open");
		
		//���� ����
		MenuItem saveItem=new MenuItem("����",new MenuShortcut('S'));
		fileMenu.add(saveItem);
		saveItem.addActionListener(this);//�̺�Ʈ ���
		saveItem.setActionCommand("save");
		
		
		//���м�, �и���
		fileMenu.addSeparator();
		
		//����
		MenuItem exitItem=new MenuItem("����",new MenuShortcut('X'));
		fileMenu.add(exitItem);
		exitItem.addActionListener(this);
		exitItem.setActionCommand("exit");
		
		//����//�۲�ũ��
		MenuItem fntItem12=new MenuItem("�۲�12");
		fntMenu.add(fntItem12);//�޴�/�׸�޴�
		fntItem12.addActionListener(this);//�̺�Ʈ ���
		fntItem12.setActionCommand("fnt12");
		
		//����//�۲�ũ��
		MenuItem fntItem14=new MenuItem("�۲�14");
		fntMenu.add(fntItem14);//�޴�/�׸�޴�
		fntItem14.addActionListener(this);//�̺�Ʈ ���
		fntItem14.setActionCommand("fnt14");
		
		//����//�۲�ũ��
		MenuItem fntItem16=new MenuItem("�۲�16");
		fntMenu.add(fntItem16);//�޴�/�׸�޴�
		fntItem16.addActionListener(this);//�̺�Ʈ ���
		fntItem16.setActionCommand("fnt16");
		
		//�μ�޴�
		MenuItem printItem=new MenuItem("�μ�",new MenuShortcut('P'));
		printMenu.add(printItem);
		printItem.addActionListener(this);//�޴�/�׸�޴�
		printItem.setActionCommand("print");//�̺�Ʈ ���


		
		ta=new TextArea();
		add(ta,"Center");
		setMenuBar(nb);//Frame �޴��ٺ��̱�
		
		//�̺�Ʈ ���
		addWindowListener(new Mywin());
		
		setBounds(100,100,350,350);//x,y,w,h
		setVisible(true);//âǥ��
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
			setTitle("�޸���");
			
		}else if(str.equals("open")){
			ta.setText("");
			setTitle("�޸���");
			
			fd=new FileDialog(this,"���Ͽ���",FileDialog.LOAD);
			fd.setVisible(true);//���̾˷α� ǥ��
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
		}else if(str.equals("fnt12")){
			ta.setFont(new Font("Dialog",Font.BOLD,12));
		}else if(str.equals("fnt14")){
			ta.setFont(new Font("Dialog",Font.BOLD,14));
		}else if(str.equals("fnt16")){
			ta.setFont(new Font("Dialog",Font.BOLD,16));
		}else if(str.equals("print")){
			PrintJob pj=getToolkit().getPrintJob(this,"�μ�",null);
		}else if(str.equals("exit")){
			System.exit(0);
		}
	}//actionPerformed() end
	
	//��������� �޼���(���Ͽ���)
	public void fileLoad(String fn){
		BufferedReader in=null;
		ta.selectAll();
		ta.setText(" ");//�޸��������
		try{
			in=new BufferedReader(new FileReader(fn),1024);//1024�� ����ũ��
			String str="";//����
			while((str=in.readLine()) != null){//���ϳ��� �ƴѵ��� �ݺ�����
				ta.append(str+'\n');
			}//while end
			
			setTitle("�����̸�:"+fn);//â����
		}catch(Exception e1){
			System.out.println("fileLoad() ����:"+e1);
		}finally{
			try{
				in.close();
			}catch(Exception e2){}
		}//finally end
		
	}//fileLoad() end
	
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
		new Test12_Memo();
	}//main end
}//class end
