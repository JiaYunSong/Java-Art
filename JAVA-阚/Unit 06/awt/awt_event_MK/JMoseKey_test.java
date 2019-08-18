package awt_event_MK;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMoseKey_test {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("鼠标——using");
		w.setSize(1000,1000);
		w.setLocation(400, 400);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		JLabel info=new JLabel("检查键盘和鼠标动作");
		cp.add(info, BorderLayout.NORTH);
		cp.setBackground(Color.YELLOW);
		cp.validate();
		
		w.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {
				info.setText("单击");
				cp.setBackground(Color.CYAN);
				System.out.println(arg0.getWhen());
			}
			public void mouseEntered(MouseEvent arg0) {
				info.setText("进入");
				cp.setBackground(Color.ORANGE);
			}
			public void mouseExited(MouseEvent arg0) {
				info.setText("离开");
				cp.setBackground(Color.YELLOW);
			}
			public void mousePressed(MouseEvent arg0) {
				info.setText("按下");
				cp.setBackground(Color.GREEN);
			}
			public void mouseReleased(MouseEvent arg0) {
				info.setText("松开");
			}
		});
		
		w.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {
				String str=String.format("鼠标在移动：%d,%d", e.getX(),e.getY());
				info.setText(str);
			}
			public void mouseDragged(MouseEvent e) {
				String str=String.format("鼠标在拖动：%d,%d", e.getX(),e.getY());
				info.setText(str);
				Graphics g=w.getGraphics();
				g.setColor(new Color(e.getX()%255,e.getY()%255,(e.getX()+e.getY())%255));
				g.drawLine(w.getWidth()/2, w.getHeight()/2, e.getX(), e.getY());
			}
		});
		
		cp.requestFocus();
		cp.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				char i=e.getKeyChar();
				cp.setBackground(new Color(i*7%255,i*3%255,i%255));
			}
			public void keyReleased(KeyEvent e) {
				info.setText("按下");
			}
			public void keyTyped(KeyEvent e) {
				info.setText("松开");
			}
		});
	}
}
