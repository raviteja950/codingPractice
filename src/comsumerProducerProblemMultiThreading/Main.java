package comsumerProducerProblemMultiThreading;

public class Main {

	public static void main(String[] args) {

		SharedResource shared = new SharedResource(3);
		ProducerThread p = new ProducerThread(shared);
		ConsumerThread c = new ConsumerThread(shared);

		Thread pt = new Thread(p);
		Thread ct = new Thread(c);

		pt.start();
		ct.start();
	}
}
