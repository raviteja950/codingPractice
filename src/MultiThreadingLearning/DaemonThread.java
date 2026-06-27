package MultiThreadingLearning;

public class DaemonThread {

	public static void main(String args[]) {

		System.out.println("main started");
		SharedResource resource = new SharedResource();

		Thread th1 = new Thread(() -> {
			resource.produce();
		});

		th1.setDaemon(true);

		th1.start();
		th1.run();
		System.out.println("main completed");
	}
}
