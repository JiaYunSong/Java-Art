package jDrawInThread;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JDrawInThread {

	public static void main(String[] args) {
			JFrame w=new JFrame("在线程中绘图");
			w.setLocation(800, 400);
			w.setSize(600,400);
			w.setVisible(true);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			DrawRunnable d1=new DrawRunnable(w,1);
			DrawRunnable d2=new DrawRunnable(w,2);
			Thread t1=new Thread(d1),t2=new Thread(d2);
			t1.start();    t2.start();
	}

}

class DrawRunnable implements Runnable{
	private JFrame win;
	private int x,y,w=40,h=30;
	private int shape;
	private boolean isStop=false;
	
	public DrawRunnable(JFrame f,int s) {
		win=f; shape=s;
		if(shape==1) {
			x=0;
			y=win.getHeight()/2;
		}
		else {
			x=win.getWidth()/2;
			y=0;
		}
	}

	@Override
	public void run() {
		while(isStop==false) {
			SwingUtilities.invokeLater(()->drawShape());
			//drawShape();
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {}
		}
	}
	public void drawShape() {
		Graphics g=win.getGraphics();
		if(shape==1) {
			g.setColor(Color.WHITE);
			g.fillRect(x, y, w, h);
			
			g.setColor(Color.BLACK);
			g.drawRect(x, y, w, h);
		}
		else {
			g.setColor(Color.GRAY);
			g.fillOval(x, y, w, h);
			
			g.setColor(Color.BLACK);
			g.drawOval(x, y, w, h);
		}
		if(shape==1)	x+=w;
		else			y+=h;
		if(x>=win.getWidth()||y>=win.getHeight())
			isStop=true;
	}
}