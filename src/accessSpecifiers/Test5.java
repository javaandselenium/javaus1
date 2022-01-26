package accessSpecifiers;

public class Test5 {
	protected int a=90;
	
	protected void add() {
		System.out.println("protected method");
	}
	
	
	protected Test5() {
		System.out.println("protected constructor");
	}
	

	public static void main(String[] args) {

Test5 t5=new Test5();
System.out.println(t5.a);
t5.add();

	}

}
