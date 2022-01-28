package abstarctions;

public class Payment implements Test1{

	
	public void accountNumb() {
		System.out.println("eneter the number");
	}

	
	public void password() {
System.out.println("eneter the passwords");
	}
	
	public static void main(String[] args) {
		Payment p=new Payment();
		p.accountNumb();
		p.password();
	}

}
