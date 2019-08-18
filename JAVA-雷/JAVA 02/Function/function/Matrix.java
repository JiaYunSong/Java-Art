package function;

/**
 * 矩阵类运算
 * @author 黎夜之梦
 *
 */

public class Matrix {
	/**
	 * 矩阵数列-num
	 */
	public double num[][];
	/**
	 * 矩阵宽-w
	 */
	public int w;
	/**
	 * 矩阵高-h
	 */
	public int h;
	/**
	 * 空集构造法(x)
	 */
	public Matrix(int ww,int hh,double x) {
		w=ww;
		h=hh;
		num=new double[h][w];
		for(int i=0; i<h; i++)
			for(int j=0; j<w; j++)
				num[i][j]=x;
	}
	/**
	 * 空集构造法
	 */
	public Matrix(int ww,int hh) {
		w=ww;
		h=hh;
		num=new double[h][w];
		for(int i=0; i<h; i++)
			for(int j=0; j<w; j++)
				num[i][j]=0;
	}
	/**
	 * 数列构造法
	 */
	public Matrix(double a[][]) {
		w=a[0].length;
		h=a.length;
		num=new double[h][w];
		for(int i=0; i<h; i++)
			for(int j=0; j<w; j++)
				num[i][j]=a[i][j];
	}
	/**
	 * 复制构造法
	 */
	public Matrix(Matrix m) {
		w=m.w;
		h=m.h;
		num=new double[h][w];
		for(int i=0; i<h; i++)
			for(int j=0; j<w; j++)
				num[i][j]=m.num[i][j];
	}
	/**
	 * 矩阵输出int型
	 */
	public void showInteger(){
		int i,j;
		for(i=0; i<h; i++) {
			System.out.print("[");
			for(j=0; j<w-1; j++) {
				System.out.print((int)num[i][j]+"	,");
			}
			System.out.println((int)num[i][j]+"	]");
		}
	}
	/**
	 * 矩阵输出int型(name)
	 */
	public void showInteger(String name){
		System.out.println("Matrix("+name+")--->");
		showInteger();
	}
	/**
	 * 矩阵输出double型
	 */
	public void showDouble(){
		int i,j;
		for(i=0; i<h; i++) {
			System.out.print("[");
			for(j=0; j<w-1; j++) {
				System.out.print(num[i][j]+"	,");
			}
			System.out.println(num[i][j]+"	]");
		}
	}
	/**
	 * 矩阵输出double型(name)
	 */
	public void showDouble(String name){
		System.out.println("Matrix("+name+")--->");
		showDouble();
	}
	/**
	 * 矩阵加法
	 */
	public Matrix oper_plus(Matrix m){
		if(w!=m.w||h!=m.h)
			return m;
		Matrix p=new Matrix(w,h);
		for(int i=0; i<p.h; i++)
			for(int j=0; j<p.w; j++)
				p.num[i][j]=num[i][j]+m.num[i][j];
		return p;
	}
	/**
	 * 矩阵减法
	 */
	public Matrix oper_decrease(Matrix m){
		if(w!=m.w||h!=m.h)
			return m;
		Matrix p=new Matrix(w,h);
		for(int i=0; i<p.h; i++)
			for(int j=0; j<p.w; j++)
				p.num[i][j]=num[i][j]-m.num[i][j];
		return p;
	}
	/**
	 * 矩阵叉乘
	 */
	public Matrix oper_multiply(Matrix m){
		if(w!=m.h)
			return m;
		Matrix p=new Matrix(h,m.w);
		for(int i=0; i<p.h; i++)
			for(int j=0; j<p.w; j++)
				for(int f=0; f<h; f++)
					p.num[i][j]=p.num[i][j]+num[i][f]*m.num[f][j];
		return p;
	}
	/**
	 * 矩阵点乘
	 */
	public Matrix oper_mix(Matrix m){
		if(w!=m.w||h!=m.h)
			return m;
		Matrix p=new Matrix(w,h);
		for(int i=0; i<p.h; i++)
			for(int j=0; j<p.w; j++)
				p.num[i][j]=num[i][j]*m.num[i][j];
		return p;
	}
	/**
	 * 矩阵点乘
	 */
	public Matrix oper_transposition(){
		Matrix p=new Matrix(h,w);
		for(int i=0; i<h; i++)
			for(int j=0; j<w; j++)
				p.num[j][i]=num[i][j];
		return p;
	}
}
