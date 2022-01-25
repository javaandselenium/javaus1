package typcasting;

public class Tea extends Coffee{
	
	public void greenTea() {
		System.out.println("greetea");
	}
	
	public void milkTea() {
		System.out.println("milktea");
	}
	
	public static void main(String[] args) {
		Coffee c=new Tea();
		Tea t=(Tea)c;
		t.blackCoffee();
		t.milkCoffee();
		t.greenTea();
		t.milkTea();
	}

}
