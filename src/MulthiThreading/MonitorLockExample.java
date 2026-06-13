package MulthiThreading;

public class MonitorLockExample {

	public synchronized void task1() {

		try {
			System.out.println("inside task 1");
			Thread.sleep(10000);
			System.out.println("Sleep completed");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void task2() {
		System.out.println("before synchronized inside task 2");
		synchronized (this) {
			System.out.println("after synchronized inside task 2");
		}
	}

	public void task3() {
		System.out.println("inside task3");
	}

}
