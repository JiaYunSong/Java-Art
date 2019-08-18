package topic;

import function.Mathe;
import function.Scan;

/**
 * 利用下列公式计算x的sin和cos值。
 * @author 黎夜之梦
 *
 */

public class T31_SinCosSum {

	public static void main(String[] args) {
		double sum=0,x=Scan.nextDouble("x=");
		for(int i=0; i<=100; i++)
			sum=sum+Mathe.Alg_nCubek(-1,i)*Mathe.Alg_nCubek(x, 2*i+1)/Mathe.Alg_n$(2*i+1);
		System.out.println("sin("+x+")="+Mathe.DoubleKill(sum, 3));
		sum=0;
		for(int i=0; i<=100; i++)
			sum=sum+Mathe.Alg_nCubek(-1,i)*Mathe.Alg_nCubek(x, 2*i)/Mathe.Alg_n$(2*i);
		System.out.println("cos("+x+")="+Mathe.DoubleKill(sum, 3));
	}

}
