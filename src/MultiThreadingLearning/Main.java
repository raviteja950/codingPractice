package MultiThreadingLearning;

public class Main {

	public static void main(String args[]) {

		System.out.println("main thread stared");
		SharedResource resource = new SharedResource();

		Thread th1 = new Thread(() -> {
			System.out.println("th1 is calling produce");
			resource.produce();
		});
		Thread th2 = new Thread(() -> {
			
			try {
				Thread.sleep(2000);
				
			}catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("th2 is calling produce");
			resource.produce();
		});

		th1.start();
		th2.start();

		

		try {
			Thread.sleep(8000);
		} catch (Exception e) {
		}
		
		System.out.println("t1 suspended");
		th1.suspend();

		System.out.println("main completed");
		th1.resume();

	}
}
