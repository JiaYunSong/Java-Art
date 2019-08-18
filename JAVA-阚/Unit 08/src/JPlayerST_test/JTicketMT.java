package JPlayerST_test;

public class JTicketMT {

	public static void main(String[] args) {
		TicketBox tb = new TicketBox(4); // 创建票箱，初始化有 4 张票
		TicketWindow tw = new TicketWindow(tb); // 创建售票窗口（是一个算法对象） // 模拟 5 个售票窗口同时向 5 位客户提供售票服务
		Thread t1 = new Thread(tw, "窗口 1"); // 子线程 t1~t5 执行同样的售票算法 tw
		Thread t2 = new Thread(tw, "窗口 2");
		Thread t3 = new Thread(tw, "窗口 3");
		Thread t4 = new Thread(tw, "窗口 4");
		Thread t5 = new Thread(tw, "窗口 5"); // 启动 5 个子线程，5 个售票窗口同时开始售票
		long sTime = System.currentTimeMillis(); // 记录开始时间
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start(); // 主线程等待 5 个子线程都执行结束
		while (t1.getState() != Thread.State.TERMINATED || t2.getState() != Thread.State.TERMINATED
				|| t3.getState() != Thread.State.TERMINATED || t4.getState() != Thread.State.TERMINATED
				|| t5.getState() != Thread.State.TERMINATED) {
		} // 空循环，等待 5 个子线程结束
		long eTime = System.currentTimeMillis(); // 记录结束时间
		System.out.println("用时: " + (eTime - sTime) / 1000.0 + "秒");
	}

}

class TicketBox { // 描述票箱的类 TicketBox
	private int num = 0; // 剩余票数

	public TicketBox(int x) {
		num = x;
	} // 构造方法

	public int get() {
		return num;
	} // 读取剩余票数

	public void set(int x) {
		num = x;
	} // 设置剩余票数
}

class TicketWindow implements Runnable { // 实现 Runnable 接口才能在线程中运行
	private TicketBox tBox; // 从票箱对象 tBox 中取票

	public TicketWindow(TicketBox p) // 构造方法
	{
		tBox = p;
	}

	public void prepare() { // 模拟售票前的一些准备工作，例如询问出发日期、目的地等
		System.out.println(Thread.currentThread().getName() + ": 购票前准备 ...");
		try {
			Thread.sleep(100); // 休眠（暂停）0.1 秒，模拟购票前的准备工作
		} catch (InterruptedException e) // 捕捉 sleep()方法可能抛出的异常
		{
			System.out.println(e.getMessage());
			return;
		}
	}

	synchronized public void sale() { // 具体的售票算法
		int tickets = tBox.get(); // 读取剩余票数
		if (tickets > 0) { // 如果有票
			tickets--; // 售出一张票，将剩余票数减一
			tBox.set(tickets); // 设置票箱的剩余票数
			System.out.println(Thread.currentThread().getName() + ": 成功，剩余票数 " + tickets);
		} else
			System.out.println(Thread.currentThread().getName() + ": 无票"); // 无票
	}

	@Override
	public void run() { // 必须实现 run()方法，描述可在线程中运行的售票服务算法
		prepare(); // 模拟售票前的准备工作
		sale(); // 模拟售票
	}
}