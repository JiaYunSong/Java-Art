package timerTask;

import java.util.*;
import java.time.*;

public class TimerTasktest extends TimerTask {
	public int count=0;
	public static void main(String[] args) {
		Timer t=new Timer("Show time");
		TimerTasktest st=new TimerTasktest();
		t.schedule(st, 0, 1000);
		
		//相当于后台静默执行
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {}
		while(st.count<5) {
			System.out.println(t.toString());

			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {}
		}
		//t.cancel();
		System.out.println("TimerTask stopped");
	}
	
	@Override
	public void run() {
		count++;
		System.out.println("Local:"+LocalDateTime.now());
	}
}
