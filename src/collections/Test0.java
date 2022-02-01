package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
ArrayList a=new ArrayList();
a.add(10);
a.add(20.90);
a.add("Hello");
a.add("");
a.add(10);
a.add(true);
a.add('A');
a.add(788);

System.out.println(a.size());

System.out.println(a.get(2)+"the value at index 2");

for(int i=0;i<a.size();i++) {
	System.out.println(a.get(i));
}


	}

}
