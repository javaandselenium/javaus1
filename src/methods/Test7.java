package methods;

public class Test7 {
	int a=10;
	static int c=900;
	
	public static void demo() {
		System.out.println("demo");
	}
	
	public void add() {
		System.out.println("adding");
	}
	
	public void sub() {
		System.out.println("subtarcting");
	}
	
	public static void mul() {
		System.out.println("multiplication");
	}

	public static void main(String[] args) {
     Test7 t=new Test7();
     System.out.println(t.a);
     
     System.out.println(Test7.c);
     Test7.demo();
     t.add();
     t.sub();
     
     Test7.mul();
     
     
     
     


	}

}
