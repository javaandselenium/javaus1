package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {

	public static void main(String[] args) {

		ArrayList a=new ArrayList();
		a.add(200);
		a.add(400);
		a.add(100);
		a.add(700);
		a.add(300);
		
		System.out.println(a +"before sorting");
		
		Collections.sort(a);
		
		System.out.println(a +"after sorting");
		
		
		

	}

}
