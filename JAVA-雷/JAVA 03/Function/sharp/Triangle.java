package sharp;

import function.Sharp;
import function.SharpT;

/**
 * ������-ֱ������ϵ
 * @author ��ҹ֮��
 *
 */

public class Triangle extends SharpT{
	/**
	 * Ĭ�ϱ���
	 */
	public static int broad=3;
	/**
	 * �����ι��췽��
	 */
	public Triangle() {
		/**
		 * Ĭ�ϱ���
		 */
		super(broad);
	}
	public Triangle(double[][] tt) {
		t=tt;
	}
	/**
	 * ���������
	 */
	public double Area() {
		return Sharp.TriangleArea(t);
	}
}