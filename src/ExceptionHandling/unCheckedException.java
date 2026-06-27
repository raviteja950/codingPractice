package ExceptionHandling;

public class unCheckedException {

	public static void method2() {
		throw new ArithmeticException();
	}

	public static void test1() {
		int a[] = new int[2];
		System.out.println(a[3]);
	}
	
	public static void test2() {
		System.out.println(2/0);
	}

	public static void main(String[] args) {
		method2();
		test1();
		test2();

	}

}
