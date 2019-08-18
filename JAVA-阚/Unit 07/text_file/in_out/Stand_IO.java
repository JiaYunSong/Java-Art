package in_out;

import java.util.Scanner;

public class Stand_IO {
	public static void main(String[] args) {
		Scanner sc=null;
		System.out.print("从键盘输入数据");
		try {
			Scanner scanner=new Scanner(System.in);
			sc=scanner.useDelimiter("/");
			String str=sc.next();
			String str2=sc.next();
			System.out.println("输入结果为："+str+","+str2);
			scanner.close();
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}
}
