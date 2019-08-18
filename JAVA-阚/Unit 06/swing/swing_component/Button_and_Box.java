package swing_component;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;

/**
 * 单选按钮与复选框
 * 都是从AbstractButton继承来的
 */

public class Button_and_Box {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWnd_2();
		new MainWnd_3();
	}
}

class MainWnd_2 extends JFrame{
	/**
	 * 单选框的实现_Children
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton cbEN=new JRadioButton("英文",true);
	JRadioButton cbCN=new JRadioButton("中文");
	JRadioButton cbGL=new JRadioButton("桂林");
	JLabel hello=new JLabel("Hello,my dear!",SwingConstants.CENTER);
	
	public MainWnd_2() {
		setTitle("Children");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel bp=new JPanel();
		bp.add(cbEN);
		bp.add(cbCN);
		bp.add(cbGL);
		ButtonGroup group=new ButtonGroup();
		group.add(cbEN);
		group.add(cbCN);
		group.add(cbGL);
		
		Container cp=getContentPane();
		cp.add(bp, BorderLayout.NORTH);
		cp.add(hello,BorderLayout.CENTER);
		cp.validate();
		
		ItemListener il=new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String msg=null;
				if(cbEN.isSelected()) msg="Children";
				else if(cbCN.isSelected()) msg="孩子";
				else if(cbGL.isSelected()) msg="小把爷";
				hello.setText(msg);
			}
		};
		cbEN.addItemListener(il);
		cbCN.addItemListener(il);
		cbGL.addItemListener(il);
	}
}

class MainWnd_3 extends JFrame{
	/**
	 * 复选框的实现_Children
	 */
	private static final long serialVersionUID = 1L;
	JCheckBox cbEN=new JCheckBox("英文");
	JCheckBox cbCN=new JCheckBox("中文");
	JCheckBox cbGL=new JCheckBox("桂林");
	JLabel hello=new JLabel("Hello,my dear!",SwingConstants.CENTER);
	
	public MainWnd_3() {
		setTitle("Children");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel bp=new JPanel();
		bp.add(cbEN);
		bp.add(cbCN);
		bp.add(cbGL);
		
		Container cp=getContentPane();
		cp.add(bp, BorderLayout.NORTH);
		cp.add(hello,BorderLayout.CENTER);
		cp.validate();
		
		ItemListener il=new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String msg="";
				if(cbEN.isSelected()) msg+="*Children*";
				if(cbCN.isSelected()) msg+="*孩子*";
				if(cbGL.isSelected()) msg+="*小把爷*";
				hello.setText(msg);
			}
		};
		cbEN.addItemListener(il);
		cbCN.addItemListener(il);
		cbGL.addItemListener(il);
	}
}