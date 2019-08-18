package topic;

import function.Mathe;

/**
 * 阶乘函数f(n)=n!,其中n为正整数。
 * 试设计一个计算阶乘的方法，并计算f(5)和f(10)的值。
 * @author 黎夜之梦
 *
 */

public class T21_n$ {

	public static void main(String[] args) {
		int a=5,b=10;
		System.out.println("5!="+(int)Mathe.Alg_n$(a));
		System.out.println("10!="+(int)Mathe.Alg_n$(b));
	}

}
