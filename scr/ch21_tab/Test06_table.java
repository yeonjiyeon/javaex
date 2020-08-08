package ch21_tab;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Test06_table extends JPanel implements ActionListener,MouseListener{
	//변수
	JButton b;
	JPanel panel;
	JLabel laName,laAge,laAddr;
	JTextField tfName,tfAge,tfAddr;
	
	String cols[]={"이름","나이","주소"};
	Object data[][]=new Object[0][3]; //0행3열
	
	DefaultTableModel model=new DefaultTableModel(data,cols);
	JTable table=new JTable(model);
	JScrollPane scrollPane=new JScrollPane(table);
	
	//생성자
	public Test06_table(){
		b=new JButton("테이블 내용 삭제");
		panel=new JPanel();
		panel.setBackground(Color.yellow);
		
		laName=new JLabel("이름",JLabel.RIGHT);
		laAge=new JLabel("나이",JLabel.RIGHT);
		laAddr=new JLabel("주소",JLabel.RIGHT);
		
		tfName=new JTextField();
		tfAge=new JTextField();
		tfAddr=new JTextField();
		
		panel.setLayout(new GridLayout(3,2));//3행2열
		panel.add(laName);
		panel.add(tfName);
		
		panel.add(laAge);
		panel.add(tfAge);
		
		panel.add(laAddr);
		panel.add(tfAddr);
		
		//이벤트 등록
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
	
	//오버라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tfName){
			tfAge.requestFocus();
		}else if(e.getSource()==tfAge){
			
			tfAddr.requestFocus();
		}else if (e.getSource()==tfAddr){
			Object temp[]={tfName.getText(),tfAge.getText(),tfAddr.getText()};
			model.addRow(temp);//행추가
			
			tfName.setText("");
			tfAge.setText("");
			tfAddr.setText("");
			
			tfName.requestFocus();
			
		}else if(e.getSource()==b){
			model.setRowCount(0);//테이블 내용 모두 지우기
		}
	}//actionPerformed() end
	
	//전역변수
	int row=-1;
	int col=-1;
	//오버라이딩
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
//컴파일만=저장
