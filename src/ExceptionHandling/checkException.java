package ExceptionHandling;

public class checkException {

	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		method1();

	}

}
