package Automic;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

	// int counter = 0;

	AtomicInteger counter = new AtomicInteger(0);

	public int getCounter() {
		return counter.get();
	}

	public void increment() {
		counter.incrementAndGet();
	}

}
