package sharp;

import function.SharpT;

/**
 * 矩形-直角坐标系
 * @author 黎夜之梦
 *
 */

public class Rectangle extends SharpT{
	/**
	 * 默认边数
	 */
	public static int broad=4;
	/**
	 * 矩形构造方法
	 */
	public Rectangle() {
		super(broad);
	}
	/**
	 * 矩形-点集
	 */
	public Rectangle(double[][] tt) {
		t=tt;
	}
	/**
	 * 矩形-底和高
	 */
	public Rectangle(double a,double h) {
		t=new double[4][2];
		t[0][0]=t[0][1]=t[1][1]=t[3][0]=0;
		t[2][0]=t[1][0]=a;
		t[2][1]=t[3][1]=h;
	}
	/**
	 * 三角形面积
	 */
	public double Area() {
		return (t[0][0]-t[2][0])*(t[0][1]-t[2][1]);
	}
}