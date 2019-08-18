package swing_dialog;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;

public class JDialogModal_test {
	public static void main(String[] args) {
		new MainWnd_1();
	}
}

class MainWnd_1 extends JFrame{
	/**
	 * 弹出对话框实验
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn=new JButton("输入姓名");
	JLabel info=new JLabel("Hello!");
	JFrame fWin;
	public MainWnd_1() {
		setTitle("欢迎界面");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fWin=this;
		Container cp=getContentPane();
		cp.add(btn, BorderLayout.NORTH);
		cp.add(info, BorderLayout.CENTER);
		cp.validate();
		
		btn.addActionListener((ActionEvent e)->{
			NameDialogM dlg=new NameDialogM(fWin);
			dlg.setVisible(true);
		});
	}
}

class NameDialogM extends JDialog{
	/**
	 * 模态对话框
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField name=new JTextField("张三");
	JButton ok=new JButton("确定");
	JDialog dWin;
	
	public NameDialogM(JFrame pw) {
		super(pw);
		setModal(true);
		setTitle("输入姓名");
		setSize(300,150);
		setLocation(900,500);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		dWin=this;
		Container cp=getContentPane();
		cp.add(name, BorderLayout.CENTER);
		cp.validate();
		ActionListener al=(ActionEvent e)->{
			MainWnd_1 w=(MainWnd_1)dWin.getOwner();
			w.info.setText("Hello   "+name.getText());
			dWin.setVisible(false);
			dWin.dispose();
		};
		name.addActionListener(al);
		ok.addActionListener(al);
	}
}