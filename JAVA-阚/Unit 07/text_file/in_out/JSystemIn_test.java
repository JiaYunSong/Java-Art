package in_out;
import java.io.*;
import java.util.Scanner;
public class JSystemIn_test {
	public static void main(String[] args) {
		int qqqq=0;
		Scanner sc=new Scanner(System.in);
		qqqq=sc.nextInt();
		sc.close();
		if(qqqq==1) {    //字节流
			byte bbuf[]=new byte[20];
			try {
				int len = System.in.read(bbuf);
				for(int n=0;n<len;n++) {
					int x=Byte.toUnsignedInt(bbuf[n]);
					String hexString=Integer.toHexString(x);
					System.out.print(hexString+" ");
				}
				System.out.println();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		else if(qqqq==2) {     //字节流包装成的字符型的类
			char cbuf[]=new char[20];
			try {
				InputStreamReader inChar=new InputStreamReader(System.in);
				int len=inChar.read(cbuf);
				for(int n=0;n<len;n++)
					System.out.print(cbuf[n]+" ");
				System.out.println();
				inChar.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
