package topic;

import function.Mathe;
import function.Scan;

/**
 * 有整数M，求出小于M的所有素数？
 * @author 黎夜之梦
 *
 */

public class T22_PrimeM {

	public static void main(String[] args) {
		System.out.print("M=");
		int n=Scan.nextInt();
		for(int i=0; i<n; i++)
			if(Mathe.IsPrime(i))
				System.out.println(i);
	}

}
