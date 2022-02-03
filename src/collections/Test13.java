package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test13 {

	public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add(200);
a.add(400);
a.add(100);
a.add(500);

for(Object options:a) {
	System.out.println(options);
}

Collections.shuffle(a);
System.out.println(a +"after shuffling");

	}

}
