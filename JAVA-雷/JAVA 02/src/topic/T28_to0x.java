package topic;

import function.Scan;

/**
 * 从键盘输入一个十进制整数，将其转换成十六进制的形式显示
 * @author 黎夜之梦
 *
 */

public class T28_to0x {

	public static void main(String[] args) {
		int p=Scan.nextInt("十进制数=");
		System.out.println("十六进制数=0x"+Integer.toHexString(p));
	}

}
