package Thread;

import java.applet.Applet;
import java.awt.*;

public class Draw extends Applet{
	private static final long serialVersionUID = 20190717095726L;

	@Override
	public void start() {
		this.setSize(600, 600);
		this.setVisible(true);
	}

	@Override
	public void init() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(50, 50, 500, 500);
		g.drawRect(50, 50, 500, 500);
		g.drawLine(0, 0, 500, 500);
	}
	
}
