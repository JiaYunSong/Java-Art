package applet_using;

import java.applet.*;
import java.awt.*;

//JApplet比Applet好，能加入swing的类

public class Applet_test extends Applet{
	/**
	 * Applet小程序
	 */
	private static final long serialVersionUID = 1408863528059937183L;
	String msg;
	Font f;
	Color c;
	public void init() {
		msg="Hello World";
		f=new Font("宋体",Font.PLAIN,16);
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
