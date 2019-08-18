package image_file;

import java.awt.*;
import javax.swing.*;

public class ImageIcon_test {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("½õÀð");
		w.setSize(420,320);
		w.setLocation(100, 100);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		JLabel box=new JLabel();
		cp.add(box, BorderLayout.CENTER);
		cp.validate();
		
		ImageIcon ii=new ImageIcon("./other_file/image_file/½õÀð.jpg");
		w.setSize(ii.getIconWidth(),ii.getIconHeight());
		box.setIcon(ii);
	}
}
