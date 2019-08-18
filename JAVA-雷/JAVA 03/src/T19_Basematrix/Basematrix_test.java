package T19_Basematrix;

import function.Matrix;

/**
 * 有矩阵A和B，设计专门用于矩阵基本运算的Java类，
 * 实现对转置、A+B等基本运算。类名称Basematrix。
 * (提示：此类可能会被继承。)
 * @author 黎夜之梦
 *
 */

     //注：自己编写的Matrix类已包含了题目的运算

public class Basematrix_test {
	
	public static void main(String[] args) {
		double a[][]= {{1,2,3},{4,5,6}};
		double b[][]= {{5,4,6},{8,7,5}};
		double m=3;
		Matrix A=new Matrix(a);
		Matrix B=new Matrix(b);
		A.oper_mix(new Matrix(A.w,A.h,m)).showInteger("mA");
		A.oper_transposition().showInteger("^A");
		A.oper_plus(B).showInteger("A+B");
		A.oper_decrease(B).showInteger("A-B");
		A.oper_mix(B).showInteger("A*B");
	}
	
}
