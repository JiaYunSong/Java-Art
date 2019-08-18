package T03_RandomBall;

import java.applet.*;
import java.awt.*;

/**
 * 在窗口内有两个随机运动球—绿色球和粉色球，
 * 当两球相遇时停止运动。 
 * @author 黎夜之梦
 *
 */

public class RandomBall extends Applet implements Runnable {
	private static final long serialVersionUID = 20190717163814L;
	int x1=0,y1=0,x2=0,y2=0,r=25;

	@Override
	public void start() {
		this.setSize(800,500);
		this.setLocation(300, 300);
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		Thread t=new Thread(this);
		t.start();
	}

	@Override
	public void paint(Graphics g) {
		x1=(int) (this.getWidth()*Math.random());
		y1=(int) (this.getHeight()*Math.random());
		x2=(int) (this.getWidth()*Math.random());
		y2=(int) (this.getHeight()*Math.random());
		g.setFont(new Font("宋体",Font.BOLD,30));
		g.setColor(Color.GREEN);
		g.fillArc(x1-r, y1-r, r*2, r*2, 0, 360);
		g.setColor(Color.BLUE);
		g.drawArc(x1-r, y1-r, r*2, r*2, 0, 360);
		g.setColor(Color.WHITE);
		g.drawString("A", x1-10, y1+10);
		g.setColor(Color.RED);
		g.fillArc(x2-r, y2-r, r*2, r*2, 0, 360);
		g.setColor(Color.BLUE);
		g.drawArc(x2-r, y2-r, r*2, r*2, 0, 360);
		g.setColor(Color.WHITE);
		g.drawString("B", x2-10, y2+10);
	}

	@Override
	public void run() {
		while(true) {
			try {
				repaint();
				Thread.sleep(50);
				if( (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2) < 4*r*r)
					break;
			} catch (InterruptedException e) {
			}
		}
	}
	
}
