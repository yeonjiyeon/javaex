package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test09_scrollbar extends Frame implements AdjustmentListener{
	//����
	Scrollbar rsb,gsb,bsb;
	Label rLabel,gLabel,bLabel,label;
	Canvas canvas;//��ȭ�����
	
	
	//������
	public Test09_scrollbar(){
		super("scrollbar ����");
		
		//���α׷��Ӱ� Layout �����ϱ�
		setLayout(null);
		
		label=new Label("");
		label.setBackground(Color.yellow);
		label.setBounds(20,300,200,20);//x,y,w,h
		add(label);//�����̳ʿ� ������Ʈ���̱�
		
		rLabel=new Label("����",Label.RIGHT);
		gLabel=new Label("���",Label.RIGHT);
		bLabel=new Label("�Ķ�",Label.RIGHT);
		
		rsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255+10);
		gsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255+10);
		bsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255+10);
		//                 ����ũ�ѹ�           start��,��ũ�ѹٻ���ũ��,�ּҰ�,�ִ밪
		
		//�����̳ʿ� ������Ʈ ���̱�
		rLabel.setBounds(20,50,50,20);
		gLabel.setBounds(20,80,50,20);
		bLabel.setBounds(20,110,50,20);
		
		
		add(rLabel);
		add(gLabel);
		add(bLabel);
		
		rsb.setBounds(80,50,250,20);
		gsb.setBounds(80,80,250,20);
		bsb.setBounds(80,110,250,20);
		
		add(rsb);
		add(gsb);
		add(bsb);
		
		canvas=new Canvas();
		canvas.setBackground(new Color(0,0,0));
		canvas.setBounds(20,140,350,150);
		add(canvas);
		
		//�̺�Ʈ ���
		rsb.addAdjustmentListener(this);
		gsb.addAdjustmentListener(this);
		bsb.addAdjustmentListener(this);
		
		
		addWindowListener(new Mywin());
		setSize(400,400);
		setVisible(true);
	}//cons end
	
	//inner class
	class Mywin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}//inner class end
	
	//�޼���:�������̵�
	public void adjustmentValueChanged(AdjustmentEvent e){
		int r=rsb.getValue();//red ���󰪾��
		int g=gsb.getValue();//green ���󰪾��
		int b=bsb.getValue();//blue ���󰪾��
		
		Color color=new Color(r,g,b);
		canvas.setBackground(color);
		
		label.setText("red:"+r+"green:"+g+"blue:"+b);
	}//adjustmentValueChanged() end
	//main
	public static void main(String args[]){
		new Test09_scrollbar();
	}//main end
}//class end
