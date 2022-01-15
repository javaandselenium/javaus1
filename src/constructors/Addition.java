package constructors;

public class Addition {

	public Addition(int a, int b) {
		System.out.println(a + b);
	}

	public Addition(int a, double b) {
		System.out.println(a + b);
	}

	public Addition(int a, int b, double c) {
		System.out.println(a + b + c);
	}

	public Addition(double a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
      Addition a=new Addition(10,20.89);
      Addition a1=new Addition(20.90,10,70);
      Addition a2=new Addition(10,30);
      Addition a3=new Addition(20,90,89.00);


	}

}
