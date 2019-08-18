package T14_IsPrimeNumber;

import function.Mathe;
import function.Scan;

/**
 * 设计一个Java类实现对任意整数N判断其是否为素数，
 * 类名称IsPrimeNumber。
 * @author 黎夜之梦
 *
 */

public class IsPrimeNumber_test {

	public static void main(String[] args) {
		int n=Scan.nextInt("N=");
		System.out.println(n+" is primenumber is "+Mathe.IsPrime(n));
	}

}
