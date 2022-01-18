package conditionalStatements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
            int day=s.nextInt();
            String dayofWeek;
            
            switch(day) {
            case 1:
            	dayofWeek="Monday";
            	break;
            	
            case 2:
            	dayofWeek="Tuesday";
            	break;
            	
            case 3:
            	dayofWeek="Wednesday";
            	break;
            	
            case 4:
            	dayofWeek="Thursday";
            	break;
            
            case 5:
            	dayofWeek="Friday";
            	break;
            	
            case 6:
            	dayofWeek="Saturday";
            	break;
            	
            case 7:
            	dayofWeek="Sunday";
            	break;
            	
            	default:
            		dayofWeek="invalid day";
            }
            System.out.println(dayofWeek);

	}

}
