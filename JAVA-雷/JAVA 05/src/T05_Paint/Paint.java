package T05_Paint;

import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * ��appletʵ������ҳ�еļ򵥻�ͼ���ߡ�
 * �������ƶ����ͬʱ������������һ��Ԥ��ָ������ɫ��ͼ������ͼʾ��
 * @author ��ҹ֮��
 *
 */

public class Paint extends Applet {
	private static final long serialVersionUID = 20190717211614L;

	@Override
	public void start() {
		setSize(800,600);
		setLocation(300, 300);
		setBackground(Color.BLACK);
		setVisible(true);
		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				Graphics g=getGraphics();
				g.setColor(new Color(e.getX()%256, e.getY()%256,e.getX()*e.getY()%255));
				g.drawRect(e.getX(), e.getY(), 1, 1);
			}

			@Override
			public void mouseMoved(MouseEvent e) {}
		});
	}
	
}
