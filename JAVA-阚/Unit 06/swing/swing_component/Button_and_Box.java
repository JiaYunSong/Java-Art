package swing_component;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;

/**
 * ��ѡ��ť�븴ѡ��
 * ���Ǵ�AbstractButton�̳�����
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
	 * ��ѡ���ʵ��_Children
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton cbEN=new JRadioButton("Ӣ��",true);
	JRadioButton cbCN=new JRadioButton("����");
	JRadioButton cbGL=new JRadioButton("����");
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
				else if(cbCN.isSelected()) msg="����";
				else if(cbGL.isSelected()) msg="С��ү";
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
	 * ��ѡ���ʵ��_Children
	 */
	private static final long serialVersionUID = 1L;
	JCheckBox cbEN=new JCheckBox("Ӣ��");
	JCheckBox cbCN=new JCheckBox("����");
	JCheckBox cbGL=new JCheckBox("����");
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
				if(cbCN.isSelected()) msg+="*����*";
				if(cbGL.isSelected()) msg+="*С��ү*";
				hello.setText(msg);
			}
		};
		cbEN.addItemListener(il);
		cbCN.addItemListener(il);
		cbGL.addItemListener(il);
	}
}