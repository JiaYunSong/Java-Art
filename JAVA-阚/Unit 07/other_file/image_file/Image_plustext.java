package image_file;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Image_plustext {
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
		
		Graphics g=bi.getGraphics();
		g.setColor(Color.RED);
		Font ef=new Font("BigDripper",Font.PLAIN,32);
		g.setFont(ef);
		
		g.drawString("Fancy Carp", 20, 40);
		g.drawOval(20, 80, 180, 60);
		
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
