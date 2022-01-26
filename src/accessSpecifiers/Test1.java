package accessSpecifiers;

public class Test1 {
	
	public int a=100;
	
	public void add() {
		System.out.println("public method");
	}
	
	public Test1() {
		System.out.println("public constructor");
	}
	

	public static void main(String[] args) {
Test1 t=new Test1();
System.out.println(t.a);
t.add();



	}

}
