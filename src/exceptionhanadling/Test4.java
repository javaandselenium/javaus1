package exceptionhanadling;

import java.io.FileInputStream;

public class Test4 {
	public static void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		try {
		int a=1/0;
		}
		catch(ArithmeticException q) {
			System.out.println(q);
		}
	
		
		try {
		FileInputStream fis=new FileInputStream("./k");
		}
		catch(Exception e) {
			System.out.println(e+"handled");
		}
		
		System.out.println("hello");
		Test4.add();
		
	}

}
