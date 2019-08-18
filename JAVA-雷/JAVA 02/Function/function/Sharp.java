package function;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * 图形类计算
 * @author 黎夜之梦
 *
 */

public class Sharp {
	/**
	 * 三角形三边：double t[]
	 * 计算面积
	 */
	static public double TriangleArea(double t[]) {
		double a=t[0],b=t[1],c=t[2];
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	/**
	 * 三角形底和高：double a,double h
	 * 计算面积
	 */
	static public double TriangleArea(double a,double h) {
		return a*h/2;
	}
	/**
	 * 三角形三边：double a,double b,double c
	 * 计算面积
	 */
	static public double TriangleArea(double a,double b,double c) {
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	/**
	 * 三角形坐标推出三角形面积：double A[],double B[],double C[]
	 */
	public static double TriangleArea(double A[],double B[],double C[]) {
		double a,b,c;
		a=Points.Length(B, C);
		b=Points.Length(A, C);
		c=Points.Length(A, B);
		double Area=Sharp.TriangleArea(a, b, c);
		return Area;
	}
	/**
	 * 三角形坐标推出三角形面积：double A[],double B[],double C[]
	 */
	public static double TriangleArea(double t[][]) {
		return Sharp.TriangleArea(t[0], t[1], t[2]);
	}
	/**
	 * 三角形坐标推出三角形周长：double A[],double B[],double C[]
	 */
	public static double TriangleLength(double A[],double B[],double C[]) {
		double a,b,c;
		a=Points.Length(B, C);
		b=Points.Length(A, C);
		c=Points.Length(A, B);
		return a+b+c;
	}
	/**
	 * 圆的周长
	 */
	static public double RoundLength(double r) {
		return 2*Math.PI*r;
	}
	/**
	 * 圆的面积
	 */
	static public double RoundArea(double r) {
		return Math.PI*r*r;
	}
	/**
	 * 正多边形的面积:s是边长，n为边数
	 */
	static public double nRegCubeArea(double n,double s) {
		return n*s*s/(4*Math.tan(Math.PI/n));
	}
	/**
	 * 多边形的周长
	 * double t[][]-点集
	 */
	static public double nCubeLength(double t[][]) {
		double sum=Points.Length(t[0], t[t.length-1]);
		for(int i=0; i<t.length-1; i++)
			sum=sum+Points.Length(t[i], t[i+1]);
		return sum;
	}
	/**
	 * 多点绘图
	 * Graphics g-图纸
	 * double t[][]-点集
	 * int x_Loc-位置
	 * int y_Loc-位置
	 */
	static public void nCubePaint(Graphics g,double t[][],int x_Loc,int y_Loc) {
		g.setColor(Color.GREEN);
		g.fillRect(x_Loc-10, y_Loc-10, 10, 10);
		for(int i=0; i<30; i++)
			g.drawLine(x_Loc+100*i,y_Loc,x_Loc+100*i,3000);
		for(int i=0; i<30; i++)
			g.drawLine(x_Loc,y_Loc+100*i,3000,y_Loc+100*i);
		
		if(t.length==2) {			//圆
			g.setColor(Color.BLACK);
			g.drawArc((int)(t[0][0]-t[1][0])*100+x_Loc, (int)(t[0][1]-t[1][0])*100+y_Loc, (int)t[1][0]*200, (int)t[1][0]*200, 0, 360);
		}
		else {						//多边形
			g.setColor(Color.BLACK);
			g.drawLine((int)t[0][0]*100+x_Loc, (int)t[0][1]*100+y_Loc, (int)t[t.length-1][0]*100+x_Loc, (int)t[t.length-1][1]*100+y_Loc);
			for(int i=0; i<t.length-1; i++)
				g.drawLine((int)t[i][0]*100+x_Loc, (int)t[i][1]*100+y_Loc, (int)t[i+1][0]*100+x_Loc, (int)t[i+1][1]*100+y_Loc);
		}
	}
	/**
	 * 界面绘图
	 * Graphics g-图纸
	 * double t[][]-点集
	 * int x_Loc-位置
	 * int y_Loc-位置
	 * SharpB tx-图形
	 */
	static public void nCubeJFrame(SharpT tx,String name) {
		class Show extends JFrame {
			/**
			 * 时间戳
			 */
			private static final long serialVersionUID = 20190711113636L;
			/**
			 * 多边形接口
			 */
			SharpT t;
			/**
			 * 输入图形
			 */
			public Show(SharpT tx) {
				t=tx;
			}
			/**
			 * 重绘
			 */
			public void paint(Graphics g) {
				super.paint(g);
				g.setFont(new Font("宋体",Font.PLAIN,27));
				g.setColor(Color.RED);
				g.drawString("边长："+Mathe.DoubleKill(t.Length(), 7)+"     面积："+Mathe.DoubleKill(t.Area(), 7), 20, 60);
				
				double tx[][]=t.getPoints();
				Sharp.nCubePaint(g, tx, 20, 80);
			}
		};
		
		Show s=new Show(tx);
		s.setTitle(name+"显示");
		s.setLocation(10, 10);
		s.setSize(1000,600);
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		s.repaint();
	}
}
