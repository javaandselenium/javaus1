package accessSpecifiers;

public class Test2 {

	public static void main(String[] args) {

		Test1 t=new Test1();
		System.out.println(t.a);
		t.add();
		
		Test4 t4=new Test4();
	    System.out.println(t4.a);
	    t4.add();
	    
	    Test5 t5=new Test5();
	    System.out.println(t5.a);
	    t5.add();


	}

}
