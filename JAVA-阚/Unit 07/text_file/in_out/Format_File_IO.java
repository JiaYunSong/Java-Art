package in_out;

import java.io.*;
import java.util.Scanner;

import javax.swing.*;

public class Format_File_IO {
	public static void main(String[] args) {
		try {
			File f=new File(".\\in_using\\in_out");
			JFileChooser fc=new JFileChooser(f);
			fc.showOpenDialog(null);
			f=fc.getSelectedFile();
			String fi=f.toString();
			
			PrintWriter pw=new PrintWriter(fi);
			int x=10; double y=15.2; String str="abcd";
			pw.print(x+" ");
			pw.print(y+" ");
			pw.println(str);
			pw.format("%d %f %s", x,y,str);
			pw.close();
			System.out.println(fi+"写入成功！");
			
			Scanner sc=new Scanner(new File(fi));
			while(sc.hasNext()) {
				x=sc.nextInt();
				y=sc.nextDouble();
				str=sc.next();
				System.out.println(x+" "+y+" "+str);
			}
			sc.close();
			System.out.println(fi+"读取成功！");
		}
		catch(IOException e){
			System.out.println("我并不想写入");
		}
	}
}
