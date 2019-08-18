package image_file;

import java.io.File;

import javax.sound.sampled.*;

public class AudioWav_test {

	public static void main(String[] args) {
		try {
			File f=new File("./other_file/image_file/1.wav");
			AudioInputStream ais=AudioSystem.getAudioInputStream(f);
			System.out.println(ais.getFormat());
			Clip c=AudioSystem.getClip();
			c.open(ais);
			c.setFramePosition(0);
			System.out.println("Start");
			c.start();
			Thread.sleep(10000);
			c.close();
			System.out.println("Close");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
