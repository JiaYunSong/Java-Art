package JProducerCosumer;

public class DataBox {
	private boolean hasData=false;
	private int data=0;
	
	public synchronized void put(int x) {
		while(hasData==true) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		data=x;hasData=true;
		notifyAll();
	}
	public synchronized int get() {
		while (hasData!=true) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		int x=data;hasData=false;
		notifyAll();
		return x;
	}
}
