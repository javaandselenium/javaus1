package conditionalStatements;

import java.util.Scanner;

public class Test0 {

	public static void main(String[] args) {
//        int amt=2000;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amount");
		int amt = s.nextInt();
        
        if(amt>=500) {
        	System.out.println("withdraw the amount");
        }
        else
        {
        	System.out.println("you cannot withdraw the amount");
        }

	}

}
