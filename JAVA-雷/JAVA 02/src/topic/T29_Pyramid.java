package topic;

/**
 * 数字金子塔Pyramid
 * @author 黎夜之梦
 *
 */

public class T29_Pyramid {

	public static void main(String[] args) {
		int h=7;
		int num[]=new int[2*h-1];
		for(int i=h,j=-1,k=0; i<=h; i+=j,k++) {
			if(i==1) j=1;
			num[k]=i;
		}
		for(int i=1; i<=h; i++) {
			for(int j=0; j<2*h-1; j++)
				if(num[j]<=i) System.out.print(num[j]);
				else System.out.print(' ');
			System.out.println();
		}
	}

}
