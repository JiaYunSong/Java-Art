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
 * 用Java程序实现面的图画并配一段背景音乐（音乐文件自定）。
 * @author 黎夜之梦
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
		g.setFont(new Font("隶书",Font.PLAIN,50));
		g.drawString("送桂州严大夫同用南字", 162,172);
		g.setColor(Color.WHITE);
		g.setFont(new Font("隶书",Font.PLAIN,50));
		g.drawString("送桂州严大夫同用南字", 160,170);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("苍苍森八桂，兹地在湘南。", 182,252);
		g.setColor(Color.WHITE);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("苍苍森八桂，兹地在湘南。", 180,250);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("江作青罗带，山如碧玉篸。", 182,302);
		g.setColor(Color.WHITE);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("江作青罗带，山如碧玉篸。", 180,300);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("户多输翠羽，家自种黄甘。", 182,352);
		g.setColor(Color.WHITE);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("户多输翠羽，家自种黄甘。", 180,350);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("远胜登仙去，飞鸾不假骖。 ", 182,402);
		g.setColor(Color.WHITE);
		g.setFont(new Font("隶书",Font.PLAIN,40));
		g.drawString("远胜登仙去，飞鸾不假骖。 ", 180,400);
	}
	
}
