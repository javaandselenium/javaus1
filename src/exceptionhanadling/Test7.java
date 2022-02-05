package exceptionhanadling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {
	
	public void demo() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("./d");
	}

	public static void main(String[] args) {
		Test7 t=new Test7();

		try {
			t.demo();
			}
			catch(Exception e) {
				System.out.println("handled");
			}
		
	}

}
