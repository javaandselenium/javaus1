package collections;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
Vector v=new Vector();
v.add(10);
v.add("Hello");
v.add('S');
v.add(10);
v.add(10);
v.add("Hello");





System.out.println(v.size() +"current size of the array");

for(int i=0;i<v.size();i++) {
	System.out.println(v.get(i));
}

System.out.println(v.capacity()+ "capacity of the array");


	}

}
