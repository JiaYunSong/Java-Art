package in_out;

import java.io.*;
import javax.swing.JFileChooser;

public class File_IO {
	public static void main(String[] args) {
		try{
			JFileChooser f=new JFileChooser();
			File k=new File(".");
			f.setCurrentDirectory(k);
			f.showOpenDialog(null);
			k=f.getSelectedFile();
			String fi=k.toString();
			
			FileWriter fw=new FileWriter(fi);//,true
			fw.write("我在思考\n");
			fw.write("我再思考\n");
			fw.write("我已经脱离了梦\n");
			fw.write("其实并不想回来\n");
			fw.write("希望一切过去\n");
			fw.write("为梦拼搏\n");
			fw.flush();    //提前执行，把缓冲区先放到文件里
			
			f.setCurrentDirectory(k);
			int g=f.showOpenDialog(null);
			if(g==1) {
				extracted();
			}
			k=f.getSelectedFile();
			fi=k.toString();
			FileReader fr=new FileReader(fi);
			int c;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			
			fw.close();
			fr.close();
			
			System.out.println("加油，我愿");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("我是一个不想拥有梦的人吧");
		}
		catch (PPP a) {
			System.out.println("或许有梦，只是不想说，埋在了其他地方");
		}
	}

	private static void extracted() throws PPP {
		throw new PPP();
	}
}

class PPP extends Throwable{
	/**
	 * 用来给读取失败时用的
	 */
	private static final long serialVersionUID = 1L;
	
}