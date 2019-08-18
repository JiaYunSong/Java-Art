package sharp;

import function.Points;
import function.Scan;
import function.Sharp;
import function.SharpT;

/**
 * Բ��-ֱ������ϵ
 * @author ��ҹ֮��
 *
 */

public class Round extends SharpT{
	/**
	 * Ĭ�ϱ���
	 */
	public static int broad=1;
	/**
	 * Բ�ι��췽��
	 * t[0]ΪԲ��
	 * t[1][0]��t[1][1]��ΪR
	 */
	public Round() {
		char point_name='O';
		t=new double[2][2];
		t[0]=Points.In(Character.toString((char)(point_name++)));
		t[1][0]=t[1][1]=Scan.nextDouble("R=");
	}
	/**
	 * Բ��-��߼�
	 */
	public Round(double[][] tt) {
		t=tt;
	}
	/**
	 *  Բ��-�����
	 */
	public Round(double[] a,double r) {
		t=new double[2][2];
		t[0]=a;
		t[1][0]=t[1][1]=r;
	}
	
	/**
	 * Բ���ܳ�
	 */
	public double Length(){
		return Sharp.RoundLength(t[1][0]);
	}
	/**
	 * Բ�����
	 */
	public double Area() {
		return Sharp.RoundArea(t[1][0]);
	}
}
