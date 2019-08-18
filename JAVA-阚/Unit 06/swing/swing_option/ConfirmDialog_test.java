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
		w.setTitle("�������Գ������");
		w.setSize(400, 100);
		w.setLocation(800, 300);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		JButton btn=new JButton("��Ȼ�����ˣ����ҵ���");
		JLabel info=new JLabel("Hello!");
		cp.add(btn, BorderLayout.NORTH);
		cp.add(info, BorderLayout.CENTER);
		cp.validate();
		
		btn.addActionListener((ActionEvent e)->{
			int opt;
			opt=JOptionPane.showConfirmDialog(w,"����Сѧ����","��Ȼ����ˣ���",JOptionPane.INFORMATION_MESSAGE);
			if(opt==JOptionPane.YES_OPTION)
				info.setText("��ģ�������Ը��");
			else if(opt==JOptionPane.NO_OPTION)
				info.setText("�ߺߣ���ѧҲ��ѧ��");
			else if(opt==JOptionPane.CANCEL_OPTION)
				info.setText("ȡ���������ܵġ�");
		});
	}

}
