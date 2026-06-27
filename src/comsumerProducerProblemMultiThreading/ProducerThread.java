package comsumerProducerProblemMultiThreading;

public class ProducerThread implements Runnable {

	public SharedResource resource;

	public ProducerThread(SharedResource res) {
		this.resource = res;
	}

	@Override
	public void run() {

		System.out.println("Producer Thread invoked");
		for (int i = 0; i < 6; i++) {
			
			try {
				Thread.sleep(4000);
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}
			resource.produce(i);
		}
	}

}
