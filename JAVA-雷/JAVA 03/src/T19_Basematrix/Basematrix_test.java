package T19_Basematrix;

import function.Matrix;

/**
 * �о���A��B�����ר�����ھ�����������Java�࣬
 * ʵ�ֶ�ת�á�A+B�Ȼ������㡣������Basematrix��
 * (��ʾ��������ܻᱻ�̳С�)
 * @author ��ҹ֮��
 *
 */

     //ע���Լ���д��Matrix���Ѱ�������Ŀ������

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
