package ch26_db;
import java.awt.*;//Layout

import javax.swing.*;//JFrame ���
public class UpdateTest extends JFrame{
	
	JLabel laJemok;//����
	JLabel laName,laId,laEmail,laTitle,laContent;
	JTextField tfName,tfId,tfEmail,tfTitle;
	JTextArea taContent;
	
	JButton buUpdate;
	
	//������
	public UpdateTest(){
		laJemok =new JLabel("Update");
		laJemok.setFont(new Font("Dialog",Font.BOLD,25));
		//laJemok.setBackground(Color.yellow);
		laJemok.setForeground(Color.white);
		
		laName=new JLabel("�̸�",JLabel.RIGHT);
		laName.setForeground(Color.white);
		
		laId=new JLabel("ID",JLabel.RIGHT);
		laId.setForeground(Color.white);
		
		laEmail=new JLabel("Email",JLabel.RIGHT);
		laEmail.setForeground(Color.white);
		
		laTitle=new JLabel("Title",JLabel.RIGHT);
		laTitle.setForeground(Color.white);
		
		laContent=new JLabel("�۳���",JLabel.RIGHT);
		laContent.setForeground(Color.white);
		//---------
		tfName=new JTextField();
		tfId=new JTextField();
		tfId.setEditable(false);//�������ϰ� ,�������ϰ� 
		tfEmail=new JTextField();
		tfTitle=new JTextField();
		taContent=new JTextArea();
		taContent.setBackground(Color.white);
		
		buUpdate=new JButton("Update");
		
		//���α׷��Ӱ� ��ġ�۾��� �Ϸ��� �Ʒ��� ���� null�� layout�� �����Ѵ�
				getContentPane().setLayout(null);
				getContentPane().setBackground(new Color(153,102,102));
				
				getContentPane().add(laJemok).setBounds(220,30,300,30); //x,y,w,h
				getContentPane().add(laName).setBounds(80,70,50,20);
				getContentPane().add(laId).setBounds(80,100,50,20);
				getContentPane().add(laEmail).setBounds(80,130,50,20);
				getContentPane().add(laTitle).setBounds(80,160,50,20);
				getContentPane().add(laContent).setBounds(80,190,50,20);
				
				getContentPane().add(tfName).setBounds(150,70,300,20);
				getContentPane().add(tfId).setBounds(150,100,300,20);
				getContentPane().add(tfEmail).setBounds(150,130,300,20);
				getContentPane().add(tfTitle).setBounds(150,160,300,20);
				getContentPane().add(taContent).setBounds(150,190,300,100);
				
				getContentPane().add(buUpdate).setBounds(260,300,80,30);
				
				setBounds(200,200,600,370);
				//setVisible(true);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���α׷� ����
	}//cons end

	//public static void main(String args[]){
		//new UpdateTest();
	//}
}//class end
