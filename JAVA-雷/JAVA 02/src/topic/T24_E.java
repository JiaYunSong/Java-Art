package topic;

import function.Mathe;

/**
 * 计算对数底数e的近似值：
 * 计算并显示当n=10000,20000,100000时e的值。
 * @author 黎夜之梦
 *
 */

public class T24_E {

	public static void main(String[] args) {
		int num[]= {10000,20000,100000};
		double E;
		for(int n:num) {
			E=1;
			for(int i=1; i<=n; i++)
				E=E+(double)1/Mathe.Alg_n$(i);
			System.out.println("E("+n+")="+E);
		}
	}

}
