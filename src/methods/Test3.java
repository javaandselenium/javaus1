package methods;

public class Test3 {
	
	static int balance=1000;
	static int withdrawal=200;
	
	public static void withdrawalamt() {
		int currentbal=balance-withdrawal;
		System.out.println(currentbal);
	}
	
public static void main(String[] args) {
	withdrawalamt();


	}

}
