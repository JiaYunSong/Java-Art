package T09_DrawBrick;

import java.awt.*;
import javax.swing.*;

/**
 * ��ϸ��������ͼ�Σ�д������ͼ�ε�Java�ಢ���Ƹ�ͼ�Ρ�
 * @author ��ҹ֮��
 *
 */

public class DrawBrick {

	public static void main(String[] args) {
		JFrame w=new JFrame() {
			private static final long serialVersionUID = 20190712092230L;

			@Override
			public void paint(Graphics g) {
				g.drawString("???", 0, 0);
				
				g.setColor(Color.ORANGE);						//����
				g.fillRect(300, 260, 200, 200);
				g.setColor(Color.BLACK);
				g.drawRect(300, 260, 200, 200);
				
				Trapezoid.DrawTrapezoid(g, 300, 100, 40, 1);	//����
				Trapezoid.DrawTrapezoid(g, 300, 500, 40, 2);
				Trapezoid.DrawTrapezoid(g, 180, 260, 40, 3);
				Trapezoid.DrawTrapezoid(g, 500, 260, 40, 4);
				
				g.setColor(Color.BLACK);						//����
				g.fillRect(395, 220, 10, 40);
				g.setColor(Color.BLACK);
				g.fillRect(395, 460, 10, 40);
			}
		};
		w.setLocation(450, 200);
		w.setTitle("����ͼ��");
		w.setSize(800, 700);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}

}

class Trapezoid{			//����
	static public void DrawTrapezoid(Graphics g,int x,int y,int n,int i) {
		int num[][][]= {
				{{0,0},{5*n,0},{4*n,3*n},{1*n,3*n}},	//��
				{{0,3*n},{5*n,3*n},{4*n,0},{1*n,0}},	//��
				{{3*n,0},{3*n,5*n},{0,4*n},{0,1*n}},	//��
				{{0,0},{0,5*n},{3*n,4*n},{3*n,1*n}},	//��
				
		};
		Color c[]= {Color.CYAN,Color.CYAN,Color.RED,Color.RED};  //��ɫ��
		Polygon po=new Polygon();
		for(int j=0; j<4; j++)
			po.addPoint(num[i-1][j][0]+x,num[i-1][j][1]+y);
		g.setColor(c[i-1]);
		g.fillPolygon(po);
		g.setColor(Color.BLACK);			//���
		g.drawPolygon(po);
	}
}