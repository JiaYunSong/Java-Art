package topic;

import function.Mathe;
import function.Scan;

/**
 * 在指定的范围内找出一个或一组回文素数。
 * 所谓回文素数是指一个素数同时也是回文数，
 * 例如：131，313，757等。
 * @author 黎夜之梦
 *
 */

public class T34_PrimePalindromes {

	public static void main(String[] args) {
		int a=Scan.nextInt("min=");
		int b=Scan.nextInt("max=");
		for(; a<=b; a++)
			if(Mathe.IsPrime(a) && Mathe.IsPalindrome(a))
				System.out.println(a+"\t是回文素数");
	}

}
