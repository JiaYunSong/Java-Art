package girlfriend;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GirlFriend {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("��������һ��˵����������");
		w.setSize(450, 150);
		w.setLocation(775, 400);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		
		JPanel down1=new JPanel();
		down1.setLayout(new FlowLayout());
		JLabel info=new JLabel("����׼�����£���׼��������");
		info.setFont(new Font("΢���ź�",Font.PLAIN,21));
		down1.add(info);
		cp.add(down1, BorderLayout.NORTH);
		
		JPanel down2=new JPanel();
		down2.setLayout(new FlowLayout());
		JButton btn=new JButton("���ˣ�");
		btn.setFont(new Font("΢���ź�",Font.PLAIN,19));
		down2.add(btn);
		cp.add(down2, BorderLayout.CENTER);
		
		JLabel author=new JLabel("Copyright.rsmx.2019.07.05.apt1554",JLabel.RIGHT);
		author.setFont(new Font("΢���ź�",Font.PLAIN,12));
		author.setForeground(Color.GRAY);
		cp.add(author, BorderLayout.SOUTH);
		
		cp.validate();
		
		JFrame mes=new JFrame();
		mes.setTitle("˦��ר��");
		mes.setSize(450, 100);
		mes.setLocation(775, 400);
		mes.setVisible(false);
		mes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mes.setLayout(new FlowLayout());
		JLabel message=new JLabel("˼·��Դ���װ������ѻ����֡�");
		message.setFont(new Font("΢���ź�",Font.PLAIN,18));
		mes.add(message);
		
		String recall[]= {"�һᰮ���!","����Ļᰮ��ģ�","һ��Ҫ�����ҵ����ģ�","��ɣ��ʹ���һ���£�","�˼Ҳ�Ҫ�",
				"��ܾ��ˣ�����Ҳ�Ҳ������õ��ˣ�","������ô�̣�������ô�ң��Ҳ���������������ս����Ը������һ���ź���",
				"�Ұ��㣬ʤ�����Լ���","��ϣ�����������ң���ʹ��ʲôҲ��˵��","��������Ǵ�Ļ����Ҳ���ԡ�","������ǵ���û����Ļ�������Ը��һ���ӡ�",
				"�����Ҫ���ŷݰ�����һ�����ޣ���ϣ����һ���ꡣ","ֻҪ��һֱ������ߣ���������������Ҫ��","���������з������֣���ȴ���ж��ӡ�",
				"ֻҪ�ҵ��Ļ����������������������","ӵ���㣬����һ���ľ��ʣ��ҵ������������������","�Ұ��㣬�������ң�",
				"�Ҳ���һ���ٷ�֮�ٵĺ��ˣ������Ҷ����ǰٷ�֮�ٵ����ġ�","�ҵ������ӽ��������㣡"};
		String answer2_two[]= {"���ǲ�Ҫ","�߿�","������","�Ҿܾ�"};
		
		btn.addActionListener((ActionEvent e)->{
			if(btn.getText()=="��ѽ����������") {
				w.setVisible(false);
				mes.setVisible(true);
			}
			else {
				Object[] answer1 = {"���","��Ҫ"}; 
				int opt=JOptionPane.showOptionDialog(w,"�������ҵ�Ů������",null, JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE,null, answer1, answer1[0]);
				int i=0,j=0,jj=0,time=0;
				while(opt!=JOptionPane.YES_OPTION){
					Object[] answer2 = {"�Ǿ�ͬ�����",answer2_two[j]};
					opt=JOptionPane.showOptionDialog(w,recall[i],null, JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.INFORMATION_MESSAGE,null, answer2, answer2[0]);
					i++;
					j=(int)(0+Math.random()*(answer2_two.length));
					if(j==jj) {
						time++;
						if(time>1) {
							if(j<answer2_two.length-1) j++;
							else j=0;
							time=0;
						}
					}
					jj=j;
					if(i>=recall.length) i=0;
				}
				info.setText("�㶨3��Ŀ��!");
				btn.setText("��ѽ����������");
				btn.setFont(new Font("΢���ź�",Font.PLAIN,17));
			}
		});
	}
}