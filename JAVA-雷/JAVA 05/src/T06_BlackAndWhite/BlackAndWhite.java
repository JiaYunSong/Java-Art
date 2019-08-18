package T06_BlackAndWhite;

import java.applet.*;
import java.awt.*;

/**
 * ��д����ʵ�ֻ�������ͼ��˫ɫ������ͼ��
 * ��ʾ����ɫ�����Զ��壬���硰��-�ס���
 * @author ��ҹ֮��
 *
 */

public class BlackAndWhite extends Applet {
	private static final long serialVersionUID = 20190717222619L;
	
	static Color c1=Color.YELLOW;
	static Color c2=Color.ORANGE;

	@Override
	public void start() {
		setSize(800,600);
		setLocation(300, 300);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		setBackground(c1);
		g.setColor(c2);
		for(int i=0; i<this.getWidth()/50+2; i++)
			for(int j=0; j<this.getHeight()/50+2; j++)
				if((i+j)%2 == 1)
					g.fillRect(50*i, 50*j, 50, 50);
	}
	
}
