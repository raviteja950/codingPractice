package MulthiThreading;

public class productClass implements Runnable {

	SharedResource resource;

	public productClass(SharedResource res) {
		this.resource = res;
	}

	@Override
	public void run() {
		try {
			System.out.println("inside run method of product add items");
			Thread.sleep(7000);
			System.out.println("sleep complated");
		} catch (Exception e) {
			// TODO: handle exception
		}
		resource.addItems();
	}

}
