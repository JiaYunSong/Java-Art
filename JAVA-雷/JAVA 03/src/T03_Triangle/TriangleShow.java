package T03_Triangle;

import function.Sharp;
import sharp.Triangle;

/**
 * 设计Java类表示三角形，要求提供三种实例化方式，即由三个顶点A(x,y)、B(x,y)和C(x,y)实例化，
 * 或由底边长度和高度实例化，或由三个边长实例化。实现三角形周长和面积计算，在屏幕绘制三角形？提示：要考虑该类可能会被用做父类。
 * @author 黎夜之梦
 *
 */

public class TriangleShow {
	
	public static void main(String[] args) {
		Sharp.nCubeJFrame(new Triangle(), "三角形");
	}

}
