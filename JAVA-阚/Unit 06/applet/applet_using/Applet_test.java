package applet_using;

import java.applet.*;
import java.awt.*;

//JApplet��Applet�ã��ܼ���swing����

public class Applet_test extends Applet{
	/**
	 * AppletС����
	 */
	private static final long serialVersionUID = 1408863528059937183L;
	String msg;
	Font f;
	Color c;
	public void init() {
		msg="Hello World";
		f=new Font("����",Font.PLAIN,16);
		c=Color.RED;
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(f);
		g.drawString(msg, 20, 40);
		g.setColor(c);
		g.fillRect(20, 60, 100, 100);
	}
}
