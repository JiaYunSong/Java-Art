package T08_Calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;

/**
 * 参考下图界面，编写一简单计算器。
 * @author 黎夜之梦
 *
 */

public class Calculator {
	public static int $=1;
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setLocation(800, 200);
		w.setSize(500, 500);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel msg=new JLabel();
		msg.setFont(new Font("黑体",Font.BOLD,40));
		msg.setText("0");
		JPanel pmsg=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pmsg.add(msg);
		

		JPanel pb1=new JPanel(new GridLayout(4,4,10,10));
		String mes1[]= {"<=","CE","C","%",
					   "7","8","9","/",
					   "4","5","6","*",
					   "1","2","3","-",};
		JButton btn[]=new JButton[16];
		for(int i=0; i<16; i++) {
			JButton b1=new JButton(mes1[i]);
			b1.setFont(new Font("黑体",Font.BOLD,40));
			btn[i]=b1;
			if(i>3 && i%4!=3)
				btn[i].addActionListener((ActionEvent e)->{
					if(msg.getText().equals("0")||msg.getText().equals("ERROR!")||$==0) {
						$=1;
						msg.setText(((JButton)(e.getSource())).getText());
					}
					else if(msg.getText().length()<16 && msg.getText().length()>2){
						char c1=msg.getText().charAt(msg.getText().length()-1);
						char c2=msg.getText().charAt(msg.getText().length()-2);
						if( !(c1=='0' && !(c2>='0'&&c2<='9'||c2=='.')) )
							msg.setText(msg.getText()+((JButton)(e.getSource())).getText());
					}
					else if(msg.getText().length()<16){
						char c=msg.getText().charAt(msg.getText().length()-1);
						if(c!='%')
							msg.setText(msg.getText()+((JButton)(e.getSource())).getText());
					}
				});
			else if(i>3 && i%4==3)
				btn[i].addActionListener((ActionEvent e)->{
					if(msg.getText().equals("ERROR!"))
						msg.setText("0");
					else if(msg.getText().length()<16){
						char c=msg.getText().charAt(msg.getText().length()-1);
						if(c>='0'&&c<='9'||c=='%')
							msg.setText(msg.getText()+((JButton)(e.getSource())).getText());
					}
				});
		}
		btn[0].addActionListener((ActionEvent e)->{
			if(msg.getText().equals("0") || msg.getText().equals("ERROR!"))
				msg.setText("0");
			else if(msg.getText().length()==1)
				msg.setText("0");
			else msg.setText(msg.getText().substring(0, msg.getText().length()-1));
		});
		btn[1].addActionListener((ActionEvent e)->{
			msg.setText("0");
		});
		btn[2].addActionListener((ActionEvent e)->{
			msg.setText("0");
		});
		btn[3].addActionListener((ActionEvent e)->{
			if(msg.getText().equals("ERROR!"))
				msg.setText("0");
			if(msg.getText().length()<16){
				char c=msg.getText().charAt(msg.getText().length()-1);
				if(c>='0'&&c<='9')
					msg.setText(msg.getText()+((JButton)(e.getSource())).getText());
			}
		});
		for(int n=0; n<16; n++)
			pb1.add(btn[n]);
		
		JPanel pb2=new JPanel(new GridLayout(1,2,10,10));
		String mes2[]= {"0",".","+"};
		JButton btn1[]=new JButton[3];
		for(int i=0; i<3; i++) {
			JButton b1=new JButton(mes2[i]);
			b1.setFont(new Font("黑体",Font.BOLD,40));
			btn1[i]=b1;
		}
		JPanel pb22=new JPanel(new GridLayout(1,2,10,10));
		btn1[0].addActionListener((ActionEvent e)->{
			if(msg.getText().equals("0")||msg.getText().equals("ERROR!"))
				msg.setText("0");
			else if(msg.getText().length()<16 && msg.getText().length()>2){
				char c1=msg.getText().charAt(msg.getText().length()-1);
				char c2=msg.getText().charAt(msg.getText().length()-2);
				if( !(c1=='0' && !(c2>='0'&&c2<='9'||c2=='.')) ) {
					msg.setText(msg.getText()+"0");
				}
			}
			else msg.setText(msg.getText()+"0");
		});
		btn1[1].addActionListener((ActionEvent e)->{
			if(msg.getText().equals("ERROR!"))
				msg.setText("0");
			if(msg.getText().length()<16 && msg.getText().length()>1){
				char c=msg.getText().charAt(msg.getText().length()-1);
				if(c>='0' && c<='9') {
					int i=msg.getText().length()-1;
					for(; i>0; i--)
						if(!(msg.getText().charAt(i)>='0' && msg.getText().charAt(i)<='9'))
							break;
					if(msg.getText().charAt(i)!='.')
						msg.setText(msg.getText()+".");
				}
			}
			else {
				msg.setText(msg.getText()+".");
			}
		});
		btn1[2].addActionListener((ActionEvent e)->{
			if(msg.getText().equals("ERROR!"))
				msg.setText("0");
			else if(msg.getText().length()<16){
				char c=msg.getText().charAt(msg.getText().length()-1);
				if(c>='0'&&c<='9'||c=='%')
					msg.setText(msg.getText()+"+");
			}
		});
		pb2.add(btn1[0]);
		pb22.add(btn1[1]);
		pb22.add(btn1[2]);
		pb2.add(pb22);
		
		
		JPanel pbn=new JPanel(new BorderLayout());
		pbn.add(pb1,BorderLayout.CENTER);
		pbn.add(pb2,BorderLayout.SOUTH);
		
		JPanel pb3=new JPanel(new GridLayout(2,1,10,10));
		JButton b=new JButton("=");
		b.setFont(new Font("黑体",Font.BOLD,40));
		b.addActionListener((ActionEvent e)->{
			if(msg.getText().equals("ERROR!"))
				msg.setText("0");
			String a=msg.getText();
			char c=a.charAt(a.length()-1);
			Matcher matcher = Pattern.compile("[^.\\d]").matcher(a);
			if(!matcher.find()) ;
			else if(!(c>='0'&&c<='9'||c=='%')) {
				msg.setText("ERROR!");
			}
			else {
				msg.setText("Working!");
				msg.setText(AddOrSub.StringToRes(a+"="));
				$=0;
			}
		});
		JLabel bm=new JLabel();
		pb3.add(bm); pb3.add(b);
		
		JPanel pb=new JPanel(new BorderLayout());
		pb.add(pbn,BorderLayout.CENTER);
		pb.add(pb3,BorderLayout.EAST);
		
		w.add(pmsg,BorderLayout.NORTH);
		w.add(pb,BorderLayout.CENTER);
		
		w.validate();
	}
}
