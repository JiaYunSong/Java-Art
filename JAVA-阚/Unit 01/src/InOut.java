import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		//double x=sc.nextDouble();
		//char x=sc.nextChar();
		System.out.print("Hello Java\n"+x);
		sc.close();
	}

}