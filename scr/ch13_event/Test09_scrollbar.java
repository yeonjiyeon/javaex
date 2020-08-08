package ch13_event;
import java.awt.*;
import java.awt.event.*;
public class Test09_scrollbar extends Frame implements AdjustmentListener{
	//변수
	Scrollbar rsb,gsb,bsb;
	Label rLabel,gLabel,bLabel,label;
	Canvas canvas;//도화지기능
	
	
	//생성자
	public Test09_scrollbar(){
		super("scrollbar 예제");
		
		//프로그래머가 Layout 직접하기
		setLayout(null);
		
		label=new Label("");
		label.setBackground(Color.yellow);
		label.setBounds(20,300,200,20);//x,y,w,h
		add(label);//컨테이너에 컴포넌트붙이기
		
		rLabel=new Label("빨강",Label.RIGHT);
		gLabel=new Label("녹색",Label.RIGHT);
		bLabel=new Label("파랑",Label.RIGHT);
		
		rsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255+10);
		gsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255+10);
		bsb=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255+10);
		//                 수평스크롤바           start값,스크롤바상자크기,최소값,최대값
		
		//컨테이너에 컴포넌트 붙이기
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
		
		//이벤트 등록
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
	
	//메서드:오버라이딩
	public void adjustmentValueChanged(AdjustmentEvent e){
		int r=rsb.getValue();//red 색상값얻기
		int g=gsb.getValue();//green 색상값얻기
		int b=bsb.getValue();//blue 색상값얻기
		
		Color color=new Color(r,g,b);
		canvas.setBackground(color);
		
		label.setText("red:"+r+"green:"+g+"blue:"+b);
	}//adjustmentValueChanged() end
	//main
	public static void main(String args[]){
		new Test09_scrollbar();
	}//main end
}//class end
