package topic;

import function.Scan;

/**
 * 编写程序接收键盘输入的数字字符串，
 * 并转换成整数，或浮点数。
 * 例如，输入“4353”则转换成整数 4353，
 * 输入“0.894”则转换成双浮点 0.894。
 * @author 黎夜之梦
 *
 */

public class T30_StoNum {

	public static void main(String[] args) {
		String num=Scan.next("String=");
		double d=Double.parseDouble(num);
		int i=(int)d;
		if(i==d) System.out.println("Int="+i);
		else System.out.println("Double="+d);
	}

}