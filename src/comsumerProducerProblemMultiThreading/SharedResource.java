package comsumerProducerProblemMultiThreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

	public int bufferSize;
	public Queue<Integer> sharedBuffer;

	public SharedResource(int size) {
		sharedBuffer = new LinkedList<Integer>();
		this.bufferSize = size;
	}

	public synchronized void produce(int item) {

		try {
			while (sharedBuffer.size() == bufferSize) {

				System.out.println("buffer size is full");
				System.out.println("waiting in produce");
				wait();
			}
			sharedBuffer.add(item);
			System.out.println("Item :" + item + " added in to sharedBuffer");
			notify();
			System.out.println("Rtention locked realsed from produce");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public synchronized int consume() {

		int result = 0;
		try {

			while (sharedBuffer.isEmpty()) {
				System.out.println("sharedBuffer is empty");
				System.out.println("Waiting in consume");
				wait();
			}

			result = sharedBuffer.poll();
			System.out.println("Item :" + result + " removed in to sharedBuffer");
			notify();
			System.out.println("retention lockrealsed from consume");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}
}
