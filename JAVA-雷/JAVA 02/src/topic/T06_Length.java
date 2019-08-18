package topic;

import function.Points;

/**
 * 编写程序，提示输入两点（x1,y1）和（x2,y2），然后计算两点之间的距离。
 * 使用了正则表达式
 * @author 黎夜之梦
 *
 */

public class T06_Length {
	public static void main(String[] args) {
		System.out.println("请输入两点坐标————");
		double a[]={0,0},b[]={0,0},length;
		a=Points.In("A");
		b=Points.In("B");
		length=Points.Length(a,b);
		System.out.println("两点距离为："+length);
	}
}
