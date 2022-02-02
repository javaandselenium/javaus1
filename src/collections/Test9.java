package collections;

import java.util.TreeMap;

public class Test9 {

	public static void main(String[] args) {

TreeMap<String,Integer> t=new TreeMap<String,Integer>();
t.put("Ramesh", 10);
t.put("Ganesh", 20);
t.put("Suresh", 10);
t.put("Mahesh", 100);
t.put("Suresh", 10);

System.out.println(t);

	}

}
