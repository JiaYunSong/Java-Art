import java.util.Scanner;

public class Sgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int sgn;
		if(i>0) sgn=1;
		else if(i==0) sgn=0;
		else sgn=-1;
		//? :р╡©ирт
		System.out.println(sgn);
		sc.close();
	}

}
