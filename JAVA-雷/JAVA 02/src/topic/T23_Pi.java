package topic;

/**
 * 利用下列数列计算圆周率的近似值。
 * 计算并显示当n=10000,20000,100000时圆周率的值。
 * @author 黎夜之梦
 *
 */

public class T23_Pi {

	public static void main(String[] args) {
		int num[]= {10000,20000,100000},j=1;
		double Pi;
		for(int n:num) {
			Pi=0;
			for(int i=1; i<=n; i++,j*=-1)
				Pi=Pi+(double)4*j/(2*i-1);
			System.out.println("Π("+n+")="+Pi);
		}
	}

}
