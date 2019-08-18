package swing_layout;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;

public class Gridlayout_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton btn[]= {
				new JButton("1st"),
				new JButton("2ed"),
				new JButton("3rd"),
				new JButton("4th"),
				new JButton("5th"),
				new JButton("6th"),
				new JButton("7th"),
				new JButton("8th"),
				new JButton("9th")	};
			JFrame w=new JFrame();
			w.setTitle("NUMBER");
			w.setLocation(700, 400);
			w.setSize(490,210);
			w.setVisible(true);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container cp=w.getContentPane();
			cp.setLayout(new GridLayout(3,3));
			for(int n=0; n<btn.length; n++)
				cp.add(btn[n]);
			cp.validate();
	}

}
