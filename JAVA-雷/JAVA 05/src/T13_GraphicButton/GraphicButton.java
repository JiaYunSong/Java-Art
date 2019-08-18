package T13_GraphicButton;

import java.awt.Graphics;

import javax.swing.*;

/**
 * ��java.awt.Button��Ϊ���࣬ ����GraphicButton�ࡣ ����ʵ��ͼƬ��ť������ͼ��ʾ��
 * �йذ�ť�����Ժ͹��ܲο�JavaAPI�ĵ���Button�ࡣ
 * @author ��ҹ֮��
 *
 */

public class GraphicButton extends JButton {
	private static final long serialVersionUID = 20190722140604L;
	
	

	@Override
	public void paint(Graphics g) {
		// TODO �Զ����ɵķ������
		super.paint(g);
	}



	public static void main(String[] args) { // ������
		JFrame w = new JFrame(); // ������ܴ����� JFrame �Ķ��� 
		w.setTitle("ͼ����ʾ����"); // ��ʼ������
		w.setSize(420, 320);
		w.setLocation(100, 100);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ڴ���������������һ����ʾͼ��ı�ǩ���
		JButton b=new JButton();
		w.add(b); // ����ǩ�������������м�
		w.validate(); // ��鲢�Զ��������������� // ��ͼ���ļ�����ͼ�񣬴���һ��ͼ�����
		ImageIcon ii = new ImageIcon("./src/T13_GraphicButton/����.jpg");
		b.setIcon(ii); // �ڱ�ǩ�������ʾͼ��
	}
}