package swing_block;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;

public class B_and_L {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWnd();
	}
}

class MainWnd extends JFrame{
	/**
	 * 话说农大之装修
	 */
	private static final long serialVersionUID = 1L;
	private JButton bEN,bCN;
	private JLabel msg=new JLabel();
	public MainWnd() {
		setTitle("CAU Summer School");
		setSize(460,300);
		setLocation(700,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bEN=new JButton("去一号公寓吃饭");
		bCN=new JButton("去三号公寓洗澡");
		msg.setOpaque(true);
		msg.setBackground(Color.GREEN);
		msg.setText("———————————农大装修部倾情安排——————————");
		
		Container cp=getContentPane();
		cp.setLayout(null);
		cp.add(bEN);
		cp.add(bCN);
		cp.add(msg);
		bEN.setBounds(10, 10, 400, 50);
		bCN.setBounds(10, 70, 400, 50);
		msg.setBounds(10, 150, 400, 80);
		cp.validate();
	}
}