package in_out;

import java.util.Scanner;

public class PrintStream_test {
	public static void main(String[] args) {
		int i=0;
		System.out.printf("232322232  %d", i);
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		System.out.flush();//ÓÃÓÚÍøÂç´«Êä
		sc.close();
	}
}
