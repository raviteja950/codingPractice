package MulthiThreading;

public class MonitorLockThread1 implements Runnable {

	public MonitorLockExample obj;

	MonitorLockThread1(MonitorLockExample obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.task1();
	}

}
