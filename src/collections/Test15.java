package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test15 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add(20.90);
		a.add(400);
		a.add(100);
		a.add("Hello");
		a.add(700);
		a.add("Hi");
		
		System.out.println(a +"before swaping");
		
		Collections.swap(a,3,a.size()-2);
		
		
		System.out.println(a +"after swaping");
		
		
		

	}

}
