package methods;

public class Test12 extends Test11{
	
	public void status() {
		System.out.println("photos and videos");
	    super.status();
	}
	
	public static void main(String[] args) {
		Test12 t=new Test12();
		t.status();
	}

}
