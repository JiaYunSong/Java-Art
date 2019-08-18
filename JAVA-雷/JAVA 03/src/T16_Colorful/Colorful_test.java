package T16_Colorful;

import java.awt.*;
import javax.swing.*;

/**
 * 考察下面的几何图形，找出对象，
 * 设计Java类描述这些对象，并绘制出该图（位置和尺寸自定）。
 * 提示：
 * (1)可以考虑使用前面题目中设计的类 。
 * (2)有关绘图操作参考Graphisc类、Color类
 * @author 黎夜之梦
 *
 */

public class Colorful_test extends JFrame{
	private static final long serialVersionUID = 20190716153044L;
	
	public static void main(String[] args) {
		Colorful_test c=new Colorful_test();
		c.setVisible(true);
		c.setTitle("Colorful Life");
		c.setSize(1100, 600);
		c.setLocation(600, 200);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Rect_1.f(g, 50, 50, Color.GREEN);
		Rect_1.f(g, 950, 50, Color.GREEN);
		Rect_1.f(g, 50, 450, Color.MAGENTA);
		Rect_1.f(g, 950, 450, Color.MAGENTA);
		
		Rect_2.f(g, 50, 260);
		Rect_2.f(g, 950, 260);
		
		Round.f(g, 550, 300, 250, Color.RED);
		
		Round_x.f(g, 550, 300, -6*7, 2*7, 7);
		Round_x.f(g, 550, 300, -6*7+180, 2*7, -7);
	}
}

class Rect_1{
	static void f(Graphics g,int x,int y,Color c) {
		g.setColor(c);
		g.fillRect(x, y, 100, 100);
	}
}

class Rect_2{
	static void f(Graphics g,int x,int y) {
		Rect_2_1.f(g, x+0, y+0, Color.WHITE);
		Rect_2_1.f(g, x+10, y+10, Color.RED);
		Rect_2_1.f(g, x+20, y+20, Color.BLUE);
		Rect_2_1.f(g, x+30, y+30, Color.GREEN);
	}
}

class Rect_2_1{
	static void f(Graphics g,int x,int y,Color c) {
		g.setColor(c);
		g.fillRect(x, y, 70, 50);
		g.setColor(Color.RED);
		g.drawRect(x, y, 70, 50);
	}
}

class Round_x{
	static void f(Graphics g,int x,int y,int sa,int angle,int n) {
		int r=35;
		Color c[]= {Color.MAGENTA,Color.GREEN,Color.BLUE,
				Color.PINK,Color.ORANGE,Color.BLUE,Color.MAGENTA};
		if(n>0)
			for(int i=0; i<n; i++)
				Round.f(g,(int)( x+Math.cos(Math.toRadians(sa+i*angle))*(250+r)), 
						(int)( y+Math.sin(Math.toRadians(sa+i*angle))*(250+r)), r, c[i]);
		
		else if(n<0){
			n=-n;
			for(int i=0; i<n; i++)
				Round.f(g,(int)( x+Math.cos(Math.toRadians(sa+i*angle))*(250+r)), 
						(int)( y+Math.sin(Math.toRadians(sa+i*angle))*(250+r)), r, c[6-i]);
		}
	}
}

class Round{
	static void f(Graphics g,int x,int y,int r,Color c) {
		g.setColor(c);
		g.fillArc(x-r, y-r, r*2, r*2, 0, 360);
		g.setColor(Color.YELLOW);
		g.drawArc(x-r, y-r, r*2, r*2, 0, 360);
	}
}