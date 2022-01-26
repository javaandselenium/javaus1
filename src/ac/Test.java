package ac;

import accessSpecifiers.Test1;
import accessSpecifiers.Test5;

public class Test extends Test5{

	public static void main(String[] args) {

		Test1 t=new Test1();
		System.out.println(t.a);
		t.add();
		
		Test t5=new Test();
		System.out.println(t5.a);
		t5.add();
		
	


	}

}
