package T09_TextPad;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

/**
 * 参考下图界面，
 * 模仿Windows记事本基本功能编写一简单文本(Text)编辑器。
 * @author 黎夜之梦
 *
 */

public class TextPad {

	public static void main(String[] args) throws FileNotFoundException {
		JFrame w=new JFrame();
		w.setLocation(800, 400);
		w.setTitle("简单文本(Text)编辑器");
		w.setVisible(true);
		w.setSize(500, 500);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea ta=new JTextArea(8,10);
		ta.setFont(new Font("宋体",Font.PLAIN,20));
		JScrollPane jsp = new JScrollPane(ta);
		jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		ActionListener al=(ActionEvent e)->{
			JMenuItem src=(JMenuItem)(e.getSource());
			switch(src.getText()) {
			case "新建":
				ta.setText("");
				break;
			case "打开":
				try{
					File k=new File("./src/T09_TextPad/");
					JFileChooser f=new JFileChooser();
					f.setCurrentDirectory(k);
					f.showOpenDialog(null);
					k=f.getSelectedFile();
					f.setCurrentDirectory(k);
					k=f.getSelectedFile();
					String fi=k.toString();
					fi=k.toString();
					FileReader fr = new FileReader(fi);
					int c;
					while((c=fr.read())!=-1) {
						ta.setText(ta.getText()+(char)c);
					}
					fr.close();
				}
				catch (NullPointerException | IOException ee) {
					System.out.println("我是一个不想拥有梦的人吧");
				}
				break;
			case "保存":
				try{
					File k=new File("./src/T09_TextPad/");
					JFileChooser f=new JFileChooser();
					f.setDialogType(JFileChooser.SAVE_DIALOG);
					f.setCurrentDirectory(k);
					f.showOpenDialog(null);
					k=f.getSelectedFile();
					String fi=k.toString();
					FileWriter fw=new FileWriter(fi);
					fw.write(ta.getText());
					fw.flush();
					fw.close();
				}
				catch (NullPointerException | IOException ee) {
					System.out.println("或许有梦，只是不想说，埋在了其他地方");
				}
				break;
			case "关闭":
				w.dispose();
				break;
			case "帮助":
				JFrame ww=new JFrame();
				ww.setLocation(900,500);
				ww.setSize(300,100);
				ww.setTitle("帮助");
				ww.setVisible(true);
				JLabel ll=new JLabel("  文本框能力有限，对不起！");
				ll.setFont(new Font("宋体",Font.PLAIN,20));
				ww.add(ll);
				break;
			default:
				break;
			}
		};
		
		JMenuBar mb=new JMenuBar();
		JMenu m;
		JMenuItem mi;
		m=new JMenu("文件");
		mi=new JMenuItem("新建");mi.setFont(new Font("宋体",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		mi=new JMenuItem("打开");mi.setFont(new Font("宋体",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		mi=new JMenuItem("保存");mi.setFont(new Font("宋体",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		m.addSeparator();
		mi=new JMenuItem("关闭");mi.setFont(new Font("宋体",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		m.setFont(new Font("宋体",Font.PLAIN,20));
		mb.add(m);
		m=new JMenu("其他");
		mi=new JMenuItem("帮助");
		mi.setFont(new Font("宋体",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		m.setFont(new Font("宋体",Font.PLAIN,20));
		mb.add(m);

		w.setJMenuBar(mb);
		w.add(jsp);
		w.validate();
	}
	
}
