package swing_block;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;

public class B_and_L {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWnd();
	}
}

class MainWnd extends JFrame{
	/**
	 * ��˵ũ��֮װ��
	 */
	private static final long serialVersionUID = 1L;
	private JButton bEN,bCN;
	private JLabel msg=new JLabel();
	public MainWnd() {
		setTitle("CAU Summer School");
		setSize(460,300);
		setLocation(700,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bEN=new JButton("ȥһ�Ź�Ԣ�Է�");
		bCN=new JButton("ȥ���Ź�Ԣϴ��");
		msg.setOpaque(true);
		msg.setBackground(Color.GREEN);
		msg.setText("����������������������ũ��װ�޲����鰲�š�������������������");
		
		Container cp=getContentPane();
		cp.setLayout(null);
		cp.add(bEN);
		cp.add(bCN);
		cp.add(msg);
		bEN.setBounds(10, 10, 400, 50);
		bCN.setBounds(10, 70, 400, 50);
		msg.setBounds(10, 150, 400, 80);
		cp.validate();
	}
}