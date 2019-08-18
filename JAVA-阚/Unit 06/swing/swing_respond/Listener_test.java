package swing_respond;

import java.awt.*;   // abstract window toolkit
import java.awt.event.*;
import javax.swing.*;

public class Listener_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWnd();
	}
}

class MainWnd extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bEN,bCN;
	private JLabel msg =new JLabel();
	public MainWnd(){
		setTitle("Responding_test");
		setSize(390,120);
		setLocation(800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bEN=new JButton("奎光");
		bCN=new JButton("桂中");
		JPanel bp=new JPanel();    //子
		bp.add(bEN);
		bp.add(bCN);
		msg.setOpaque(true);
		msg.setBackground(Color.WHITE);
		msg.setText("都在桂林的");
		Container cp=getContentPane();
		cp.add(bp, BorderLayout.NORTH);
		cp.add(msg, BorderLayout.CENTER);
		cp.validate();
		
//      可以如下用匿名方法
//		bCN.addActionListener((ActionEvent e)->
//			msg.setText("I love 桂中!")  );
//		bEN.addActionListener((ActionEvent e)->
//			msg.setText("I love 奎光!")  );
		
//      可以如下共用监听器对象
		ActionListener bl=(ActionEvent e)-> {
			if(e.getSource()==bEN)
				msg.setText("I love 奎光!");
			else if(e.getSource()==bCN)
				msg.setText("I love 桂中!");
		};
		bCN.addActionListener(bl);
		bEN.addActionListener(bl);
	}
}

//可以如下建立监听器扩展类
//class BcnClicked implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		msg.setText("I love 桂中!");
//	}
//	
//}



//常用事件监听器：
//ActionListener ItemListener
//TextEvent AdjustmentListener
//ComponentListener MouseListener MouseMotionListener
//KeyListener