package topic;

import function.Points;
import function.Sharp;

/**
 * 有一三角形的三个顶点A(x,y)、B(x,y)和C(x,y)，
 * 编写程序从键盘输入三个顶点的坐标，
 * 然后计算这个三角形的三个边长和面积？
 * @author 黎夜之梦
 *
 */

public class T12_PointArea {
	public static void main(String[] args) {
		double A[],B[],C[];
		System.out.println("请输入A,B,C三点坐标：");
		A=Points.In("A");
		B=Points.In("B");
		C=Points.In("C");
		Sharp.TriangleArea(A,B,C);
	}

}
