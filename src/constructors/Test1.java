package constructors;

public class Test1 {
	int a=100;
	
	public void add() {
		int a=10;
		int b=30;
		System.out.println("non static method "+a+b);
	}
	
	public static void sub(int a,int b) {
		System.out.println("Static method "+a*b);
	}
	
	public Test1() {
		int a=100;
		int b=50;
		System.out.println("constructors ");
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		System.out.println("varible "+t.a);
		t.add();
		
		Test1.sub(10,2);
		
	}

}
