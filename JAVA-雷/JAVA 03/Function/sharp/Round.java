package sharp;

import function.Points;
import function.Scan;
import function.Sharp;
import function.SharpT;

/**
 * 圆形-直角坐标系
 * @author 黎夜之梦
 *
 */

public class Round extends SharpT{
	/**
	 * 默认边数
	 */
	public static int broad=1;
	/**
	 * 圆形构造方法
	 * t[0]为圆心
	 * t[1][0]与t[1][1]均为R
	 */
	public Round() {
		char point_name='O';
		t=new double[2][2];
		t[0]=Points.In(Character.toString((char)(point_name++)));
		t[1][0]=t[1][1]=Scan.nextDouble("R=");
	}
	/**
	 * 圆形-点边集
	 */
	public Round(double[][] tt) {
		t=tt;
	}
	/**
	 *  圆形-点与边
	 */
	public Round(double[] a,double r) {
		t=new double[2][2];
		t[0]=a;
		t[1][0]=t[1][1]=r;
	}
	
	/**
	 * 圆形周长
	 */
	public double Length(){
		return Sharp.RoundLength(t[1][0]);
	}
	/**
	 * 圆形面积
	 */
	public double Area() {
		return Sharp.RoundArea(t[1][0]);
	}
}
