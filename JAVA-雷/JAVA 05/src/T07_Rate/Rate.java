package T07_Rate;

import java.applet.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * ����������Ϸֱ���5����ͬ��ɫ�����壬
 * �����Բ�ͬ���ٶ��˶����յ㣬��ͼ��
 * @author ��ҹ֮��
 *
 */

public class Rate extends Applet implements Runnable {
	private static final long serialVersionUID = 20190717233309L;
	static int v[]= {2,4,7,3,12};
	int s=0;
	int i=0;
	final Color c[]= {Color.YELLOW,Color.GREEN,Color.RED,Color.BLUE,Color.MAGENTA};

	@Override
	public void start() {
		setSize(1000,500);
		setLocation(300, 300);
		setVisible(true);
		Thread t=new Thread(this);
		t.start();
	}

	@Override
	public void paint(Graphics gg) {
		Canvas g=new Canvas() {
			private static final long serialVersionUID = 20190718133626L;

			@Override
			public void paint(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillRect(-1, -1, 3000, 3000);
				g.setColor(Color.CYAN);
				g.fillRect(0, 0, 1000, 500);
				g.setColor(Color.BLACK);
				g.drawRect(0, 0, 998, 498);
				for(int k=1; k<5; k++)
					g.drawLine(0, 100*k, 998, 100*k);
				g.setFont(new Font("����",Font.BOLD,40));
				for(int k=1; k<=5; k++)
					g.drawString(k+"", 20, 100*k-30);
				for(int k=1; k<=5; k++)
					if(60+v[k-1]*i<900) {
						g.setColor(c[k-1]);
						g.fillArc(60+v[k-1]*i, 100*k-80, 60+1, 60+1, 0, 360);
						g.setColor(Color.BLACK);
						g.drawArc(60+v[k-1]*i, 100*k-80, 60, 60, 0, 360);
					}
					else {
						g.setColor(c[k-1]);
						g.fillArc(900, 100*k-80, 60+1, 60+1, 0, 360);
						g.setColor(Color.BLACK);
						g.drawArc(900, 100*k-80, 60, 60, 0, 360);
					}
			}
		};
		g.update(gg);
	}

	@Override
	public void run() {
		while(s-31<410) {
			try {
				Thread.sleep(50);
				s++; i++;
				paint(this.getGraphics());
			} catch (InterruptedException e)
			{}
		}
	}
	
}
