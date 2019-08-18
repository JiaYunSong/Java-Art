package swing_option;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ConfirmDialog_test {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("咖啡语言程序设计");
		w.setSize(400, 100);
		w.setLocation(800, 300);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		JButton btn=new JButton("既然都到了，点我点我");
		JLabel info=new JLabel("Hello!");
		cp.add(btn, BorderLayout.NORTH);
		cp.add(info, BorderLayout.CENTER);
		cp.validate();
		
		btn.addActionListener((ActionEvent e)->{
			int opt;
			opt=JOptionPane.showConfirmDialog(w,"想上小学期吗？","居然真点了？！",JOptionPane.INFORMATION_MESSAGE);
			if(opt==JOptionPane.YES_OPTION)
				info.setText("真的？如你所愿。");
			else if(opt==JOptionPane.NO_OPTION)
				info.setText("哼哼，不学也得学！");
			else if(opt==JOptionPane.CANCEL_OPTION)
				info.setText("取消？不可能的。");
		});
	}

}
