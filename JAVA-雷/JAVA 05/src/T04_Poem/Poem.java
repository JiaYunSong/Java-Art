package T04_Poem;

import java.applet.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * ��Java����ʵ�����ͼ������һ�α������֣������ļ��Զ�����
 * @author ��ҹ֮��
 *
 */

public class Poem extends Applet {
	private static final long serialVersionUID = 20190717201927L;
	Image jinli;
	AudioInputStream ais;

	@Override
	public void start() {
		jinli=getImage(getCodeBase(),"./T04_Poem/guilin.jpg");
		File f=new File("./T04_Poem/Candy_Wind.wav");
		try {
			ais=AudioSystem.getAudioInputStream(f);
		} catch (UnsupportedAudioFileException | IOException e) {}
		setSize(800,600);
		setLocation(300, 300);
		setBackground(Color.BLACK);
		setVisible(true);
		this.play();
	}
	
	public void play() {
		try {
			Clip c = AudioSystem.getClip();
			c.open(ais);
			c.setFramePosition(0);
			c.start();
		} catch ( LineUnavailableException 
				| IOException  e){}
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(jinli,0,0, 800, 600, this);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("����",Font.PLAIN,50));
		g.drawString("�͹����ϴ��ͬ������", 162,172);
		g.setColor(Color.WHITE);
		g.setFont(new Font("����",Font.PLAIN,50));
		g.drawString("�͹����ϴ��ͬ������", 160,170);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("�Բ�ɭ�˹��ȵ������ϡ�", 182,252);
		g.setColor(Color.WHITE);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("�Բ�ɭ�˹��ȵ������ϡ�", 180,250);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("�������޴���ɽ�����d��", 182,302);
		g.setColor(Color.WHITE);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("�������޴���ɽ�����d��", 180,300);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("��������𣬼����ֻƸʡ�", 182,352);
		g.setColor(Color.WHITE);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("��������𣬼����ֻƸʡ�", 180,350);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("Զʤ����ȥ����𽲻��� ", 182,402);
		g.setColor(Color.WHITE);
		g.setFont(new Font("����",Font.PLAIN,40));
		g.drawString("Զʤ����ȥ����𽲻��� ", 180,400);
	}
	
}
