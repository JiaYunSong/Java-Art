package swing_paint;

import java.awt.*;
import javax.swing.*;

public class CAU_Lit_02 {
	/**
	 * 话说农大之小学期（升级版）
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWnd w=new MainWnd();
		w.repaint();
	}
}

class MainWnd extends JFrame{
	/**
	 * 放大缩小界面不会丢失
	 */
	private static final long serialVersionUID = 1L;
	public MainWnd() {
		setTitle("农大小学期");
		setLocation(700, 400);
		setSize(490,210);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		super.paint(g);
		CAU_Lit_01 s=new CAU_Lit_01();
		s.paint(g);
	}
}