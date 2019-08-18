package Odd;

import java.applet.*;
import java.awt.*;

public class BlackAndWhite extends Applet {
	private static final long serialVersionUID = 20190717222619L;
	
	static Color c1=Color.BLACK;
	static Color c2=Color.RED;
	final int p=2;

	@Override
	public void start() {
		setSize(1920-6,1000);
		setLocation(300, 300);
		setVisible(true);
		setBackground(c1);
	}

	@Override
	public void paint(Graphics g) {
		setBackground(c1);
		g.setColor(c2);
		int x=1;
		for(int j=0; j<this.getHeight()/p; j++)
			for(int i=0; i<this.getWidth()/p; i++) {
			 	int odd=i+this.getWidth()/p*j+1;
			 	int oddc1=odd%256;
			 	int oddc2=oddc1-85;
			 	if(oddc2<0) oddc2+=256;
			 	int oddc3=oddc2-85;
			 	if(oddc3<0) oddc3+=256;
				if(Mathe.IsPrime(odd)) {
					System.out.print(odd+"\t");
					if(x%10==0) {
						 System.out.println();
						 x=0;
					}
					g.setColor(new Color(oddc1,oddc2,oddc3));
					g.fillRect(p*i, p*j, p, p);
					x++;
				}
			 }
		System.out.println();
	}
	
}
