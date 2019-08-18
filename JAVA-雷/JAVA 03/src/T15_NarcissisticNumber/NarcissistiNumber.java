package T15_NarcissisticNumber;

import function.Mathe;
import function.Scan;

/**
 * 水仙花数是指其个位、十位、百位三个数的立方和等于这个数本身。
 * 设计水仙花数类，提供
 * (1)测试任意3位整数是否是水仙花数；
 * (2)返回指定范围内的所有水仙花数。
 * @author 黎夜之梦
 *
 */

public class NarcissistiNumber {

	public static void main(String[] args) {
		int n=Scan.nextInt("n=");
		System.out.println(n+" is narcissisti number is "+Mathe.IsNarcissistiNumber(n));
		n=Scan.nextInt("n=");
		System.out.println(n+" is narcissisti number is "+Mathe.IsNarcissistiNumber(n));
		n=Scan.nextInt("n=");
		System.out.println(n+" is narcissisti number is "+Mathe.IsNarcissistiNumber(n));
		int a=Scan.nextInt("min="),b=Scan.nextInt("max=");
		for(n=a; n<=b; n++) {
			if(Mathe.IsNarcissistiNumber(n))
				System.out.print("["+n+"]");
		}
	}

}
