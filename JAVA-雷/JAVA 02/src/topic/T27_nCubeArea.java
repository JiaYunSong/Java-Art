package topic;

import function.Mathe;
import function.Scan;
import function.Sharp;

/**
 * 计算正多边形的面积：
 * 其中，s是边长，n为边数，S多边形面积。
 * @author 黎夜之梦
 *
 */

public class T27_nCubeArea {

	public static void main(String[] args) {
		System.out.print("n=");
		int n=Scan.nextInt();
		System.out.print("s=");
		double s=Scan.nextDouble();
		double area=Sharp.nRegCubeArea(n, s);
		System.out.println("Area="+Mathe.DoubleKill(area, 10));
	}

}
