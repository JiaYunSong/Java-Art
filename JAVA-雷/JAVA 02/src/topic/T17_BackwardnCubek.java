package topic;

import function.Mathe;
import function.Scan;

/**
 * 1/x^1+1/x^2+1/x^3+1/x^4
 * @author 黎夜之梦
 *
 */

public class T17_BackwardnCubek {

	public static void main(String[] args) {
		double sum=0;
		System.out.print("x=");
		int x=Scan.nextInt();
		for(int i=1; i<5; i++)
			sum=sum+1/Mathe.Alg_nCubek(x, i);
		System.out.println("结果为："+sum);
	}

}
