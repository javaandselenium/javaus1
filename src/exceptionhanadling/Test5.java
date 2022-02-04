package exceptionhanadling;

public class Test5 {
	
	public static void db() {
		System.out.println("opening of db");
	}

	public static void main(String[] args) {
try {
int a=1/0;
}
catch(Exception e) {
System.out.println("handling");

}

finally {
	Test5.db();
}
	}

}
