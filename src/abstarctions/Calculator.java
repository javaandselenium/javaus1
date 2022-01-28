package abstarctions;

public class Calculator implements Test3{

	
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}

	
	public void sub() {

		int a=10;
		int b=20;
		System.out.println(a-b);
		
	}

	
	public void mul() {

		int a=10;
		int b=20;
		System.out.println(a*b);
		
	}
	public static void main(String[] args) {
		
	
	Calculator c=new Calculator();
	c.add();
	c.sub();
	c.mul();

}}
