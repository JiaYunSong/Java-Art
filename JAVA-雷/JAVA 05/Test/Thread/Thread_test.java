package Thread;

import java.awt.Color;
import java.awt.Graphics;

public class Thread_test implements Runnable{
	public static final int w=8,h=8;
	
	private int x,y;
	private int width=w,height=h;
	private Color color=Color.GREEN;
	private Color fill=Color.RED;
	
	
	
	public Thread_test() {
	}
	public Thread_test(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Thread_test(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Color getFill() {
		return fill;
	}
	public void setFill(Color fill) {
		this.fill = fill;
	}
	public static int getW() {
		return w;
	}
	public static int getH() {
		return h;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, 50, 50);
		g.setColor(Color.BLUE);
		g.drawRect(50, 50, 50, 50);
	}
	
	@Override
	public void run() {
		
	}
	public static void main(String[] args) {
		
	}

}
