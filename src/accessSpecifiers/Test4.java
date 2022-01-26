package accessSpecifiers;

public class Test4 {
	int a=100;
	
	void add() {
		System.out.println("default method");
	}
	
	Test4(){
		System.out.println("default constructor");
	}
	

	public static void main(String[] args) {
    Test4 t4=new Test4();
    System.out.println(t4.a);
    t4.add();

	}

}
