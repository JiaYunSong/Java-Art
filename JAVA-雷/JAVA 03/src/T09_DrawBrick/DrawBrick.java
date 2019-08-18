package T09_DrawBrick;

import java.awt.*;
import javax.swing.*;

/**
 * 仔细分析下面图形，写出描述图形的Java类并绘制该图形。
 * @author 黎夜之梦
 *
 */

public class DrawBrick {

	public static void main(String[] args) {
		JFrame w=new JFrame() {
			private static final long serialVersionUID = 20190712092230L;

			@Override
			public void paint(Graphics g) {
				g.drawString("???", 0, 0);
				
				g.setColor(Color.ORANGE);						//矩形
				g.fillRect(300, 260, 200, 200);
				g.setColor(Color.BLACK);
				g.drawRect(300, 260, 200, 200);
				
				Trapezoid.DrawTrapezoid(g, 300, 100, 40, 1);	//梯形
				Trapezoid.DrawTrapezoid(g, 300, 500, 40, 2);
				Trapezoid.DrawTrapezoid(g, 180, 260, 40, 3);
				Trapezoid.DrawTrapezoid(g, 500, 260, 40, 4);
				
				g.setColor(Color.BLACK);						//连线
				g.fillRect(395, 220, 10, 40);
				g.setColor(Color.BLACK);
				g.fillRect(395, 460, 10, 40);
			}
		};
		w.setLocation(450, 200);
		w.setTitle("绘制图形");
		w.setSize(800, 700);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}

}

class Trapezoid{			//梯形
	static public void DrawTrapezoid(Graphics g,int x,int y,int n,int i) {
		int num[][][]= {
				{{0,0},{5*n,0},{4*n,3*n},{1*n,3*n}},	//上
				{{0,3*n},{5*n,3*n},{4*n,0},{1*n,0}},	//下
				{{3*n,0},{3*n,5*n},{0,4*n},{0,1*n}},	//左
				{{0,0},{0,5*n},{3*n,4*n},{3*n,1*n}},	//右
				
		};
		Color c[]= {Color.CYAN,Color.CYAN,Color.RED,Color.RED};  //颜色集
		Polygon po=new Polygon();
		for(int j=0; j<4; j++)
			po.addPoint(num[i-1][j][0]+x,num[i-1][j][1]+y);
		g.setColor(c[i-1]);
		g.fillPolygon(po);
		g.setColor(Color.BLACK);			//描边
		g.drawPolygon(po);
	}
}