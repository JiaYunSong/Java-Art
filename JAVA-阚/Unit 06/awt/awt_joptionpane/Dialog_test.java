package awt_joptionpane;

import java.awt.*;
import javax.swing.*;
import java.io.File;

public class Dialog_test {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"No using!","No using more!",JOptionPane.INFORMATION_MESSAGE);
		int a,c=JOptionPane.showConfirmDialog(null, "22222");
		String i=JOptionPane.showInputDialog("hhhh");
		String gender[]= {"ÄÐ","Å®"};
		int o=JOptionPane.showOptionDialog(null, "666", "222",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, gender,gender[0]);
		JOptionPane.showMessageDialog(null,c+" "+i+" "+o);
		
		JFileChooser f=new JFileChooser();
		File k=new File("D:");
		f.setCurrentDirectory(k);
		f.setMultiSelectionEnabled(true);
		c=f.showOpenDialog(null);
		o=f.showSaveDialog(null);
		a=f.showDialog(null, null);
		JOptionPane.showMessageDialog(null,c+" "+o+" "+a);
		k=f.getSelectedFile();
		System.out.println(k);
		System.out.println(f.getName(k));
		
		JColorChooser j=new JColorChooser();
		j.setColor(Color.BLACK);
		Color x=j.getColor();
		System.out.println(x);
		x=JColorChooser.showDialog(null, "111", Color.BLACK);
		System.out.println(x);
	}
}
