package MulthiThreading;

public class SharedResource {

	boolean itemAvalable = false;

	public synchronized void addItems() {

		System.out.println("inside adding item method");
		
		itemAvalable = true;
		notifyAll();
		System.out.println("notify realsed");
	}

	public synchronized void consumeItem() {

		System.out.println("inside consume Item method");

		try {

			System.out.println(itemAvalable);
			
			while (!itemAvalable) {
				System.out.println("status "+itemAvalable);
				System.out.println(Thread.currentThread().getName());
				System.out.println("Stared waiting");
				wait();
				System.out.println("wait completed");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("itemsSatus" + itemAvalable + Thread.currentThread().getName());
		itemAvalable = false;
	}
}
