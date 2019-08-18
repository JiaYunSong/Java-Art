package topic;
import java.util.Scanner;

import function.Sharp;

/**
 * 已知圆的半径为R，从键盘输入R的值，分别计算圆的面积和周长。
 * @author 黎夜之梦
 *
 */
public class T10_Round {

	public static void main(String[] args) {
		System.out.print("R=");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		sc.close();
		System.out.println("S="+Sharp.RoundArea(r));
		System.out.println("C="+Sharp.RoundLength(r));
	}

}
