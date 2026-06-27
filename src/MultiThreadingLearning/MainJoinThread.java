package MultiThreadingLearning;

public class MainJoinThread {

	public static void main(String args[]) {

		SharedResource resource = new SharedResource();

		System.out.println("main thread started");

		Thread t1 = new Thread(() -> {

			System.out.println("calling produce method");
			resource.produce();
		});

		t1.start();

		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("main thread completed");
	}
}
