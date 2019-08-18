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
	 * �б��÷�
	 */
	private static final long serialVersionUID = 1L;
	JList<String> list;
	String listItems[]= {"Ӣ��","����","���ֻ�","������"};
	JLabel info=new JLabel("���ı�ѡ��",SwingConstants.CENTER);
	
	public MainWnd_5() {
		setTitle("��į��һ�ֿ�");
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
				if(index==-1) info.setText("��");
				else info.setText(listItems[index]+"��ѡ��");
			};
		list.addListSelectionListener(lsl);
	}
}