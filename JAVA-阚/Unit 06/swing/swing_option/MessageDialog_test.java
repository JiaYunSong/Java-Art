package swing_option;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MessageDialog_test {

	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("�������Գ������");
		w.setSize(400, 100);
		w.setLocation(800, 300);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		JButton btn=new JButton("��Ȼ�����ˣ����ҵ���");
		JLabel info=new JLabel("JAVA_MESS_OLD_AGE");
		cp.add(btn, BorderLayout.NORTH);
		cp.add(info, BorderLayout.CENTER);
		cp.validate();
		
		btn.addActionListener((ActionEvent e)->{
			JOptionPane.showMessageDialog(w,"����Сѧ����","��Ȼ����ˣ���",JOptionPane.INFORMATION_MESSAGE);
			w.setVisible(false);
			w.dispose();
		});
	}
}
