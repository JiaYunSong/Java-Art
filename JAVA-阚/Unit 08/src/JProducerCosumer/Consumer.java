package JProducerCosumer;

public class Consumer implements Runnable {
	private DataBox dBox;
	public Consumer(DataBox d) {
		dBox=d;
	}
	public void run() {
		while(true) {
			int x=dBox.get();
			if(x==-1) {
				System.out.println("\t"+Thread.currentThread().getName()+":Êý¾Ý½áÊø");
				return;
			}
			System.out.println("\t"+Thread.currentThread().getName()+":"+x*x);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
		}
	}
}
