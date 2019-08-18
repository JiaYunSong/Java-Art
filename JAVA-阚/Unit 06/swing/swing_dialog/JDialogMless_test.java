package swing_dialog;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;

public class JDialogMless_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWnd_2();
	}

}

class MainWnd_2 extends JFrame{
	/**
	 * 弹出对话框实验---非模态
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn=new JButton("输入姓名");
	JLabel info=new JLabel("Hello!");
	JFrame fWin;
	NameDialogM_2 dlg;
	public MainWnd_2() {
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
		dlg=new NameDialogM_2(fWin);
		
		btn.addActionListener((ActionEvent e)->{
			dlg.setVisible(true);
		});
	}
}

class NameDialogM_2 extends JDialog{
	/**
	 * 非模态对话框
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField name=new JTextField("张三");
	JButton ok=new JButton("确定");
	JDialog dWin;
	
	public NameDialogM_2(JFrame pw) {
		super(pw);
		setModal(false);
		setTitle("输入姓名");
		setSize(300,150);
		setLocation(900,500);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		dWin=this;
		Container cp=getContentPane();
		cp.add(name, BorderLayout.CENTER);
		cp.validate();
		ActionListener al=(ActionEvent e)->{
			MainWnd_2 w=(MainWnd_2)dWin.getOwner();
			w.info.setText("Hello   "+name.getText());
		};
		name.addActionListener(al);
		ok.addActionListener(al);
	}
}