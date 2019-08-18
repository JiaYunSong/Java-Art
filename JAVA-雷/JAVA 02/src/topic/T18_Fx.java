package topic;

import function.Mathe;
import function.Scan;

/**
 * 计算下列函数的值？其中，x值在程序中给定或从键盘输入。
 * @author 黎夜之梦
 *
 */

public class T18_Fx {
	public static void main(String[] args) {
		System.out.print("x=");
		int x=Scan.nextInt();
		double res=Mathe.Alg_nCubek(Math.E,x-1)*Math.cos(Math.PI/x);
		System.out.println("结果为："+res);
	}
}
