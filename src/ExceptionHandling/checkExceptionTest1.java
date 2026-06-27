package ExceptionHandling;

public class checkExceptionTest1 {

	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

	public static void main(String[] args) throws ClassNotFoundException {

//		try {
//			method1();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		method1();
	}

}
