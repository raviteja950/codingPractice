package MulthiThreading;

public class Main {

	public static void main(String args[]) {

		System.out.println("Start" + " " + Thread.currentThread().getName());
		MyMultiThreading runnable = new MyMultiThreading();
		Thread t = new Thread(runnable);
		t.run();
		System.out.println("finish" + " " + Thread.currentThread().getName());

		MulteThreadingextendendThread t1 = new MulteThreadingextendendThread();
		t1.start();

		///////////////////////////////////////////////

		MonitorLockExample obj = new MonitorLockExample();

		MonitorLockThread1 objRunnable = new MonitorLockThread1(obj);

		Thread thread1 = new Thread(objRunnable);
		Thread thread2 = new Thread(() -> obj.task2());
		Thread thread3 = new Thread(() -> obj.task3());

		thread1.start();
		thread2.start();
		thread3.start();

	}
}
