package T11_Sort;

import function.Mathe;

/**
 * 某项目需要对获得的数据进行排序，
 * 编写实现对double类型和int数组元素排序的Java类DoubleSort和IntegerSort。
 * @author 黎夜之梦
 *
 */

public class Sort {

	static public int[] intSort(int i[]) {
		return Mathe.IntSort(i);
	}
	static public double[] doubleSort(double d[]) {
		return Mathe.DoubleSort(d);
	}

}