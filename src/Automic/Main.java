package Automic;

public class Main {

	public static void main(String args[]) {

		SharedResource resource = new SharedResource();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 400; i++) {
				resource.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 400; i++) {
				resource.increment();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(resource.getCounter());
	}
}
