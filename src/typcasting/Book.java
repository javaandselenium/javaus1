package typcasting;

public class Book extends Computer{
	
	public void longBook() {
		System.out.println("long book");
	}

	
	public void shortBook() {
		System.out.println("short book");
	}

	public static void main(String[] args) {
Phone p=new Computer();
p.android();
p.iphone();


Computer c=new Book();
c.mac();
c.windows();


	}

}
