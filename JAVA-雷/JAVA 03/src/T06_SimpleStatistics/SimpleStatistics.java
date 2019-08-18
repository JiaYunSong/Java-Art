package T06_SimpleStatistics;

import function.Mathe;
import function.Scan;

/**
 * 设计Java类SimpleStatistics，
 * 完成平均数、最大、最小、中位数、总体方差和标准方差等基本统计方法的计算。
 * @author 黎夜之梦
 *
 */

public class SimpleStatistics {

	public static void main(String[] args) {
		int num=Scan.nextInt("num=");
		double d[]= {Scan.nextDouble()};
		for(int i=0; i<num-1; i++)
			d=Mathe.DoubleArrayPlus(d, Scan.nextDouble());
		Mathe.DoubleSort(d);
		
		System.out.println("Min="+d[0]);
		System.out.println("Max="+d[d.length-1]);
		System.out.println("Ave="+Mathe.DoubleKill(Mathe.DoubleAverage(d), 7));
		System.out.println("Med="+Mathe.DoubleKill(Mathe.DoubleMedian(d), 7));
		System.out.println("Var="+Mathe.DoubleKill(Mathe.DoubleVariance(d), 7));
		System.out.println("Std="+Mathe.DoubleKill(Mathe.DoubleStandardDeviation(d), 7));
	}

}
