package T02_Rocket;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * 用Applet程序中实现绘制下面的图形。 
 * 提示：
 *    A.图形为示意图形，具体尺寸和自定。
 *    B.图形显示Applet程序，具体程序名称自定。
 *    C.有关绘图可参考Graphics类。 
 *    
 * 预设：1cm:50
 * @author 黎夜之梦
 *
 */

public class Rocket extends Applet {
	private static final long serialVersionUID = 20190717151426L;

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void start() {
		this.setBackground(Color.WHITE);
		this.setSize(100+8*60,100+11*60);
		this.setVisible(true);
	}

	@Override
	public void stop() {
		super.stop();
	}

	@Override
	public void paint(Graphics g) {
		//g.fillRect(50, 50, 8*60, 11*60);
		
		{				//框架
			g.setColor(new Color(204,102,0));
			g.fillRect(50, 50+11*60-12, 480, 12);
			
			g.setColor(new Color(102,153,0));
			g.fillRect(50+30, 50, 3*60, 11*60-12);
			g.setColor(new Color(153,204,255));
			g.fillRect(50+30+12, 50+12, 3*60-24, 11*60-24);
			
			g.setColor(Color.lightGray);
			g.fillRect(50+30+3*60, 50+11*60-12-30, 35*6-30, 30);
		}
		
		{				//火箭
			g.setColor(new Color(0,176,80));
			g.fillArc(320, 668-103*6, 60+1, 13*6*2, 0, 180);
			g.setFont(new Font("宋体", Font.BOLD, 30));
			g.drawString("农", 320+15, 50+60*3);
			g.drawString("大", 320+15, 50+60*3+30);
			g.drawString("航", 320+15, 50+60*3+60);
			g.drawString("空", 320+15, 50+60*3+90);
			g.setColor(Color.lightGray);
			g.fillRect(290+30, 668-90*6, 60, 30-1);
			
			g.setColor(new Color(255,0,102));
			int a[]= {290,290+15,320};
			int b[]= {668-240,668-240-42,668-240};
			g.fillPolygon(a,b,3);
			int c[]= {290+60*2-30,290+15+60*2-30,320+60*2-30};
			int d[]= {668-240,668-240-42,668-240};
			g.fillPolygon(c,d,3);
			
			g.setColor(Color.BLUE);
			g.drawRect(290, 668-240, 30, 240-1);
			g.drawRect(290+60*2-30, 668-240, 30, 240-1);
			g.drawRect(290+30, 668-85*6, 60, 85*6-1);
			g.drawRect(290+30, 668-90*6, 60, 30-1);
			g.drawArc(320, 668-103*6, 60, 13*6*2, 0, 180);
			g.drawLine(290, 668-240, 290+15, 668-240-42);
			g.drawLine(290+15, 668-240-42, 320, 668-240);
			g.drawLine(290+60*2-30, 668-240, 290+15+60*2-30, 668-240-42);
			g.drawLine(290+15+60*2-30, 668-240-42, 320+60*2-30, 668-240);
			
			g.setColor(Color.WHITE);
			g.fillRect(290+30, 668-50*6, 60+1, 22-1);
			g.setColor(Color.lightGray);
			g.fillRect(290+30+2, 668-50*6+2, 60+1-4, 22-1-4);
		}
	}

}
