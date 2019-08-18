package girlfriend;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GirlFriend {
	public static void main(String[] args) {
		JFrame w=new JFrame();
		w.setTitle("相信你是一个说到做到的人");
		w.setSize(450, 150);
		w.setLocation(775, 400);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=w.getContentPane();
		
		JPanel down1=new JPanel();
		down1.setLayout(new FlowLayout());
		JLabel info=new JLabel("程序准备搞事，你准备好了吗？");
		info.setFont(new Font("微软雅黑",Font.PLAIN,21));
		down1.add(info);
		cp.add(down1, BorderLayout.NORTH);
		
		JPanel down2=new JPanel();
		down2.setLayout(new FlowLayout());
		JButton btn=new JButton("好了！");
		btn.setFont(new Font("微软雅黑",Font.PLAIN,19));
		down2.add(btn);
		cp.add(down2, BorderLayout.CENTER);
		
		JLabel author=new JLabel("Copyright.rsmx.2019.07.05.apt1554",JLabel.RIGHT);
		author.setFont(new Font("微软雅黑",Font.PLAIN,12));
		author.setForeground(Color.GRAY);
		cp.add(author, BorderLayout.SOUTH);
		
		cp.validate();
		
		JFrame mes=new JFrame();
		mes.setTitle("甩锅专用");
		mes.setSize(450, 100);
		mes.setLocation(775, 400);
		mes.setVisible(false);
		mes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mes.setLayout(new FlowLayout());
		JLabel message=new JLabel("思路来源，亲爱的舍友火乐乐。");
		message.setFont(new Font("微软雅黑",Font.PLAIN,18));
		mes.add(message);
		
		String recall[]= {"我会爱你的!","我真的会爱你的！","一定要相信我的真心！","别吧，就从我一次呗！","人家不要嘛！",
				"你拒绝了，就再也找不到更好的了！","生命那么短，世界那么乱，我不想争吵，不想冷战，不愿和你有一秒遗憾。",
				"我爱你，胜过爱自己。","多希望你能明白我，即使我什么也不说。","如果爱你是错的话，我不想对。","如果对是等于没有你的话，我宁愿错一辈子。",
				"如果非要把着份爱加上一个期限，我希望是一万年。","只要你一直在我身边，其他东西不再重要。","人世间纵有风情万种，我却情有独钟。",
				"只要我的心还在跳，它便是因你而跳。","拥有你，是我一生的精彩，我的信心来自你的魅力。","我爱你，请相信我！",
				"我不是一个百分之百的好人，但是我对你是百分之百的用心。","我的人生从今往后都是你！"};
		String answer2_two[]= {"就是不要","走开","不不不","我拒绝"};
		
		btn.addActionListener((ActionEvent e)->{
			if(btn.getText()=="诶呀，讨厌啦！") {
				w.setVisible(false);
				mes.setVisible(true);
			}
			else {
				Object[] answer1 = {"想的","不要"}; 
				int opt=JOptionPane.showOptionDialog(w,"你想做我的女朋友吗？",null, JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE,null, answer1, answer1[0]);
				int i=0,j=0,jj=0,time=0;
				while(opt!=JOptionPane.YES_OPTION){
					Object[] answer2 = {"那就同意你吧",answer2_two[j]};
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
				info.setText("搞定3号目标!");
				btn.setText("诶呀，讨厌啦！");
				btn.setFont(new Font("微软雅黑",Font.PLAIN,17));
			}
		});
	}
}