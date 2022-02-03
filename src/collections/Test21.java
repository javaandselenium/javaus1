package collections;

import java.util.ArrayList;

public class Test21 {

	public static void main(String[] args) {

ArrayList a=new ArrayList<>();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
a.add(50);

a.add("hello");

 
for(Object q:a) {
	System.out.println(q);
}

	}

}
