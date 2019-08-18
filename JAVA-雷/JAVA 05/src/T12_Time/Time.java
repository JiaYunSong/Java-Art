package T12_Time;

import javax.swing.*;
import java.awt.*;
import java.util.logging.*;
import java.awt.event.*;
import javax.swing.GroupLayout.*;
import java.awt.Container.*;
import java.security.AccessController.*;
import java.util.*;


/**
 * 编写如下示意图所示的日历-时钟。
 * @author 黎夜之梦
 *
 */
@SuppressWarnings("unused")
public class Time {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		JFrame w = new JFrame();
		w.setVisible(true);
		
		JPanel jPanel1 = new JPanel();
		Label label1 = new Label();
		Label label2 = new Label();

		w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		w.setBackground(new Color(204, 204, 204));
		w.setLocation(700, 200);
		w.setTitle("茗心の时钟");

		jPanel1.setPreferredSize(new Dimension(300, 300));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 300, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 300, Short.MAX_VALUE));

		label1.setAlignment(Label.CENTER);
		label1.setFont(new Font("Dialog", 0, 24));
		label1.setText("XXXX年XX月XX日");

		label2.setAlignment(Label.CENTER);
		label2.setFont(new Font("Dialog", 0, 26));
		label2.setText("星期X");

		GroupLayout layout = new GroupLayout(w.getContentPane());
		w.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(57, 57, 57).addComponent(jPanel1,
					GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createSequentialGroup().addGap(81, 81, 81).addComponent(label1,
					GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createSequentialGroup().addGap(149, 149, 149).addComponent(label2,
					GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(67, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(36, 36, 36)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(label2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(48, Short.MAX_VALUE)));
		
		w.pack();

		Graphics g=jPanel1.getGraphics();
		g.setColor(Color.WHITE);
		g.drawString("初始化", 20, 20);
		g.setColor(Color.BLACK);
		g.fillArc(0, 0, 300, 300, 0, 360);
		
		Runnable r=()-> {
			while(true) {
				try {
					Date d=new Date();
					g.setColor(Color.WHITE);
					g.fillArc(10, 10, 280, 280, 0, 360);
					g.setColor(Color.BLACK);
					g.fillArc(145, 145, 10, 10, 0, 360);
					g.drawLine(150, 150, (int)(150+130*Math.cos(Math.toRadians(d.getSeconds()*6-90))),
							(int)(150+130*Math.sin(Math.toRadians(d.getSeconds()*6-90))));
					g.drawLine(150, 150, (int)(150+110*Math.cos(Math.toRadians(d.getMinutes()*6-90))),
							(int)(150+110*Math.sin(Math.toRadians(d.getMinutes()*6-90))));
					g.drawLine(150, 150, (int)(150+80*Math.cos(Math.toRadians(d.getHours()*15-90))),
							(int)(150+80*Math.sin(Math.toRadians(d.getHours()*15-90))));
					label1.setText((d.getYear()+1900)+"年"+(1+d.getMonth())+"月"+d.getDate()+"日");
					String s="";
					switch(d.getDay()) {
						case 0: s="星期天";break;
						case 1: s="星期一";break;
						case 2: s="星期二";break;
						case 3: s="星期三";break;
						case 4: s="星期四";break;
						case 5: s="星期五";break;
						case 6: s="星期六";break;
					}
					label2.setText(s);
					Thread.sleep(200);
				} catch (InterruptedException e) {
				}
			}
		};
		
		Thread t=new Thread(r);
		t.start();
	}
}
