package function;

public abstract class SharpT {
	/**
	 * 给出点集
	 */
	public static int broad;
	public double t[][];
	public SharpT() {}
	public SharpT(int broad) {
		char point_name='A';
		t=new double[broad][];
		for (int i = 0; i < broad; i++)
			t[i]=Points.In(Character.toString((char)(point_name++)));
	}
	
	/**
	 * 给出图形点集
	 */
	public double[][] getPoints(){
		return t;
	}
	/**
	 * 多边形周长
	 */
	public double Length(){
		return Sharp.nCubeLength(t);
	}
	/**
	 * 多边形面积
	 */
	public abstract double Area();
}
