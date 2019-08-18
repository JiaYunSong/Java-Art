package swing_paint;

import java.awt.*;
import javax.swing.*;

public class CAU_Lit_01 {
	/**
	 * 话说农大之小学期
	 * @param g
	 */
	public void paint(Graphics g) {
		g.setFont(new Font("黑体",Font.PLAIN,18));
		g.drawString("中国农业大学！", 20, 80);
		g.setFont(new Font("宋体",Font.PLAIN,21));
		g.drawString("中国农业大学！！", 20, 110);
		g.setFont(new Font("宋体",Font.PLAIN,24));
		g.drawString("中国农业大学放假啦！！！", 20, 140);
		
		g.setColor(Color.CYAN);
		g.fillRect(20, 145, 450, 30);
		g.setColor(Color.blue);
		g.drawRect(20, 145, 450, 30);
		
		g.setFont(new Font("宋体",Font.PLAIN,27));
		g.setColor(Color.RED);
		g.drawString("然鹅还有学生和老师不能回家！！！！", 20, 170);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame w=new JFrame();
		w.setTitle("农大小学期");
		w.setLocation(700, 400);
		w.setSize(490,210);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Graphics g=w.getGraphics();
		
		CAU_Lit_01 s=new CAU_Lit_01();
		s.paint(g);
	}

}
