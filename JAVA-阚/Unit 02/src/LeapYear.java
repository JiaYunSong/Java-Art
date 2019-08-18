import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean leap_yn=false;
		if(year%4==0) leap_yn=true;
		if(year%100==0) leap_yn=false;
		if(year%400==0) leap_yn=true;
		System.out.print(leap_yn);
		sc.close();
	}
}
