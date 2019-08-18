package T13_Fibonancii;

import function.Mathe;
import function.Scan;

/**
 * Fibonancii级数形式：1,1,2,3,5,8,13,21,34,......，
 * 其中X1=X2=1，Xi=X(i-1)+X(i-2)。
 * 设计Fibonancii类，实现计算级数第N项和返回前N项。
 * @author 黎夜之梦
 *
 */

public class Fibonancii_test {

	public static void main(String[] args) {
		int n=Scan.nextInt("n=");
		System.out.println("Fibonancii["+n+"]="+Mathe.Fibonancii(n));
		for(int i=1; i<=n; i++) {
			System.out.print("["+Mathe.Fibonancii(i)+"]");
		}
	}

}
