package sharp;

import function.Sharp;
import function.SharpT;

/**
 * 三角形-直角坐标系
 * @author 黎夜之梦
 *
 */

public class Triangle extends SharpT{
	/**
	 * 默认边数
	 */
	public static int broad=3;
	/**
	 * 三角形构造方法
	 */
	public Triangle() {
		/**
		 * 默认边数
		 */
		super(broad);
	}
	public Triangle(double[][] tt) {
		t=tt;
	}
	/**
	 * 三角形面积
	 */
	public double Area() {
		return Sharp.TriangleArea(t);
	}
}