package ch19_applet;

import java.awt.*;

public class Test02_font extends java.applet.Applet
{
	public void paint(Graphics g){
		int baseLine=100;//변수
		g.setColor(Color.red);
		g.drawLine(50,baseLine,250,baseLine);
		//         x1   y1       x2 y2
		
		g.setFont(new Font("Dialog",Font.BOLD,30));
			g.setColor(Color.blue);
		g.drawString("자바 안녕 hi good ", 50, baseLine);
	}
}

