import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.println("31天");break;
			case 4:
			case 6:
			case 9:
			case 11:System.out.println("30天");break;
			case 2:System.out.println("28或29天");break;
			default:System.out.println("ERROR");break;
		}
		sc.close();
	}

}
