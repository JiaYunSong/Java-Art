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
		bEN=new JButton("����");
		bCN=new JButton("����");
		JPanel bp=new JPanel();    //��
		bp.add(bEN);
		bp.add(bCN);
		msg.setOpaque(true);
		msg.setBackground(Color.WHITE);
		msg.setText("���ڹ��ֵ�");
		Container cp=getContentPane();
		cp.add(bp, BorderLayout.NORTH);
		cp.add(msg, BorderLayout.CENTER);
		cp.validate();
		
//      ������������������
//		bCN.addActionListener((ActionEvent e)->
//			msg.setText("I love ����!")  );
//		bEN.addActionListener((ActionEvent e)->
//			msg.setText("I love ����!")  );
		
//      �������¹��ü���������
		ActionListener bl=(ActionEvent e)-> {
			if(e.getSource()==bEN)
				msg.setText("I love ����!");
			else if(e.getSource()==bCN)
				msg.setText("I love ����!");
		};
		bCN.addActionListener(bl);
		bEN.addActionListener(bl);
	}
}

//�������½�����������չ��
//class BcnClicked implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		msg.setText("I love ����!");
//	}
//	
//}



//�����¼���������
//ActionListener ItemListener
//TextEvent AdjustmentListener
//ComponentListener MouseListener MouseMotionListener
//KeyListener