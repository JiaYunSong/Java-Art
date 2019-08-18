package swing_component;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;

public class JTable_test {
	public static void main(String[] args) {
		new MainWnd_6();
	}
}

class MainWnd_6 extends JFrame{
	/**
	 * �����
	 */
	private static final long serialVersionUID = 1L;
	
	
	JTable list;
	public MainWnd_6() {
		setTitle("�����");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String columnNames[]= {"����","�ɼ�"};
		Object data[][]= {{"����",92},{"����",86},{"����",95}};
		list=new JTable(data,columnNames);
		JScrollPane listScroller=new JScrollPane(list);
		list.setFillsViewportHeight(true);
		
		Container cp=getContentPane();
		cp.add(listScroller, BorderLayout.CENTER);
		cp.validate();
	}
}