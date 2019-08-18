package topic;

import function.Matrix;

/**
 * ����
 * ��1����m�˾���A��
 * ��2������������ӡ�����
 * ��3������A�����B��ˡ�
 * @author ��ҹ֮��
 *
 */

public class T33_Matrix {

	public static void main(String[] args) {
		double a[][]= {{1,2,3},{4,5,6}};
		double b[][]= {{5,4,6},{8,7,5}};
		double m=3;
		Matrix A=new Matrix(a);
		Matrix B=new Matrix(b);
		A.oper_mix(new Matrix(A.w,A.h,m)).showInteger("mA");
		A.oper_plus(B).showInteger("A+B");
		A.oper_decrease(B).showInteger("A-B");
		A.oper_mix(B).showInteger("A*B");
	}

}
