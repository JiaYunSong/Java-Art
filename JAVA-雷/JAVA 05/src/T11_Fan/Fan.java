package T11_Fan;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.*;
import java.awt.Container.*;
import java.awt.event.*;

/**
 * 编写程序在窗口模拟一个旋转的风扇。
 * @author 黎夜之梦
 *
 */

@SuppressWarnings("unused")
public class Fan {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		
		JFrame w=new JFrame();
		w.setVisible(true);
		
		Panel panel1 = new Panel();
		Button button1 = new Button();
		Button button2 = new Button();

		w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		w.setBackground(new Color(204, 204, 204));

		GroupLayout panel1Layout = new GroupLayout(panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 236, Short.MAX_VALUE));

		button1.setFont(new Font("Dialog", 0, 16));
		button1.setLabel("开始");

		button2.setFont(new Font("Dialog", 0, 16));
		button2.setLabel("停止");

		GroupLayout layout = new GroupLayout(w.getContentPane());
		w.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
				.addComponent(panel1, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(0, 87, Short.MAX_VALUE)
				.addComponent(button1, GroupLayout.PREFERRED_SIZE, 83,GroupLayout.PREFERRED_SIZE)
				.addGap(46, 46, 46).addComponent(button2, GroupLayout.PREFERRED_SIZE, 83,GroupLayout.PREFERRED_SIZE)
				.addGap(99, 99, 99)))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
				.addComponent(panel1, GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(button1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
				.addComponent(button2, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap()));
		
		int x=140,y=50;
		
		class Run  implements Runnable{
			int i=0;
			Graphics g;
			public Run(Graphics gg) {
				g=gg;
			}
			
			@Override
			public void run() {
				try {
					while(true) {
						if(i==3600) i=0;
						paint();
						Thread.sleep(5);
						i++;
					}
				} catch (InterruptedException e) {
				}
			}
			
			public void paint() {
				int c1=i%3600*255/3600;
				int c2=85+c1;
				if(c2>255) c2-=255;
				int c3=85+c2;
				if(c3>255) c3-=255;
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 1920, 1080);
				g.setColor(new Color(c1,c2,c3));
				g.fillArc(x-30, y-30, 160, 170, 0, 360);
				g.setColor(Color.WHITE);
				g.fillArc(x-25, y-25, 120, 150, 0, 360);
				g.setColor(new Color(c1,c2,c3));
				g.fillArc(x-10, y-10, 80, 120, i, 60);
				g.fillArc(x-10, y-10, 80, 120, i+120, 60);
				g.fillArc(x-10, y-10, 80, 120, i+240, 60);
			}
		}
		
		Run r=new Run(panel1.getGraphics());
		Thread t=new Thread(r);
		t.start();
		
		button1.addActionListener((ActionEvent arg0)->t.resume() );
		button2.addActionListener((ActionEvent arg0)->t.suspend() );
		
		w.pack();
	}
}