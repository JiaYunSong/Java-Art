package function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * �����㺯��
 * @author ��ҹ֮��
 *
 */
public class Points {
	/**
	 * �������룺String name
	 */
	static public double[] In(String name) {
		double x[]= {0,0};
		System.out.print("������"+name+"������(x,y)��");
		String data=Scan.nextLine();
		Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
		Matcher matcher = pattern.matcher(data);
		if(matcher.find())
			x[0]=Double.parseDouble(matcher.group());
		if(matcher.find())
			x[1]=Double.parseDouble(matcher.group());
		return x;
	}
	/**
	 * ������룺double a[],double b[]
	 */
	static public double Length(double a[],double b[]) {
		return Math.sqrt((a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]));
	}
	/**
	 * ������룺double a1,a2,b1,b2
	 */
	static public double Length(double a1,double a2,double b1,double b2) {
		return Math.sqrt((a1-b1)*(a1-b1)+(a2-b2)*(a2-b2));
	}
	/**
	 * Double[][]��������µ�Ԫ
	 */
	public static double[][] DoubleArrayPlus(double[][] a,double[] p) {
		double[][] a2 = new double[a.length + 1][];
		System.arraycopy(a, 0, a2, 0, a.length);
		a2[a.length] = p;
		return a2;
	}
}
