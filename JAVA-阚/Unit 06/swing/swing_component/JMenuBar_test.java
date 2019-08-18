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
	 * 菜单栏
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mb=new JMenuBar();
	JLabel info=new JLabel("信息显示区",SwingConstants.CENTER);
	
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
			case "打开":msg="选择菜单项：文件->打开！";break;
			case "保存":msg="选择菜单项：文件->保存！";break;
			case "关闭":msg="选择菜单项：关闭！";break;
			case "复制":msg="选择菜单项：编辑->复制！";break;
			case "剪切":msg="选择菜单项：编辑->剪切！";break;
			case "粘贴":msg="选择菜单项：编辑->粘贴！";break;
			default: msg=src.getText();break;
			}
			info.setText(msg);
		};
		
		setJMenuBar(mb);
		JMenu m;
		JMenuItem mi;
		m=new JMenu("文件");
		mi=new JMenuItem("打开");
		mi.addActionListener(al);
		m.add(mi);
		mi=new JMenuItem("保存");mi.addActionListener(al);m.add(mi);
		mb.add(m);
		m=new JMenu("关闭");
		m.addActionListener(al);  //一级无响应
		mb.add(m);
		m=new JMenu("编辑");
		mi=new JMenuItem("复制");mi.addActionListener(al);m.add(mi);
		mi=new JMenuItem("剪切");mi.addActionListener(al);m.add(mi);
		m.addSeparator();
		mi=new JMenuItem("粘贴");mi.addActionListener(al);m.add(mi);
		mb.add(m);
		
		Container cp=getContentPane();
		cp.add(info, BorderLayout.CENTER);
		cp.validate();
		validate();
	}
}