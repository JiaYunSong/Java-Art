package JPlayerST_test;

public class JTicketMT {

	public static void main(String[] args) {
		TicketBox tb = new TicketBox(4); // ����Ʊ�䣬��ʼ���� 4 ��Ʊ
		TicketWindow tw = new TicketWindow(tb); // ������Ʊ���ڣ���һ���㷨���� // ģ�� 5 ����Ʊ����ͬʱ�� 5 λ�ͻ��ṩ��Ʊ����
		Thread t1 = new Thread(tw, "���� 1"); // ���߳� t1~t5 ִ��ͬ������Ʊ�㷨 tw
		Thread t2 = new Thread(tw, "���� 2");
		Thread t3 = new Thread(tw, "���� 3");
		Thread t4 = new Thread(tw, "���� 4");
		Thread t5 = new Thread(tw, "���� 5"); // ���� 5 �����̣߳�5 ����Ʊ����ͬʱ��ʼ��Ʊ
		long sTime = System.currentTimeMillis(); // ��¼��ʼʱ��
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start(); // ���̵߳ȴ� 5 �����̶߳�ִ�н���
		while (t1.getState() != Thread.State.TERMINATED || t2.getState() != Thread.State.TERMINATED
				|| t3.getState() != Thread.State.TERMINATED || t4.getState() != Thread.State.TERMINATED
				|| t5.getState() != Thread.State.TERMINATED) {
		} // ��ѭ�����ȴ� 5 �����߳̽���
		long eTime = System.currentTimeMillis(); // ��¼����ʱ��
		System.out.println("��ʱ: " + (eTime - sTime) / 1000.0 + "��");
	}

}

class TicketBox { // ����Ʊ����� TicketBox
	private int num = 0; // ʣ��Ʊ��

	public TicketBox(int x) {
		num = x;
	} // ���췽��

	public int get() {
		return num;
	} // ��ȡʣ��Ʊ��

	public void set(int x) {
		num = x;
	} // ����ʣ��Ʊ��
}

class TicketWindow implements Runnable { // ʵ�� Runnable �ӿڲ������߳�������
	private TicketBox tBox; // ��Ʊ����� tBox ��ȡƱ

	public TicketWindow(TicketBox p) // ���췽��
	{
		tBox = p;
	}

	public void prepare() { // ģ����Ʊǰ��һЩ׼������������ѯ�ʳ������ڡ�Ŀ�ĵص�
		System.out.println(Thread.currentThread().getName() + ": ��Ʊǰ׼�� ...");
		try {
			Thread.sleep(100); // ���ߣ���ͣ��0.1 �룬ģ�⹺Ʊǰ��׼������
		} catch (InterruptedException e) // ��׽ sleep()���������׳����쳣
		{
			System.out.println(e.getMessage());
			return;
		}
	}

	synchronized public void sale() { // �������Ʊ�㷨
		int tickets = tBox.get(); // ��ȡʣ��Ʊ��
		if (tickets > 0) { // �����Ʊ
			tickets--; // �۳�һ��Ʊ����ʣ��Ʊ����һ
			tBox.set(tickets); // ����Ʊ���ʣ��Ʊ��
			System.out.println(Thread.currentThread().getName() + ": �ɹ���ʣ��Ʊ�� " + tickets);
		} else
			System.out.println(Thread.currentThread().getName() + ": ��Ʊ"); // ��Ʊ
	}

	@Override
	public void run() { // ����ʵ�� run()���������������߳������е���Ʊ�����㷨
		prepare(); // ģ����Ʊǰ��׼������
		sale(); // ģ����Ʊ
	}
}