package abstarctions;

public class Child extends Parent1 implements Parent2,Parent3{

	@Override
	public void bike() {

System.out.println("bike from parent 3");
		
	}

	@Override
	public void house() {

System.out.println("house from parent 2");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.bike();
		c.house();
		c.car();
	}

}
