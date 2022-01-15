package methods;

public class Test8 {

	public void add(int a,int b) {
System.out.println(a+b);
	}

	public void add(int a,double b,String c,int d) {
System.out.println(a+b+c+d);
	}

	public void add(int a,double b,double c) {
System.out.println(a+b+c);
	}

	public void add(double a,double b,int c) {
System.out.println(a+b+c);
	}

	public static void main(String[] args) {

Test8 t=new Test8();
t.add(10,20.0,30.90);
t.add(10,30.0,"Hello",20);

	}

}
