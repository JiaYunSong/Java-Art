package swing_layout;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;

public class Borderlayout_test {
	public static void main(String[] args)
	{
		JButton btn[]= {
				new JButton("1st"),
				new JButton("2ed"),
				new JButton("3rd"),
				new JButton("4th"),
				new JButton("5th")	};
			JFrame w=new JFrame();
			w.setTitle("NUMBER");
			w.setLocation(700, 400);
			w.setSize(490,210);
			w.setVisible(true);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container cp=w.getContentPane();
			cp.setLayout(new BorderLayout());
			cp.add(btn[0],BorderLayout.NORTH);
			cp.add(btn[1],BorderLayout.SOUTH);
			cp.add(btn[2],BorderLayout.WEST);
			cp.add(btn[3],BorderLayout.EAST);
			cp.add(btn[4],BorderLayout.CENTER);
			cp.validate();
	}
}
