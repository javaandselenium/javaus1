package exceptionhanadling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
	
	public void sample() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("hello java");
	}

	public void demo() throws FileNotFoundException {
			System.out.println("hello");
			
		FileInputStream fis=new FileInputStream("./data.properties");
		
		}

		public static void main(String[] args) throws FileNotFoundException, InterruptedException {
			Test8 t=new Test8();
			t.sample();
			
			
	}

}
