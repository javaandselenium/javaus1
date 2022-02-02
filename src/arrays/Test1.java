package arrays;

public class Test1 {

	public static void main(String[] args) {
  String s[]=new String[4];
  s[0]="Ramesh";
  s[1]="Suresh";
  s[2]="Ganesh";
  s[3]="Mahesh";
 
  
//  for(int i=0;i<=3;i++) {
//	  System.out.println(s[i]);
//  }

  
  for(String b:s) {
	  System.out.println(b);
  }

	}

}
