package image_file;

import java.io.*;
import javax.sound.sampled.*;

public class AudioFormat_test {
	public static void main(String[] args) {
		AudioFormat af;
		TargetDataLine tLine;
		SourceDataLine sLine;
		byte buf[]=new byte[1024*100];
		af=new AudioFormat(8000f,16,1,true,true);
		try {
			DataLine.Info info=new DataLine.Info(TargetDataLine.class, af);
			if(!AudioSystem.isLineSupported(info)){
				System.out.println("Line not supported!");
				return;
			}
			tLine=(TargetDataLine)AudioSystem.getLine(info);
			System.out.println("Line Strat!");
			tLine.open(af);
			tLine.start();
			int dataLen=tLine.read(buf, 0, buf.length);
			tLine.stop();
			tLine.close();
			System.out.println("Line Stop!");
			
			info=new DataLine.Info(SourceDataLine.class, af);
			sLine=(SourceDataLine)AudioSystem.getLine(info);
			System.out.println("Play!");
			sLine.open(af);
			sLine.start();
			sLine.write(buf, 0, dataLen);
			sLine.drain();
			sLine.close();
			ByteArrayInputStream inBuf=new ByteArrayInputStream(buf);
			AudioInputStream ais=new AudioInputStream(inBuf,af,dataLen/af.getFrameSize());
			System.out.println("Save");
			File fout=new File("./other_file/image_file/1.wav");
			AudioSystem.write(ais, AudioFileFormat.Type.WAVE, fout);
			ais.close();
			inBuf.close();
		}
		catch(LineUnavailableException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
