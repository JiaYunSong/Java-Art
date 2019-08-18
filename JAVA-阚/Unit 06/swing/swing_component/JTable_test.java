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
	 * 表格类
	 */
	private static final long serialVersionUID = 1L;
	
	
	JTable list;
	public MainWnd_6() {
		setTitle("表格类");
		setSize(300,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String columnNames[]= {"姓名","成绩"};
		Object data[][]= {{"张三",92},{"李四",86},{"王五",95}};
		list=new JTable(data,columnNames);
		JScrollPane listScroller=new JScrollPane(list);
		list.setFillsViewportHeight(true);
		
		Container cp=getContentPane();
		cp.add(listScroller, BorderLayout.CENTER);
		cp.validate();
	}
}