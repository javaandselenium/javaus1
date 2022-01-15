package methods;

public class Test9 {

	public static void send(int numb,String photo) {
System.out.println(numb+photo);
	}

	public static void send(String photo,String video) {
System.out.println(photo+video);
	}

	public static void send(int numb,String location,String docs) {
System.out.println(numb+location+docs);
	}

	public static void main(String[] args) {
Test9.send(123,"amazon.png");
Test9.send(10,"USA","Java.pdf");


	}

}
