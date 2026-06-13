package MulthiThreading;

public class SharedResourceMain {

	public static void main(String args[]) {

		SharedResource resource = new SharedResource();

		productClass productClass = new productClass(resource);

		Thread t1 = new Thread(productClass);
		Thread t2 = new Thread(() -> resource.consumeItem());

		t1.start();
		t2.start();
	}
}
