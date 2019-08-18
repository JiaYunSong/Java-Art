import java.util.Scanner;

public class CtoF {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ctemp,ftemp;
		sc = new Scanner(System.in);
		ctemp=sc.nextDouble();
		ftemp=ctemp*1.8+32;
		System.out.println(ftemp);
		return;
	}

}
