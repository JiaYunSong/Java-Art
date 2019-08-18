package localDateTimetest;

import java.time.LocalDateTime;

public class LocalDateTime_test implements Runnable {
	static public LocalDateTime time=LocalDateTime.of(2019, 7, 25, 15, 20, 17);
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		LocalDateTime_test t=new LocalDateTime_test();
		System.out.println(time.getYear()
				+"/"+time.getMonthValue()
				+"/"+time.getDayOfMonth());
		Thread n=new Thread(t);
		try {
			n.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		n.start();
	}

	@Override
	public void run() {
		
		System.out.println(time.getHour()
				+":"+time.getMinute()
				+":"+time.getSecond());
	}

}
