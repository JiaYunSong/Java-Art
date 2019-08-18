package topic;

import function.Mathe;

/**
 * 求解一元二次方程的两个实根x1、x2，该方程的系数是a=2 b=-4 c=1。
 * @author 黎夜之梦
 *
 */
public class T08_Ratio {

	public static void main(String[] args) {
		double a=2,b=-4,c=1;
		System.out.println("x1="+Mathe.abc_X1(a, b, c));
		System.out.println("x2="+Mathe.abc_X2(a, b, c));
	}

}
