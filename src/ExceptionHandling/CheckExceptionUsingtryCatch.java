package ExceptionHandling;

public class CheckExceptionUsingtryCatch {

	public static void method1() {

		try {
			throw new ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {
		method1();

	}

}
