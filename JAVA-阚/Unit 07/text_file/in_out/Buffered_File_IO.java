package in_out;

import java.io.*;
import javax.swing.*;

public class Buffered_File_IO {
	public static void main(String[] args) {
		try {
			File f=new File(".\\in_using\\in_out");
			JFileChooser fc=new JFileChooser(f);
			fc.showOpenDialog(null);
			f=fc.getSelectedFile();
			String fi=f.toString();
			
			BufferedWriter bw=new BufferedWriter(new FileWriter(fi));
			bw.write("回忆是一把刀");
			bw.newLine();
			bw.write("拾光即是自虐");
			bw.newLine();
			bw.close();
			System.out.println(fi+"输出成功！");
			
			BufferedReader br=new BufferedReader(new FileReader(fi));
			String s;
			while((s=br.readLine())!=null) {
				System.out.print(s);
				System.out.println();
			}
			br.close();
			System.out.println(fi+"读取成功！");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
