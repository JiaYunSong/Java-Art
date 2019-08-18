package topic;

import function.Matrix;

/**
 * 计算
 * （1）数m乘矩阵A。
 * （2）两个矩阵相加、减。
 * （3）矩阵A与矩阵B相乘。
 * @author 黎夜之梦
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
