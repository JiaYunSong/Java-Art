package sharp;

import function.SharpT;

/**
 * ����-ֱ������ϵ
 * @author ��ҹ֮��
 *
 */

public class Rectangle extends SharpT{
	/**
	 * Ĭ�ϱ���
	 */
	public static int broad=4;
	/**
	 * ���ι��췽��
	 */
	public Rectangle() {
		super(broad);
	}
	/**
	 * ����-�㼯
	 */
	public Rectangle(double[][] tt) {
		t=tt;
	}
	/**
	 * ����-�׺͸�
	 */
	public Rectangle(double a,double h) {
		t=new double[4][2];
		t[0][0]=t[0][1]=t[1][1]=t[3][0]=0;
		t[2][0]=t[1][0]=a;
		t[2][1]=t[3][1]=h;
	}
	/**
	 * ���������
	 */
	public double Area() {
		return (t[0][0]-t[2][0])*(t[0][1]-t[2][1]);
	}
}