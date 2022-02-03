package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test18 {

	public static void main(String[] args) {

TreeSet t=new TreeSet<>();
t.add(20);
t.add(10);
t.add(80);
t.add(60);
t.add(50);

System.out.println(t);

//NavigableSet n = t.descendingSet();
//System.out.println(n);

System.out.println(t.descendingSet());
	}

}
