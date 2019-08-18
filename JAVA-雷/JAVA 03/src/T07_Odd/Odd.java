package T07_Odd;

import function.Mathe;
import function.Scan;

/**
 * 编写一个Java类实现计算1～N之间的素数?
 * @author 黎夜之梦
 *
 */

public class Odd {

	public static void main(String[] args) {
		for(int i=2,n=Scan.nextInt("n="); i<=n; i++)
			if(Mathe.IsPrime(i))
				System.out.print("["+i+"],");
	}

}
