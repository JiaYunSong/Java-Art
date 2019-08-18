package T13_GraphicButton;

import java.awt.Graphics;

import javax.swing.*;

/**
 * 以java.awt.Button类为父类， 创建GraphicButton类。 该类实现图片按钮，如下图所示。
 * 有关按钮的特性和功能参考JavaAPI文档中Button类。
 * @author 黎夜之梦
 *
 */

public class GraphicButton extends JButton {
	private static final long serialVersionUID = 20190722140604L;
	
	

	@Override
	public void paint(Graphics g) {
		// TODO 自动生成的方法存根
		super.paint(g);
	}



	public static void main(String[] args) { // 主方法
		JFrame w = new JFrame(); // 创建框架窗口类 JFrame 的对象 
		w.setTitle("图像演示程序"); // 初始化窗口
		w.setSize(420, 320);
		w.setLocation(100, 100);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 在窗口内容面板里添加一个显示图像的标签组件
		JButton b=new JButton();
		w.add(b); // 将标签放在内容面板的中间
		w.validate(); // 检查并自动布局容器里的组件 // 从图像文件加载图像，创建一个图标对象
		ImageIcon ii = new ImageIcon("./src/T13_GraphicButton/锦鲤.jpg");
		b.setIcon(ii); // 在标签组件中显示图像
	}
}