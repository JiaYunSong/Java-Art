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
 * �ο���ͼ���棬
 * ģ��Windows���±��������ܱ�дһ���ı�(Text)�༭����
 * @author ��ҹ֮��
 *
 */

public class TextPad {

	public static void main(String[] args) throws FileNotFoundException {
		JFrame w=new JFrame();
		w.setLocation(800, 400);
		w.setTitle("���ı�(Text)�༭��");
		w.setVisible(true);
		w.setSize(500, 500);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea ta=new JTextArea(8,10);
		ta.setFont(new Font("����",Font.PLAIN,20));
		JScrollPane jsp = new JScrollPane(ta);
		jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		ActionListener al=(ActionEvent e)->{
			JMenuItem src=(JMenuItem)(e.getSource());
			switch(src.getText()) {
			case "�½�":
				ta.setText("");
				break;
			case "��":
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
					System.out.println("����һ������ӵ���ε��˰�");
				}
				break;
			case "����":
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
					System.out.println("�������Σ�ֻ�ǲ���˵�������������ط�");
				}
				break;
			case "�ر�":
				w.dispose();
				break;
			case "����":
				JFrame ww=new JFrame();
				ww.setLocation(900,500);
				ww.setSize(300,100);
				ww.setTitle("����");
				ww.setVisible(true);
				JLabel ll=new JLabel("  �ı����������ޣ��Բ���");
				ll.setFont(new Font("����",Font.PLAIN,20));
				ww.add(ll);
				break;
			default:
				break;
			}
		};
		
		JMenuBar mb=new JMenuBar();
		JMenu m;
		JMenuItem mi;
		m=new JMenu("�ļ�");
		mi=new JMenuItem("�½�");mi.setFont(new Font("����",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		mi=new JMenuItem("��");mi.setFont(new Font("����",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		mi=new JMenuItem("����");mi.setFont(new Font("����",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		m.addSeparator();
		mi=new JMenuItem("�ر�");mi.setFont(new Font("����",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		m.setFont(new Font("����",Font.PLAIN,20));
		mb.add(m);
		m=new JMenu("����");
		mi=new JMenuItem("����");
		mi.setFont(new Font("����",Font.PLAIN,20));
		mi.addActionListener(al);m.add(mi);
		m.setFont(new Font("����",Font.PLAIN,20));
		mb.add(m);

		w.setJMenuBar(mb);
		w.add(jsp);
		w.validate();
	}
	
}
