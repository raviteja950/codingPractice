package ExecuetorService;

import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String args[]) {

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
				new customThreadFactory(), new customRejectedExecutionHandler());

		for (int i = 0; i <= 6; i++) {
			executor.submit(() -> {
				try {
				Thread.sleep(5000);}
				catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Thread prossed by"+" "+ Thread.currentThread().getName());
			});
		}
		
		executor.shutdown();
	}
}

class customThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(1);
		return t;
	}

}

class customRejectedExecutionHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(r.toString() + " " + executor.getThreadFactory());

	}

}
