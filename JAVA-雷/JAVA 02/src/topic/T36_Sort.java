package topic;

import function.Mathe;
import function.Scan;

/**
 * ��������ʾ��ֵ������������ͽ��򣩡�
 * @author ��ҹ֮��
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
		System.out.println("�������У�");
		for(double i:a)
			System.out.print("["+i+"]");
		System.out.println("\n�������У�");
		a=Mathe.DoubleSort(a, -1);
		for(double i:a)
			System.out.print("["+i+"]");
	}

}
