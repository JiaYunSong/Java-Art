package topic;

import function.Matrix;

/**
 * matrix����
 * �Ծ���A��B������C=A*B
 * @author ��ҹ֮��
 *
 */

public class T32_Matrix {

	public static void main(String[] args) {
		double a[][]= {{1,2,3},{4,5,6}};
		double b[][]= {{100,10},{10,100},{1,1000}};
		Matrix A=new Matrix(a);
		Matrix B=new Matrix(b);
		Matrix C=A.oper_multiply(B);
		C.showInteger("C=AxB");
	}

}
