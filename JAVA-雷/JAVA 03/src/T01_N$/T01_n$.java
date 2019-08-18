package T01_N$;

import function.Mathe;
import function.Scan;

/**
 * 阶乘函数f(n)=n!,其中n为正整数。试设计一个计算阶乘类Factorial，计算任意整数的阶乘。
 * @author 黎夜之梦
 *
 */

public class T01_n$ {

	public static void main(String[] args) {
		int n=Scan.nextInt("n=");
		System.out.println("n!="+(int)Mathe.Alg_n$(n));
	}

}
