package JProducerCosumer;

public class Producer implements Runnable {
	private DataBox dBox;
	private int[] x= {1,2,3,4,8,-1};
	public Producer(DataBox d) {
		dBox=d;
	}
	public void run() {
		for(int n=0;n<x.length;n++) {
			System.out.println(Thread.currentThread().getName()+":"+x[n]);
			dBox.put(x[n]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
