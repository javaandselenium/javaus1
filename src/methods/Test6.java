package methods;

public class Test6 {
	static int a=100;
	int b=900;
	
	public void add() {
		System.out.println("adding numbers");
	}
	public static void sub() {
		System.out.println("subtracting numbers");
	}
	
public static void main(String[] args) {
System.out.println(Test6.a);

Test6 t=new Test6();
System.out.println(t.b);
t.add();

Test6.sub();


	}

}
