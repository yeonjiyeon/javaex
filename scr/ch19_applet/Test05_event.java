package ch19_applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Test05_event extends Applet implements ActionListener
{
	//변수
	int num=5;
	Image im[]=new Image[num];
	Button bPre, bNext; //이전버튼,다음버튼
	int select=0;//선택된 그림의 index로 사용
	
	public void init(){//생성자와 같은 기능
		bPre=new Button("이전그림");
		bPre.addActionListener(this);
		add(bPre);//애플릿 창에 버튼 붙잉
		
		bNext=new Button("다음 그림");
		bNext.addActionListener(this);
		add(bNext);
		
		for(int i=0;i<num;i++){
			String imgName="t"+(i+1)+".jpg";
		im[i]=getImage(getDocumentBase(),imgName);
		}//for
	}//init() end

	//오버라이딩
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
		repaint(); //다시 그리기
	}//actionPerformed()end

	public void paint(Graphics g)
	{
		g.drawImage(im[select],0,0,this);
	}
}

