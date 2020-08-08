package ch19_applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Test05_event extends Applet implements ActionListener
{
	//����
	int num=5;
	Image im[]=new Image[num];
	Button bPre, bNext; //������ư,������ư
	int select=0;//���õ� �׸��� index�� ���
	
	public void init(){//�����ڿ� ���� ���
		bPre=new Button("�����׸�");
		bPre.addActionListener(this);
		add(bPre);//���ø� â�� ��ư ����
		
		bNext=new Button("���� �׸�");
		bNext.addActionListener(this);
		add(bNext);
		
		for(int i=0;i<num;i++){
			String imgName="t"+(i+1)+".jpg";
		im[i]=getImage(getDocumentBase(),imgName);
		}//for
	}//init() end

	//�������̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bNext){
			select++;
			if(select==5){
				select=0;
			}
		}else if(e.getSource()==bPre){
			if(select==0){
				select=5;
			}//if
			select--;
		}
		repaint(); //�ٽ� �׸���
	}//actionPerformed()end

	public void paint(Graphics g)
	{
		g.drawImage(im[select],0,0,this);
	}
}

