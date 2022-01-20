package inhertiances;

public class BasicCalculator {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		BasicCalculator b=new BasicCalculator();
		b.add(10,30);
		b.sub(30,19);
		b.mul(10,20);
	}

}
