package topic;

import function.Scan;
/**
 * 输入一个华氏温度值将其转化为摄氏温度值，计算公式如下
 * @author 黎夜之梦
 *
 */

public class T19_CtoF {

	public static void main(String[] args) {
		System.out.print("华氏温度值：");
		double f=Scan.nextDouble();
		double c=5*(f-32)/9;
		System.out.println("摄氏温度值："+c);
	}

}
