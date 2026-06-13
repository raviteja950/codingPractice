package MulthiThreading;

public class MyMultiThreading implements Runnable {

	@Override
	public void run() {
		System.out.println("myMultiThread implements Runnable class is picked "+ Thread.currentThread().getName());

	}

}
