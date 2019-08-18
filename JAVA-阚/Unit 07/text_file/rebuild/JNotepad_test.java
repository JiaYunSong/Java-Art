package rebuild;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class JNotepad_test {
	public static void main(String[] args) {
		class MainWnd extends JFrame{
			private static final long serialVersionUID = 1L;
			JTextArea text=new JTextArea(10,20);
			JButton bOpen=new JButton("打开");
			JButton bSave =new JButton("保存");
			public MainWnd() {
				setTitle("文本编辑器演示程序");
				setSize(450,200);
				setLocation(800,400);
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				text.setBackground(Color.WHITE);
				
				JPanel bPane=new JPanel();
				bPane.add(bOpen);
				bPane.add(bSave);
				Container cp=getContentPane();
				cp.add(bPane, BorderLayout.NORTH);
				cp.add(text,BorderLayout.CENTER);
				cp.validate();
				
				bSave.addActionListener((ActionEvent e)->{
					JFileChooser fc=new JFileChooser("./in_using/in_out");
					fc.showSaveDialog(null);
					File f=fc.getSelectedFile();
					try {
						BufferedWriter out=new BufferedWriter(new FileWriter(f));
						String txt=text.getText();
						int p1=0,p2;
						while(true) {
							p2=txt.indexOf('\n',p1);
							if(p2==-1) {
								 out.write(txt.substring(p1));
								 break;
							}
							else {
								out.write(txt.substring(p1, p2));
								out.newLine();
								p1=p2+1;
							}
						}
						out.close();
					}
					catch(IOException ee) {
						System.out.println(ee.getMessage());
					}
				});
				
				bOpen.addActionListener((ActionEvent e)->{
					JFileChooser fc=new JFileChooser("./in_using/in_out");
					fc.showOpenDialog(null);
					File f=fc.getSelectedFile();
					try {
						BufferedReader in=new BufferedReader(new FileReader(f));
						text.setText("");
						String s;
						while((s=in.readLine())!=null) {
							text.append(s+"\n");
							in.close();
						}
					}
					catch(IOException ee){
						System.out.println(ee.getMessage());
					}
				});
			}
		}
		new MainWnd();
	}
}
