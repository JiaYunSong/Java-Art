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
			fw.write("����˼��\n");
			fw.write("����˼��\n");
			fw.write("���Ѿ���������\n");
			fw.write("��ʵ���������\n");
			fw.write("ϣ��һ�й�ȥ\n");
			fw.write("Ϊ��ƴ��\n");
			fw.flush();    //��ǰִ�У��ѻ������ȷŵ��ļ���
			
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
			
			System.out.println("���ͣ���Ը");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("����һ������ӵ���ε��˰�");
		}
		catch (PPP a) {
			System.out.println("�������Σ�ֻ�ǲ���˵�������������ط�");
		}
	}

	private static void extracted() throws PPP {
		throw new PPP();
	}
}

class PPP extends Throwable{
	/**
	 * ��������ȡʧ��ʱ�õ�
	 */
	private static final long serialVersionUID = 1L;
	
}