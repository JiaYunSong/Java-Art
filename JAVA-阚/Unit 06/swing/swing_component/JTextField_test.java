package swing_component;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;

public class JTextField_test {
	public static void main(String[] args) {
		new MainWnd();
	}
}

class MainWnd extends JFrame{
	/**
	 * JTextField的实现
	 * JTextArea的实现
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf =new JTextField();
	JTextArea ta=new JTextArea(8,10);
	JButton b=new JButton("显示文本");
	JLabel msg=new JLabel("Hello Friend!");
	public MainWnd() {
		setTitle("My Dear");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf.setBackground(Color.YELLOW);
		tf.addActionListener((ActionEvent e)->
			msg.setText("Hello,"+tf.getText()) );
		Container cp=getContentPane();
		
		JPanel bp=new JPanel();
		ta.setBackground(Color.CYAN);
		JScrollPane taScroller=new JScrollPane(ta);
		b.addActionListener((ActionEvent e)->
			msg.setText("Hello,"+tf.getText()+ta.getText()));
		bp.setLayout(new BorderLayout());
		bp.add(taScroller,BorderLayout.CENTER);
		bp.add(b,BorderLayout.SOUTH);
		
		cp.add(tf,BorderLayout.NORTH);
		cp.add(bp,BorderLayout.CENTER);
		cp.add(msg,BorderLayout.SOUTH);
		cp.validate();
	}
}