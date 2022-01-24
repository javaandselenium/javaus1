package methods;

public class Chrome2 extends Chrome1{
	
	public void plugin() {
		System.out.println("add multiple plugins");
	    super.plugin();
	}

	public static void main(String[] args) {
Chrome2 c=new Chrome2();
c.plugin();


	}

}
