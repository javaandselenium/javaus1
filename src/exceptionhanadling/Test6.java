package exceptionhanadling;

import java.io.FileInputStream;

public class Test6 {
	public static void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) {

		try {
int a=1/0;
		}
		finally {
			Test6.add();
		}

	}

}
