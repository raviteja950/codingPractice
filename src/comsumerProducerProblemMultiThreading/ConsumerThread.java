package comsumerProducerProblemMultiThreading;

public class ConsumerThread implements Runnable {

	public SharedResource resource;

	public ConsumerThread(SharedResource res) {
		this.resource = res;
	}

	@Override
	public void run() {

		System.out.println("Consumer Thread invoked");
		for (int i = 0; i < 6; i++) {

			try {
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			resource.consume();
		}
	}
}
