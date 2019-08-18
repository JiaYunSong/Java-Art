package awt_canvas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCanvas_test {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("JCanvas——using");
		w.setSize(400,300);
		w.setLocation(800,400);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		JLabel info=new JLabel("在画布上单击鼠标显示字符，或敲击键盘按键选择字符");
		MyCanvas cv=new MyCanvas();
		cp.add(info, BorderLayout.NORTH);
		cp.add(cv,BorderLayout.CENTER);
		cp.validate();
		
		cv.addMouseListener((new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				cv.x=arg0.getX();
				cv.y=arg0.getY();
				cv.repaint();
			}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		}));
		
		cv.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent arg0) {}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {
				cv.key=arg0.getKeyChar();
			}
		});
	}
}

class MyCanvas extends Canvas{
	/**
	 * 点击画圆，加字
	 */
	private static final long serialVersionUID = 1L;
	public int x=-1,y=-1;
	public char key='+';
	private Font ef=new Font("宋体",Font.PLAIN,32);
	public MyCanvas() {
		setBackground(Color.YELLOW);
	}
	public void paint(Graphics g) {
		if(x==-1||y==-1) return;
		g.drawOval(x-5, y-25, 27, 27);
		g.setFont(ef);
		g.drawString(String.valueOf(key), x	, y);
	}
}