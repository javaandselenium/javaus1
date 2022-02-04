package exceptionhanadling;

import java.io.FileInputStream;

public class Test3 {
	public void demo() {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		try {
FileInputStream fis=new FileInputStream("./d");
		}
		catch(Exception e) {
	System.out.println(e);		
		}
Test3 t=new Test3();
t.demo();

	}

}
