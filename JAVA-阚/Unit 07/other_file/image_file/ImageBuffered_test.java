package image_file;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

public class ImageBuffered_test {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("BufferedImage");
		w.setLocation(100, 100);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BufferedImage bi=null;
		try {
			File fin=new File("./other_file/image_file/½õÀð.jpg");
			bi=ImageIO.read(fin);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			return;
		}
		w.setSize(bi.getWidth(),bi.getHeight());
		Color c1,c2;
		for(int time=0;time<2;time++)
			for(int y=0;y<bi.getHeight();y++)
				for(int x=0;x<bi.getWidth();x++) {
					c1=new Color(bi.getRGB(x, y));
					c2=new Color(255-c1.getRed(),255-c1.getGreen(),c1.getBlue());
					bi.setRGB(x, y, c2.getRGB());
				}
		Container cp=w.getContentPane();
		class MyCanvas extends Canvas{
			private static final long serialVersionUID = 1L;
				private BufferedImage bi=null;
				public MyCanvas(BufferedImage i) {
					bi=i;
				}
				public void paint(Graphics g) {
					if(bi!=null) g.drawImage(bi, 0, 0, null);
				}
			};
		MyCanvas cv=new MyCanvas(bi);
		cp.add(cv, BorderLayout.CENTER);
		cp.validate();
		try {
			File fout=new File("./other_file/image_file/½õÀð2.jpg");
			ImageIO.write(bi, "jpg", fout);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}