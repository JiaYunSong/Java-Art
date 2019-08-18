package topic;

import function.Mathe;
import function.Scan;

/**
 * 有如下所示数值队列排序（升序和降序）。
 * @author 黎夜之梦
 *
 */

public class T36_Sort {

	public static void main(String[] args) {
		int num=Scan.nextInt("num=");
		double a[]=new double[num];
		System.out.print("a=");
		for(int i=0; i<num; i++)
			a[i]=Scan.nextDouble();
		a=Mathe.DoubleSort(a);
		System.out.println("正序排列：");
		for(double i:a)
			System.out.print("["+i+"]");
		System.out.println("\n倒序排列：");
		a=Mathe.DoubleSort(a, -1);
		for(double i:a)
			System.out.print("["+i+"]");
	}

}
