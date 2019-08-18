package swingtest;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.InvocationTargetException;
import javax.swing.*;

public class swingerror {
	public static void main(String[] args) {
		JFrame w=new JFrame("Swing in threads");
		w.setLocation(800,400);
		w.setSize(400,200);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn=new JButton("Hello");
		JLabel msg=new JLabel();
		w.add(btn,BorderLayout.NORTH);
		w.add(msg);
		w.validate();
		
		ActionListener al=(ActionEvent e)->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			msg.setText("Hello from Button.");
		};
		btn.addActionListener(al);
		CountDown ra=new CountDown(msg);
		Thread t=new Thread(ra);
		t.start();
	}
}


class CountDown implements Runnable{
	private JLabel msg;
	private int count;
	public CountDown(JLabel lab) {
		msg=lab;
	}
	public void run() {
		for(int n=99; n>=0; n--) {
			count=n;
			try {
				SwingUtilities.invokeAndWait(
					()->msg.setText(count+"Hello from Thread."));
			} catch (InvocationTargetException | InterruptedException e1) {
				e1.printStackTrace();
			}
			try {Thread.sleep(500);  }
			catch(InterruptedException e) {}
		}
	}
}