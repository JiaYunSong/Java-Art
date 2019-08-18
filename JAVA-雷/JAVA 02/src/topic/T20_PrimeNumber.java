package topic;

import function.Mathe;
import function.Scan;

/**
 * 编写一个Java类实现查找1～n之间的素数?
 * @author 黎夜之梦
 *
 */

public class T20_PrimeNumber {
	
	public static void main(String[] args) {
		System.out.print("n=");
		int n=Scan.nextInt();
		for(int i=0; i<=n; i++)
			if(Mathe.IsPrime(i))
				System.out.println(i);
	}
	
}
