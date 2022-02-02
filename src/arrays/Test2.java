package arrays;

public class Test2 {

	public static void main(String[] args) {
    int a[]=new int[5];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;
    a[4]=50;
    
//    for(int i=4;i>=0;i--) {
//    	System.out.println(a[i]);
//    }
    
    for(int b:a) {
    	System.out.println(b);
    }


	}

}
