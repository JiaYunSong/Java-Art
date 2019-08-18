package swing_component;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;
import java.awt.event.*;

public class JMenuBar_test {
	public static void main(String[] args) {
		new MainWnd_7();
	}
}

class MainWnd_7 extends JFrame{
	/**
	 * �˵���
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mb=new JMenuBar();
	JLabel info=new JLabel("��Ϣ��ʾ��",SwingConstants.CENTER);
	
	public MainWnd_7() {
		setTitle("MenuBar_test");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al=(ActionEvent e)->{
			JMenuItem src=(JMenuItem)(e.getSource());
			String msg;
			switch(src.getText()) {
			case "��":msg="ѡ��˵���ļ�->�򿪣�";break;
			case "����":msg="ѡ��˵���ļ�->���棡";break;
			case "�ر�":msg="ѡ��˵���رգ�";break;
			case "����":msg="ѡ��˵���༭->���ƣ�";break;
			case "����":msg="ѡ��˵���༭->���У�";break;
			case "ճ��":msg="ѡ��˵���༭->ճ����";break;
			default: msg=src.getText();break;
			}
			info.setText(msg);
		};
		
		setJMenuBar(mb);
		JMenu m;
		JMenuItem mi;
		m=new JMenu("�ļ�");
		mi=new JMenuItem("��");
		mi.addActionListener(al);
		m.add(mi);
		mi=new JMenuItem("����");mi.addActionListener(al);m.add(mi);
		mb.add(m);
		m=new JMenu("�ر�");
		m.addActionListener(al);  //һ������Ӧ
		mb.add(m);
		m=new JMenu("�༭");
		mi=new JMenuItem("����");mi.addActionListener(al);m.add(mi);
		mi=new JMenuItem("����");mi.addActionListener(al);m.add(mi);
		m.addSeparator();
		mi=new JMenuItem("ճ��");mi.addActionListener(al);m.add(mi);
		mb.add(m);
		
		Container cp=getContentPane();
		cp.add(info, BorderLayout.CENTER);
		cp.validate();
		validate();
	}
}