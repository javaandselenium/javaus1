package constructors;

public class Mul {

	public Mul(int a, int b) {
		System.out.println(a * b);
	}

	public Mul(int a, int b, double c) {
		this(30,10);
		System.out.println(a * b * c);
	}

	public Mul(double a, int b) {
		this(10,20,40.90);
		System.out.println(a * b);
	}

	public Mul(double a, double b) {
		this(20.90,70);
		System.out.println(a * b);
	}

	public static void main(String[] args) {
   Mul m=new Mul(20.0,70.0);


	}

}
