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
	 * �����Ի���ʵ��
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn=new JButton("��������");
	JLabel info=new JLabel("Hello!");
	JFrame fWin;
	public MainWnd_1() {
		setTitle("��ӭ����");
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
	 * ģ̬�Ի���
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField name=new JTextField("����");
	JButton ok=new JButton("ȷ��");
	JDialog dWin;
	
	public NameDialogM(JFrame pw) {
		super(pw);
		setModal(true);
		setTitle("��������");
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