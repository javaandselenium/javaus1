package accessSpecifiers;

public class Test3 {
	private int a=100;
	
	private void add() {
		System.out.println("private method");
	}
	
	private Test3() {
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
    Test3 t3=new Test3();
    t3.add();
    System.out.println(t3.a);
    
    Test4 t4=new Test4();
    System.out.println(t4.a);
    t4.add();


	}

}
