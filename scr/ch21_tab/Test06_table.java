package ch21_tab;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Test06_table extends JPanel implements ActionListener,MouseListener{
	//����
	JButton b;
	JPanel panel;
	JLabel laName,laAge,laAddr;
	JTextField tfName,tfAge,tfAddr;
	
	String cols[]={"�̸�","����","�ּ�"};
	Object data[][]=new Object[0][3]; //0��3��
	
	DefaultTableModel model=new DefaultTableModel(data,cols);
	JTable table=new JTable(model);
	JScrollPane scrollPane=new JScrollPane(table);
	
	//������
	public Test06_table(){
		b=new JButton("���̺� ���� ����");
		panel=new JPanel();
		panel.setBackground(Color.yellow);
		
		laName=new JLabel("�̸�",JLabel.RIGHT);
		laAge=new JLabel("����",JLabel.RIGHT);
		laAddr=new JLabel("�ּ�",JLabel.RIGHT);
		
		tfName=new JTextField();
		tfAge=new JTextField();
		tfAddr=new JTextField();
		
		panel.setLayout(new GridLayout(3,2));//3��2��
		panel.add(laName);
		panel.add(tfName);
		
		panel.add(laAge);
		panel.add(tfAge);
		
		panel.add(laAddr);
		panel.add(tfAddr);
		
		//�̺�Ʈ ���
		tfName.addActionListener(this);
		tfAge.addActionListener(this);
		tfAddr.addActionListener(this);
		
		b.addActionListener(this);
		table.addMouseListener(this);
		
		this.setLayout(new BorderLayout(3,2));
		this.add(panel,"North");
		this.add(scrollPane,"Center");
		this.add(b,"South");
		
		setSize(350,350);
		setVisible(true);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//cons end
	
	//�������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tfName){
			tfAge.requestFocus();
		}else if(e.getSource()==tfAge){
			
			tfAddr.requestFocus();
		}else if (e.getSource()==tfAddr){
			Object temp[]={tfName.getText(),tfAge.getText(),tfAddr.getText()};
			model.addRow(temp);//���߰�
			
			tfName.setText("");
			tfAge.setText("");
			tfAddr.setText("");
			
			tfName.requestFocus();
			
		}else if(e.getSource()==b){
			model.setRowCount(0);//���̺� ���� ��� �����
		}
	}//actionPerformed() end
	
	//��������
	int row=-1;
	int col=-1;
	//�������̵�
	public void mousePressed(MouseEvent m){
		row=table.getSelectedRow();
		col=table.getSelectedColumn();
		//System.out.println("row:"+row);
		//System.out.println("col:"+col);
		String dd=(String)table.getValueAt(row,col);
		System.out.println("dd:"+dd);
	}//mousePressed() end
	public void mouseReleased(MouseEvent m){}
	public void mouseClicked(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	//main
	/*public static void main(String args[]){
		new Test06_table();
	}//main end*/
	
	
}//class end
//�����ϸ�=����
