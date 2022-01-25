package Polymorphism;

public class Test1 {

	public static void main(String[] args) {
	Ecommerce e=new Ebay();
	e.shopping();
	
	Ecommerce e1=new Amazon();
	e1.shopping();
	
	Ecommerce e2=new Flipkart();
	e2.shopping();
	
	
	
		
		

	}

}
