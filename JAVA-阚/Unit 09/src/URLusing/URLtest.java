package URLusing;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class URLtest {
	public static void main(String[] args) {try {
		
			URL w = new URL("http://www.cau.edu.cn/index.html");
			System.out.println(w);
			System.out.println(w.getProtocol());
			System.out.println(w.getHost());
			System.out.println(w.getPath());
			System.out.println(w.getPort());
			System.out.println(w.getDefaultPort());
			
			InputStreamReader b=new InputStreamReader(w.openStream());
			for(int i=0; i<10000; i++)
				System.out.print((char)b.read());
			System.out.println(b.getEncoding());
			b.close();
			
			w=new URL("http://www.cau.edu.cn/images/1182/culture.jpg");
			BufferedImage img=ImageIO.read(w);
			JFrame f=new JFrame("ÏÔÊ¾ÍøÂçÍ¼Æ¬");
			f.setLocation(800,400);
			f.setVisible(true);
			f.setSize(660, 360);
			String s=w.getProtocol();
			SwingUtilities.invokeLater(()->{
				Graphics g=f.getGraphics();
				g.setFont(new Font("ËÎÌå",Font.PLAIN,20));
				g.drawString(s, 10, 75);
				g.drawImage(img, 10, 100, null);
			});
			
} catch (MalformedURLException e) {
	System.out.println("??");
} catch (IOException e) {
	System.out.println("!!");
}}}