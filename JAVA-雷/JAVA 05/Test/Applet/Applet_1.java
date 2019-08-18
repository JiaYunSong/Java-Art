package Applet;
import java.applet.*;
import java.awt.*;

public class Applet_1 extends Applet implements Runnable{
	private static final long serialVersionUID = 20190717082527L;
	
	private Image jinli;
	int  L1,L2;     //上下底边
	int  H;         //高
	int  S;         //面积
	int  L;         //周长

	@Override
	public void init()
	{
//		L1=Integer.parseInt(getParameter("L1"));
//		L2=Integer.parseInt(getParameter("L2"));
//		H=Integer.parseInt(getParameter("H"));
//		return;
	}
	
	@Override
	public void start() {
		jinli=getImage(getCodeBase(),"./Applet/3.jpg");
		this.setSize(800,500);
		this.setLocation(300, 300);
		this.setVisible(true);
		Thread t=new Thread(this);
		t.start();
	}
	
	@Override
	public void stop() {
		
	}
	
	@Override
	public void paint(Graphics g) {
		int a=(int)(this.getWidth()*Math.random());
		int b=(int)(this.getHeight()*Math.random());
		g.drawImage(jinli, (int)((this.getWidth()-a)*Math.random()), (int)((this.getHeight()-b)*Math.random()), a, b, this);
	}

	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(1);
				paint(this.getGraphics());
			} catch (InterruptedException e) {
			}
		}
	}

}
