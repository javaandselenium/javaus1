package exceptionhanadling;

public class Test0 {

	public static void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {

		try {
			int i = 1 / 0;
		} catch (ArithmeticException a) {
			System.out.println("handled");
			System.out.println(a);
		}
		System.out.println("hello");
		Test0.add();

	}

}
