package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test14 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add(200);
		a.add(400);
		a.add(100);
		a.add(500);
		
		System.out.println(a +"before swaping");
		
		Collections.swap(a,0,a.size()-1 );
		
		System.out.println(a +"after swaping");
	}

}
