package swing_component;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;


public class JComboBox_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWnd_4();
	}
}

class MainWnd_4 extends JFrame{
	/**
	 * �����б�
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<String> list;
	String listItems[]= {"Ӣ��","����","���ֻ�"};
	JLabel info=new JLabel("",SwingConstants.CENTER);
	
	public MainWnd_4() {
		setTitle("Friend");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		list=new JComboBox<String>(listItems);
		list.setMaximumRowCount(2);
		list.setSelectedIndex(1);
		
		Container cp=getContentPane();
		cp.add(list, BorderLayout.NORTH);
		cp.add(info, BorderLayout.SOUTH);
		cp.validate();
		
		ItemListener il=new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				JComboBox<?> cb=(JComboBox<?>)e.getSource();
				String item=(String) cb.getSelectedItem();
				info.setText(item+"��ѡ�У�");
			}};
		list.addItemListener(il);
	}
}