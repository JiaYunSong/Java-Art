package function;

public abstract class SharpT {
	/**
	 * �����㼯
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
	 * ����ͼ�ε㼯
	 */
	public double[][] getPoints(){
		return t;
	}
	/**
	 * ������ܳ�
	 */
	public double Length(){
		return Sharp.nCubeLength(t);
	}
	/**
	 * ��������
	 */
	public abstract double Area();
}
