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
			bw.write("������һ�ѵ�");
			bw.newLine();
			bw.write("ʰ�⼴����Ű");
			bw.newLine();
			bw.close();
			System.out.println(fi+"����ɹ���");
			
			BufferedReader br=new BufferedReader(new FileReader(fi));
			String s;
			while((s=br.readLine())!=null) {
				System.out.print(s);
				System.out.println();
			}
			br.close();
			System.out.println(fi+"��ȡ�ɹ���");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
