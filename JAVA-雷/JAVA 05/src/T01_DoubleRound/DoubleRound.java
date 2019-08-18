package T01_DoubleRound;

import java.applet.*;
import java.awt.*;

/**
 * ��������ͼ���л�ɫ���ֵ������
 * ��дapplet����ͼ�β���ʾ��������
 * @author ��ҹ֮��
 *
 */

public class DoubleRound extends Applet {
	private static final long serialVersionUID = 20190717145044L;

	@Override
	public void init() {
		super.init();
	}

	@Override
	public void start() {
		this.setLocation(800, 400);
		this.setSize(1100, 1100);
		this.setVisible(true);
	}

	@Override
	public void stop() {
		super.stop();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillArc(550-459, 550-459, 459*2, 459*2,0,360);
		g.setColor(Color.WHITE);
		g.fillArc(550-193, 550-193, 193*2, 193*2,0,360);
		g.setColor(Color.BLACK);
		g.drawArc(550-459, 550-459, 459*2, 459*2,0,360);
		g.drawArc(550-193, 550-193, 193*2, 193*2,0,360);
		g.setFont(new Font("����", Font.BOLD, 25));
		g.drawString("�ܳ���"+2*(459.23+193.09)*Math.PI+
				"             �����"+(459.23*459.23+193.09*193.09)*Math.PI, 70, 70);
		g.drawLine(550, 550, 550, 550-459);
		g.setFont(new Font("����", Font.BOLD, 30));
		g.drawString("459.23m", 560, 560-300);
		g.drawLine(550, 550, 550+193, 550);
		g.drawString("193.09m", 550+50, 560-10);
		g.fillArc(550-5, 550-5, 10, 10, 0, 360);
	}
	
}
