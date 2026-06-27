package MultiThreadingLearning;

public class SharedResource {

	public synchronized void produce() {
		System.out.println("locked");
		try {
			System.out.println("sleeping for 6 sec");
			Thread.sleep(6000);
		} catch (Exception e) {
		}
		System.out.println("lock realsed");
	}
}
