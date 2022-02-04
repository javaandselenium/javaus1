package exceptionhanadling;

public class Test2 {

	public static void main(String[] args) {
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;

		try {
		arr[4]=50;
	//	arr[5]=60;
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("handled 1 exp");
		}
		



		System.out.println("hello");

			}

	}

}
