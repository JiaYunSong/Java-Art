package swing_component;

import java.awt.*;   // abstract window toolkit
import javax.swing.*;
import javax.swing.event.*;  //!!!!!!!!

public class JList_test {
	public static void main(String[] args) {
		new MainWnd_5();
	}
}

class MainWnd_5 extends JFrame{
	/**
	 * 列表用法
	 */
	private static final long serialVersionUID = 1L;
	JList<String> list;
	String listItems[]= {"英文","中文","桂林话","哈哈哈"};
	JLabel info=new JLabel("中文被选中",SwingConstants.CENTER);
	
	public MainWnd_5() {
		setTitle("寂寞是一种苦");
		setSize(500,200);
		setLocation(800,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		list=new JList<String>(listItems);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);;
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(3);
		list.setSelectedIndex(1);
		JScrollPane listScroller=new JScrollPane(list);
		
		Container cp=getContentPane();
		cp.add(listScroller, BorderLayout.NORTH);
		cp.add(info,BorderLayout.CENTER);
		cp.validate();
		
		ListSelectionListener lsl=(ListSelectionEvent e) ->{
				int index=list.getSelectedIndex();
				if(index==-1) info.setText("无");
				else info.setText(listItems[index]+"被选中");
			};
		list.addListSelectionListener(lsl);
	}
}