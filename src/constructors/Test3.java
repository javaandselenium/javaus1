package constructors;

public class Test3 {
	
	public Test3(int a,int b) {
		System.out.println(a+b);
	}
	
	public Test3() {
		int a=90;
		int b=80;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
     Test3 t=new Test3();
     Test3 t1=new Test3();
     Test3 t2=new Test3(20,70);
     

	}

}
