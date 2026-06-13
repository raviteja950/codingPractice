package testing;

public class TestMain implements DemoInterface {

	public static int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		TestMain demo = new TestMain();
		DemoInterface.Eat();
		demo.shout("Hi");

		LambdaInterface lam = a -> a + 10;
		System.out.println(lam.addition(5));
		
		MethodReferceI Mlam = TestMain::mul;
		
		Mlam.multiplicaiton(1, 3);
		

	}

	@Override
	public void shout(String s) {
		System.out.println(s);

	}

}
